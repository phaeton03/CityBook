package com.company.city.service;

import com.company.city.City;
import com.company.city.dao.CityDAO;
import com.company.city.dao.CityDaoImpl;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class CityService {
    CityDAO cdi;

    public CityService(CityDAO cdi) {
        this.cdi = cdi;
    }
    public void showCities() {
        System.out.println("======================================");
        cdi.getAllCities().stream().forEach(System.out::println);
        System.out.println("======================================");
    }
    public void sortCities(Comparator<City> comp) {
        cdi.getAllCities().sort(comp);
    }
    public void printMaxPopCity() {
        List<City> list = cdi.getAllCities();
        City[] cities = new City[list.size()];
        list.toArray(cities);
        City city = Arrays.stream(cities).max(Comparator.comparing(City::getPopulation)).get();
        System.out.printf("[%d] = %d\n", city.getId(), city.getPopulation());
    }
    public void printNumberCitiesInRegion() {
        List<City> list = cdi.getAllCities();
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(City::getRegion, Collectors.counting()));
        collect.entrySet().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
    public void readFileCities(String fileName)  {
        File file = new File(fileName);
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split("\\.*;\\.*");
                long id = Long.parseLong(line[0]);
                String name = line[1];
                String region = line[2];
                String district = line[3];
                int population = Integer.parseInt(line[4]);
                int foundation = Integer.parseInt(line[5]);
                City city = new City(id, name, region, district, population, foundation);
                cdi.updateCity(city);
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
