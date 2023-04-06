public class Main {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Refrigerator frigde = new Refrigerator();
        DishWasher dishWasher = new DishWasher();

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker,dishWasher,frigde);

        smartKitchen.doKitchenWork(coffeeMaker);
        smartKitchen.doKitchenWork(frigde);
        smartKitchen.doKitchenWork(dishWasher);
        System.out.println("-".repeat(15));

        smartKitchen.addWater();
        smartKitchen.pourMilk();
        smartKitchen.doKitchenWork(coffeeMaker);
        smartKitchen.doKitchenWork(frigde);
        smartKitchen.doKitchenWork(dishWasher);
        System.out.println("-".repeat(15));

        smartKitchen.finishKitchenWork(coffeeMaker);
        smartKitchen.finishKitchenWork(frigde);
        smartKitchen.loadDishWasher();
        smartKitchen.doKitchenWork(coffeeMaker);
        smartKitchen.doKitchenWork(frigde);
        smartKitchen.doKitchenWork(dishWasher);


    }
}
