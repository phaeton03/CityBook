package com.company.city.service.comparators;

import java.util.Comparator;
import com.company.city.City;

/*Сортировка списка городов по федеральному округу и
наименованию города внутри каждого федерального округа
в алфавитном порядке по убыванию с учетом регистра;*/
public class ComparatorByDistrictAndCityDescCaseSensitive implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        int districtResult = o1.getDistrict().compareTo(o2.getDistrict()) * -1;
        int citynameResult = o1.getName().compareTo(o2.getName()) * -1;
        if(districtResult != 0)
            return districtResult;
        else return citynameResult;
    }
}
