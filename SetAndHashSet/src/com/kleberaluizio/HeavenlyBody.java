package com.kleberaluizio;

enum BodyType {
    PLANET, MOON, STAR, COMET, ASTEROID, DWARF_PLANET
}
public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final BodyType bodyType;

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyType getBodyType() {
        return bodyType;
    }



    @Override
    public final boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if(this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + " : "+ this.bodyType + ", "+this.orbitalPeriod;
    }
}
