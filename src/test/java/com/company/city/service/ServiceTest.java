package com.company.city.service;

import com.company.city.City;
import com.company.city.dao.CityDAO;
import com.company.city.dao.CityDaoImpl;
import com.company.city.db.CityBook;
import com.company.city.service.comparators.ComparatorByDistrictAndCityDescCaseSensitive;
import com.company.city.service.comparators.ComparatorByNameDescIgnoreCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    City city1 = new City(1l, "Moscow", "Moscow", "Moscow", 10_000,900);
    City city2 = new City(2l, "Moscow", "Moscow", "Moscow", 100_000,900);
    City city3 = new City(3l, "Moscow", "Florida", "Moscow", 100,900);

    @Test
    public void printMaxPopCity() {
        CityDAO cityBook = new CityDaoImpl();
        cityBook.updateCity(city1);
        cityBook.updateCity(city2);
        cityBook.updateCity(city3);
        City[] cities = new City[cityBook.getAllCities().size()];
        cityBook.getAllCities().toArray(cities);
        City city = Arrays.stream(cities).max(Comparator.comparing(City::getPopulation)).get();
        assertEquals(100_000, city.getPopulation());
      }
      @Test
      public void printNumberCitiesInRegion() {
          CityDAO cityBook = new CityDaoImpl();
          cityBook.updateCity(city1);
          cityBook.updateCity(city2);
          cityBook.updateCity(city3);
          Map<String, Long> collect = cityBook.getAllCities().stream().collect(Collectors.groupingBy(City::getRegion, Collectors.counting()));
          assertTrue(collect.get("Moscow") == 2);
          assertTrue(collect.get("Florida") == 1);
      }
    @DisplayName("Check Sorting Cities By Name in Descending order CaseInsensentive")
    @Test
    void testSortCitiesByNameDescCaseInsensetive() {
        CityDAO cityDAO = new CityDaoImpl();
        CityDAO cityDAOTest = new CityDaoImpl();
        CityService service = new CityService(cityDAO);
        CityService serviceTest = new CityService(cityDAOTest);
        service.readFileCities("src/main/resources/test1.txt");
        assertNotNull(cityDAO.getAllCities());
        serviceTest.readFileCities("src/main/resources/checkTest1.txt");
        assertNotNull(cityDAOTest.getAllCities());
        service.sortCities(new ComparatorByNameDescIgnoreCase());
        for(int i = 0; i < cityDAO.getAllCities().size(); i++) {
            assertEquals(cityDAO.getCity(i).getName(), cityDAOTest.getCity(i).getName());
        }
    }
    @DisplayName("Check Sorting Cities By District and Name CaseSensetive Mode")
    @Test
    void testSortCitiesByDistrictAndNameCaseSensitive() {
        CityDAO cityDAO = new CityDaoImpl();
        CityDAO cityDAOTest = new CityDaoImpl();
        CityService service = new CityService(cityDAO);
        CityService serviceTest = new CityService(cityDAOTest);
        service.readFileCities("src/main/resources/test1.txt");
        assertNotNull(cityDAO.getAllCities());
        serviceTest.readFileCities("src/main/resources/checkTest2.txt");
        assertNotNull(cityDAOTest.getAllCities());
        service.sortCities(new ComparatorByDistrictAndCityDescCaseSensitive());
        for(int i = 0; i < cityDAO.getAllCities().size(); i++) {
            assertEquals(cityDAO.getCity(i).getName(), cityDAOTest.getCity(i).getName());
        }
    }
}