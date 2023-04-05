public class Main {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Refrigerator frigde = new Refrigerator();
        DishWasher dishWasher = new DishWasher();

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker,dishWasher,frigde);

        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getFrigde().orderFood();
        smartKitchen.getDishWasher().doDishes();

        smartKitchen.getCoffeeMaker().hasWorkToDo(true);
        smartKitchen.getFrigde().hasWorkToDo(true);
        smartKitchen.getDishWasher().hasWorkToDo(true);
        System.out.println("-".repeat(10));
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getFrigde().orderFood();
        smartKitchen.getDishWasher().doDishes();

        smartKitchen.getCoffeeMaker().hasWorkToDo(false);
        smartKitchen.getFrigde().hasWorkToDo(true);
        smartKitchen.getDishWasher().hasWorkToDo(true);
        System.out.println("-".repeat(10));
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getFrigde().orderFood();
        smartKitchen.getDishWasher().doDishes();

    }
}
