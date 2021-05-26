package com.company.city.service.comparators;

import com.company.city.City;

import java.util.*;
/*•	Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;*/
public class ComparatorByNameDescIgnoreCase implements Comparator<City>
{
    @Override
    public int compare(City o1, City o2) {
        int result = o1.getName().compareToIgnoreCase(o2.getName()) * -1;
        return result;
    }
}
