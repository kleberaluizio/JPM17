public class Main {
    public static void main(String[] args) {

/*
    Item coke = new Item("drink","coke",1.50);
    coke.printItem();
    coke.setSize("LARGE");
    coke.printItem();

    Item avocado = new Item("Topping", "Avocado", 1.50);
    avocado.printItem();
*/
/*
        Burger burger = new Burger("regular",4.0);
        burger.addToppings("Bacon","Cheese","Mayo");
        burger.printItem();
*/
/*        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("Bacon","Cheese","Mayo");
        regularMeal.setDrinkSize("Large");
        regularMeal.printItemizedList();*/

/*        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
        secondMeal.addBurgerToppings("Lettuce","Cheese","Mayo");
        secondMeal.setDrinkSize("small");
        secondMeal.printItemizedList();*/

        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
