package com.kleberaluizio;

public class Moon extends HeavenlyBody{
    private HeavenlyBody planet;

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.MOON);
    }

    public void setPlanet(HeavenlyBody planet) {
        this.planet = planet;
    }

    public String getPlanet() {
        return planet.getKey().getName();
    }
}
