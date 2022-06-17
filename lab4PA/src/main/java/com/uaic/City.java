package com.uaic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class City {
    //map to describe the city
    Map<Intersection, List<Street>> cityMap = new HashMap<>();

    //query that choose the streets with a length > 1 and joins at least 3 streets
    public List<Street> strazi(){
        List<Street> newStreetList = cityMap.values().stream()
                .filter(v -> v.size() >= 3)
                .flatMap(l -> l.stream())
                .filter(u -> u.getLength() > 1)
                .collect(Collectors.toList());
        return newStreetList;
    }

    public void addToCity(Intersection i, List<Street> strazi){
        this.cityMap.put(i,strazi);
    }

    @Override
    public String toString() {
        return "City{" +
                "cityMap=" + cityMap +
                '}';
    }
}
