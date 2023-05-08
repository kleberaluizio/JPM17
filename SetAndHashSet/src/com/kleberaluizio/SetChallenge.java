package com.kleberaluizio;

import java.util.HashSet;
import java.util.Set;

public class SetChallenge {
    private static Set<HeavenlyBody> solarSystem = new HashSet<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Set<HeavenlyBody> moons = new HashSet<>();


    public static void main(String[] args){
        Planet temp = new Planet("Mercury", 88, BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Venus", 25,BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Earth", 365,BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        Moon tempMoon = new Moon("Moon", 27,BodyType.MOON);
        solarSystem.add(tempMoon);
        moons.add(tempMoon);
        temp.addMoon(tempMoon);

        temp = new Planet("Mars", 687,BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3,BodyType.MOON);
        solarSystem.add(tempMoon);
        moons.add(tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new Moon("Phobos", 0.3,BodyType.MOON);
        solarSystem.add(tempMoon);
        moons.add(tempMoon);
        temp.addMoon(tempMoon);

        printSolarSystem(solarSystem);
        System.out.println("=".repeat(100));

        temp = new Planet("Jupiter", 4332,BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8,BodyType.MOON);
        solarSystem.add(tempMoon);
        moons.add(tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new Moon("Europa", 3.5,BodyType.MOON);
        solarSystem.add(tempMoon);
        moons.add(tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1,BodyType.MOON);
        solarSystem.add(tempMoon);
        moons.add(tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new Moon("Callisto", 16.7,BodyType.MOON);
        solarSystem.add(tempMoon);
        moons.add(tempMoon);
        temp.addMoon(tempMoon);

        temp = new Planet("Saturn", 10759,BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660,BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165,BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248,BodyType.PLANET);
        solarSystem.add(temp);
        planets.add(temp);

        printSolarSystem(solarSystem);
        System.out.println("=".repeat(100));

        printSet(planets);
        printSet(moons);
    }
//    public static void printSolarSystem(Map<String, HeavenlyBody> solarSystem){
//        for(String s : solarSystem.keySet()){
//            if(solarSystem.get(s).getBodyType() == BodyType.PLANET){
//            System.out.println(solarSystem.get(s).getName() + " is a " +solarSystem.get(s).getBodyType());
//            } else{
//
//                System.out.println(solarSystem.get(s).getName() + " is a " +solarSystem.get(s).getBodyType() + " of "+((Moon) solarSystem.get(s)).getPlanet());
//
//            }
//        }
//    }
    public static void printSolarSystem(Set<HeavenlyBody> solarSystem){
        for(HeavenlyBody s : solarSystem){
            System.out.println(s.getName() + " : " + s.getBodyType());
        }
    }
    public static void printSet(Set<HeavenlyBody> set){
        System.out.print("\t");
        for(HeavenlyBody s : set){
            System.out.print(s.getName() + " ");
        }
        System.out.println();
    }
}
