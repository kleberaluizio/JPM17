public class Fish extends Animal {

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }
    private void moveMuscles(){
        System.out.print("muscles moving ");
    }
    private void moveBackFin(){
        System.out.print("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    public int getFins() {
        return fins;
    }
    public void setFins(int fins) {
        this.fins = fins;
    }

    public int getGills() {
        return gills;
    }
    public void setGills(int gills) {
        this.gills = gills;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
