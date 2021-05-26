package com.company.city.dao;

import com.company.city.City;

import java.util.List;

public interface CityDAO {
     List<City> getAllCities();
     City getCity(int rollNo);
     void updateCity(City city);
     void deleteCity(City city);
}
