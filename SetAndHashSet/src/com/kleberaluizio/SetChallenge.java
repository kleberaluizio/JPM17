package com.kleberaluizio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {
    private final static Map<HeavenlyBody.Key,HeavenlyBody> solarSystem = new HashMap<>();
    private final static Set<HeavenlyBody> planets = new HashSet<>();
    private final static Set<HeavenlyBody> moons = new HashSet<>();


    public static void main(String[] args){
        Planet temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(),temp);        
        planets.add(temp);

        temp = new Planet("Venus", 25);
        solarSystem.put(temp.getKey(),temp);        
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(),temp);        
        planets.add(temp);

        Moon tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(),temp);        
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(),temp);        
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(),temp);        
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(),temp);        
        planets.add(temp);

        DwarfPlanet tempD = new DwarfPlanet("Pluto", 248);
        solarSystem.put(tempD.getKey(),tempD);
        planets.add(tempD);

        HeavenlyBody pluto = new Planet("Pluto", 842);
        solarSystem.put(pluto.getKey(),pluto);
        planets.add(pluto);

        System.out.println("Planets");
        printSet(planets);

        System.out.println("Moons of Mars");
        printSet(((Planet)solarSystem.get(HeavenlyBody.makeKey("Mars",BodyType.PLANET))).getSatellites());

        System.out.println("All Moons");
        printSet(moons);

        System.out.println("The solar system contains:");
        for(HeavenlyBody.Key k : solarSystem.keySet()){
            System.out.println(solarSystem.get(k));
        }

//        System.out.println("Checking a.equals(b) and b.equals(a)");
//        Moon a = new Moon("Artemis",12);
//        Moon b = new Moon("Artemis",12.0000);
//        System.out.println(a.equals(b));
//
//        System.out.println("Checking a.equals(b) and b.equals(a)");
//        HeavenlyBody c = new Planet("Artemis",12);
//        HeavenlyBody d = new Planet("Artemis",12.0000);
//        System.out.println(a.equals(c));

    }

    public static void printSolarSystem(Set<HeavenlyBody> solarSystem){
        for(HeavenlyBody s : solarSystem){
//            System.out.println(s.getName() + " : " + s.getBodyType());
            System.out.println(s.toString());
        }
    }
    public static void printSet(Set<HeavenlyBody> set){
        for(HeavenlyBody s : set){
            System.out.println("\t"+ s.getKey().getName());
        }
        System.out.println();
    }
}
