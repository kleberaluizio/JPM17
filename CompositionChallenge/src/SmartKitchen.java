public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(){
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        refrigerator = new Refrigerator();
    }
    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public void addWater() {
        coffeeMaker.hasWorkToDo(true);
    }
    public void pourMilk() {
        refrigerator.hasWorkToDo(true);
    }
    public void loadDishWasher() {
        dishWasher.hasWorkToDo(true);
    }

    public void doKitchenWork(CoffeeMaker coffeeMaker){
        coffeeMaker.brewCoffee();
    }
    public void doKitchenWork(Refrigerator refrigerator){
        refrigerator.orderFood();
    }
    public void doKitchenWork(DishWasher dishWasher){
        dishWasher.doDishes();
    }

    public void finishKitchenWork(CoffeeMaker coffeeMaker){
        coffeeMaker.hasWorkToDo(false);
    }
    public void finishKitchenWork(Refrigerator refrigerator){
        refrigerator.hasWorkToDo(false);
    }
    public void finishKitchenWork(DishWasher dishWasher){
        dishWasher.hasWorkToDo(false);
    }
}
