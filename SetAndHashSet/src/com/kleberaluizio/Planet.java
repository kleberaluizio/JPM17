package com.kleberaluizio;

import java.util.HashSet;
import java.util.Set;

public class Planet extends HeavenlyBody implements hasSatellites{
    private final Set<HeavenlyBody> satellites;

    public Planet(String name, double orbitalPeriod, BodyType bodyType) {
        super(name, orbitalPeriod, bodyType);
        this.satellites = new HashSet<>();
    }

    public boolean addMoon(Moon moon){
        moon.setPlanet(this);
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
}
