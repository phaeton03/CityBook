package com.company.city.service.comparators;

import com.company.city.City;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorByDistrictAndCityDescCaseSensitiveTest {
    ComparatorByDistrictAndCityDescCaseSensitive descIgnoreCaseComp = new ComparatorByDistrictAndCityDescCaseSensitive();
    @Test
    public void testEqual() {
        City city1 = new City(1l, "A", "Region", "D1", 100, 43);
        City city2 = new City(1l, "A", "Region", "D1", 100, 43);
        int result = descIgnoreCaseComp.compare(city1,city2);
        assertTrue(result == 0);
    }
    @Test
    public void testGreaterThan() {
        City city1 = new City(1l, "A", "Region", "D1", 100, 43);
        City city2 = new City(1l, "b", "Region", "D1", 100, 43);
        int result = descIgnoreCaseComp.compare(city1,city2);
        assertTrue(result >= 1);
    }
    @Test
    public void testLessThan() {
        City city1 = new City(1l, "B", "Region", "D1", 100, 43);
        City city2 = new City(1l, "A", "Region", "D1", 100, 43);
        int result = descIgnoreCaseComp.compare(city1,city2);
        assertTrue(result <= -1);
    }

}