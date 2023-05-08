package com.kleberaluizio;

public class Moon extends HeavenlyBody{
    private HeavenlyBody planet;

    public Moon(String name, double orbitalPeriod, BodyType bodyType) {
        super(name, orbitalPeriod, bodyType);
    }

    public void setPlanet(HeavenlyBody planet) {
        this.planet = planet;
    }

    public String getPlanet() {
        return planet.getName();
    }
}
