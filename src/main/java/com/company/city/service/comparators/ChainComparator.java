package com.company.city.service.comparators;

import com.company.city.City;

import java.util.*;

/*ChainComparator for using multiple sorting filters*/
public class ChainComparator implements Comparator<City> {
    private List<Comparator<City>> comparatorList;

    public ChainComparator(List<Comparator<City>> comparatorList) {
        this.comparatorList = comparatorList;
    }
    @Override
    public int compare(City o1, City o2) {
        int result;
        for(Comparator<City> comp : comparatorList)
            if((result = comp.compare(o1,o2)) != 0)
                return result;
        return 0;
    }
}
