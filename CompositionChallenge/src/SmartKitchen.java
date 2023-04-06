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
        coffeeMaker.setHasWorkToDo(true);
    }
    public void pourMilk() {
        refrigerator.setHasWorkToDo(true);
    }
    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
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
    public void setKitchenState(boolean coffeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        coffeeMaker.setHasWorkToDo(coffeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);

    }
}
