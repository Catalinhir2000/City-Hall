package com.uaic;
import com.github.javafaker.Faker;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Faker faker = new Faker();
        Random rand = new Random();

        System.out.println( "Hello World!" );
        //creating intersections with streams
        var nodes = IntStream.rangeClosed(0, 9)
                .mapToObj(i -> new Intersection(faker.address().buildingNumber()) )
                .toArray(Intersection[]::new);

        Map<Intersection, List<Street>> cityMap = new HashMap<>();


        //creating streets with streams as a list of streets using linkedlists
        List<Street> streetList = IntStream.rangeClosed(0,16)
                .mapToObj(i -> new Street(faker.address().streetName(), rand.nextInt(5) + 1))
                .collect(Collectors.toCollection(LinkedList::new));

        Collections.sort(streetList,
                ((u, v) -> Integer.compare(u.getLength(),v.getLength())));

        Collections.sort(streetList,
                Comparator.comparing(Street::getLength));


        System.out.println(streetList);

        //creating a set of intersections using hash set, it does verify that the set will not contain duplicates
        Set<Intersection> intersectii = new HashSet<>();

        intersectii.add(nodes[1]);
        intersectii.add(nodes[1]);
        intersectii.add(nodes[2]);

        System.out.println(intersectii);

        City orasmap = new City();
        orasmap.addToCity(nodes[0], Arrays.asList(streetList.get(0),  streetList.get(1), streetList.get(2), streetList.get(3)));
        orasmap.addToCity(nodes[2], Arrays.asList(streetList.get(5)));

        System.out.println(orasmap.strazi());
        System.out.println(orasmap);

        //System.out.println(newStreetList);






        //cityMap.put(intersection, Arrays.asList(e[0], e[1], e[2]));

    }

}
