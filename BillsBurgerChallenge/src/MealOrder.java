import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MealOrder {

    private Hamburger hamburger;
    private Drink drink;
    private HashMap<String, Double> itemsAndPrices = new HashMap<String, Double>();

    public void orderBurger() {
        Object[] hamburgerOptions = Hamburger.BurgerType.values();
        String hamburgerChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Hamburger's Menu",
                JOptionPane.PLAIN_MESSAGE, null, hamburgerOptions, hamburgerOptions[0]).toString();
        double hamburguerPrice = Enum.valueOf(Hamburger.BurgerType.class, hamburgerChoice).getValue();

        itemsAndPrices.put(hamburgerChoice, hamburguerPrice);
        System.out.println(hamburgerChoice + " = " + hamburguerPrice);
    }

    public void orderDrink() {
        int drinkChoice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (drinkChoice == JOptionPane.YES_OPTION) {

            Object[] drinkTypeOption = Drink.DrinkType.values();
            String drinkTypeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Menu",
                    JOptionPane.PLAIN_MESSAGE, null, drinkTypeOption, drinkTypeOption[0]).toString();


            Object[] drinkSizeOption = Drink.DrinkSize.values();
            String drinkSizeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Size",
                    JOptionPane.PLAIN_MESSAGE, null, drinkSizeOption, drinkSizeOption[0]).toString();


            //double drinkPrice = Enum.valueOf(Drink.BurgerType.class,drinkTypeChoice).getValue();
            double drinkPrice = Drink.getValue(drinkTypeChoice, drinkSizeChoice);
            itemsAndPrices.put(drinkTypeChoice, drinkPrice);
            System.out.println(drinkTypeChoice + " = " + drinkPrice);
        }
    }

    public void printOrderPrice(){
        double amount = 0;
        System.out.println("_".repeat(10) + " Meal Order "+"_".repeat(10));

        for (Map.Entry<String, Double> entry : itemsAndPrices.entrySet()) {
            String itemName = entry.getKey();
            double itemPrice = entry.getValue();
            amount = amount + itemPrice;
            System.out.println(itemName + " - " + itemPrice);
        }

        itemsAndPrices.put("Total amount for the meal = ", amount);
        System.out.println("Total amount for the meal = "+ amount);
    }
}
