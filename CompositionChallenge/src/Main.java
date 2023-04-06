public class Main {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Refrigerator frigde = new Refrigerator();
        DishWasher dishWasher = new DishWasher();

        SmartKitchen kitchen = new SmartKitchen(coffeeMaker,dishWasher,frigde);

        kitchen.setKitchenState(false,false, false);
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

        kitchen.setKitchenState(true, true, false);
        kitchen.loadDishWasher();
        kitchen.doKitchenWork(coffeeMaker);
        kitchen.doKitchenWork(frigde);
        kitchen.doKitchenWork(dishWasher);

        System.out.println("-".repeat(15));
        SmartKitchen newKitchen = new SmartKitchen();
        newKitchen.setKitchenState(true,true,false);
        newKitchen.doKitchenWork();



    }
}
