public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator frigde;

    public SmartKitchen(CoffeeMaker coffeeMaker,DishWasher dishWasher,Refrigerator frigde){
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.frigde = frigde;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public Refrigerator getFrigde() {
        return frigde;
    }
}
