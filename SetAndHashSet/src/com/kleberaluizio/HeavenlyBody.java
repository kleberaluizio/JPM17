package com.kleberaluizio;

enum BodyType {
    PLANET, MOON, STAR, COMET, ASTEROID, DWARF_PLANET
}

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.key = new Key(name,bodyType);
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public final boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
//            if(this.name.equals(theObject.getName())  && this.orbitalPeriod == theObject.getOrbitalPeriod()){
//                return this.bodyType == theObject.getBodyType();
//            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public Key getKey() {
        return key;
    }
    public static Key makeKey(String name, BodyType bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.getName() + " : "+ this.key.bodyType + ", "+this.orbitalPeriod;
    }
    public static final class Key {
        private String name;
        private BodyType bodyType;

        private Key(String name, BodyType bodyType){
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())) {
                return (this.bodyType == key.getBodyType());
            }
            return false;
        }
    }
}
