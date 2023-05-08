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
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is "+ obj.getClass());
        System.out.println("this.getClass() is "+ this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
//        System.out.println("Hashcode Called!");
        return this.name.hashCode() + 57;
    }

}
