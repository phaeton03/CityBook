package com.company.city.dao;

import com.company.city.City;
import com.company.city.db.CityBook;

import java.util.*;

public class CityDaoImpl implements CityDAO {
    List<City> cities;
    public CityDaoImpl() {
        cities = new CityBook().cities;
    }

    @Override
    public List<City> getAllCities() {
        return cities;
    }

    @Override
    public City getCity(int rollNo) {
        return cities.get(rollNo);
    }

    @Override
    public void updateCity(City city) {
        cities.add(city);
    }

    @Override
    public void deleteCity(City city) {
        cities.remove(city);
    }
}
