public class Main {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Refrigerator frigde = new Refrigerator();
        DishWasher dishWasher = new DishWasher();

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker,dishWasher,frigde);

        smartKitchen.setKitchenState(true,true,true);
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getFrigde().orderFood();
        smartKitchen.getDishWasher().doDishes();

        smartKitchen.setKitchenState(false,false,true);
        System.out.println("-".repeat(10));
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getFrigde().orderFood();
        smartKitchen.getDishWasher().doDishes();

        smartKitchen.setKitchenState(true,true,false);

        System.out.println("-".repeat(10));
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getFrigde().orderFood();
        smartKitchen.getDishWasher().doDishes();

    }
}
