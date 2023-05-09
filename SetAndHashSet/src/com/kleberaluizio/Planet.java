package com.kleberaluizio;

import java.util.HashSet;
import java.util.Set;

public class Planet extends HeavenlyBody implements hasSatellites{
    private final Set<HeavenlyBody> satellites;

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
        this.satellites = new HashSet<>();
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon){
        if(moon.getKey().getBodyType() == BodyType.MOON) {
            ((Moon) moon).setPlanet(this);
            return this.satellites.add(moon);
        } else {
            return false;
        }
    }

    @Override
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
}
