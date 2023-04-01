public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt","Big",50);
    }

    public Dog(String type,double weight){
        this(type, weight, "Perky","Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15? "small":(weight < 35?"medium":"large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void bark(){
        System.out.println("Woof!");
    }
    public void run(){
        System.out.print("Dog Running!");
    }
    public void walk(){
        System.out.print("Dog Walking!");
    }
    public void wagTail(){
        System.out.println("Tail waging!");
    }

    public void makeNoise() {
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }
}
