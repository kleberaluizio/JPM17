public class Main {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Refrigerator frigde = new Refrigerator();
        DishWasher dishWasher = new DishWasher();

        SmartKitchen kitchen = new SmartKitchen(coffeeMaker,dishWasher,frigde);

        kitchen.doKitchenWork(coffeeMaker);
        kitchen.doKitchenWork(frigde);
        kitchen.doKitchenWork(dishWasher);
        System.out.println("-".repeat(15));

        kitchen.addWater();
        kitchen.pourMilk();
        kitchen.doKitchenWork(coffeeMaker);
        kitchen.doKitchenWork(frigde);
        kitchen.doKitchenWork(dishWasher);
        System.out.println("-".repeat(15));

        kitchen.finishKitchenWork(coffeeMaker);
        kitchen.finishKitchenWork(frigde);
        kitchen.loadDishWasher();
        kitchen.doKitchenWork(coffeeMaker);
        kitchen.doKitchenWork(frigde);
        kitchen.doKitchenWork(dishWasher);

        SmartKitchen newKitchen = new SmartKitchen();

        newKitchen.doKitchenWork(dishWasher);



    }
}
