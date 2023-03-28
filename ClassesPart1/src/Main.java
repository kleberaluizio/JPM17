public class Main {
    public static void main (String[] args){
    Car car = new Car();
    car.setColor("red");
    car.setMake("Holden");
    car.setModel("Ecosport");
    car.setDoors(4);
    car.describeCar();
    System.out.println(car.getMake() + " " + car.getColor());

    Car targa = new Car();
    targa.setMake("Porsche");
    targa.setModel("Targa");
    targa.setDoors(2);
    targa.setConvertible(false);
    targa.setColor("blue");
    targa.describeCar();

    }
}
