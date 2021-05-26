package com.company.city;

import com.company.city.dao.CityDAO;
import com.company.city.dao.CityDaoImpl;
import com.company.city.service.CityService;
import com.company.city.service.comparators.ChainComparator;
import com.company.city.service.comparators.ComparatorByDistrictAndCityDescCaseSensitive;
import com.company.city.service.comparators.ComparatorByNameDescIgnoreCase;
import com.company.city.db.CityBook;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Main - класс в котором мы отображаем список городов
 * сортируя их по заданнанным параметрам
 * (по имени порядке по убыванию, без учета регистра и по в порядке убывания по имени и названию федерального
 * округа с учетом регистра), а также отображение наиболее населенного города и
 * отображение количество регионов в каждом регионею
 * @author Nikolay Nikolskii
 * @version %I%, %G%
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        CityDAO cityDAO = new CityDaoImpl();
        CityService service = new CityService(cityDAO);
	    service.readFileCities("src/main/resources/Cities.txt");
        System.out.println("------Show Max populated City---------");
        service.printMaxPopCity();
        System.out.println("------Show Number of Cities in Region--------");
        service.printNumberCitiesInRegion();
        service.sortCities(new ComparatorByNameDescIgnoreCase());
        service.showCities();
        service.sortCities(new ComparatorByDistrictAndCityDescCaseSensitive());
        service.showCities();

        /** - Демонстрация работы цепочки компораторов из n-количества Компараторов по произвольным значениям */
        ChainComparator chainComparator = new ChainComparator(
                Arrays.asList(Comparator.comparing(City::getDistrict),
                Comparator.comparing(City::getName), Comparator.comparing(City::getPopulation)));
        service.sortCities(chainComparator);
        service.showCities();
    }
}
