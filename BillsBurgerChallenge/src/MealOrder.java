import javax.swing.*;
import java.util.ArrayList;

public class MealOrder {

    private Hamburger hamburger;
    private Drink drink;
    private ArrayList <String> items = new ArrayList<String>();
    private ArrayList <Double> prices = new ArrayList<Double>();

    public void addToList(String item, Double price){
        items.add(item);
        prices.add(price);
    }
    public void orderBurger() {
        Object[] hamburgerOptions = Hamburger.BurgerType.values();
        String hamburgerChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Hamburger's Menu",
                JOptionPane.PLAIN_MESSAGE, null, hamburgerOptions, hamburgerOptions[0]).toString();
        double hamburguerPrice = Enum.valueOf(Hamburger.BurgerType.class, hamburgerChoice).getValue();

        addToList(hamburgerChoice, hamburguerPrice);
        //System.out.println(hamburgerChoice + " = " + hamburguerPrice);
    }

    public void orderDrink() {
        int drinkChoice = JOptionPane.showConfirmDialog(null, "Do you want something to drink?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (drinkChoice == JOptionPane.YES_OPTION) {

            Object[] drinkTypeOption = Drink.DrinkType.values();
            String drinkTypeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Menu",
                    JOptionPane.PLAIN_MESSAGE, null, drinkTypeOption, drinkTypeOption[0]).toString();


            Object[] drinkSizeOption = Drink.DrinkSize.values();
            String drinkSizeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Size",
                    JOptionPane.PLAIN_MESSAGE, null, drinkSizeOption, drinkSizeOption[0]).toString();


            double drinkPrice = Drink.getValue(drinkTypeChoice, drinkSizeChoice);

            addToList(drinkTypeChoice, drinkPrice);
            //System.out.println(drinkTypeChoice + " = " + drinkPrice);
        }

    }

    public void orderSideItem() {

        Object[] sideOptions = SideItems.SideItem.values();
        String sideChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Side's Menu",
                JOptionPane.PLAIN_MESSAGE, null, sideOptions, sideOptions[0]).toString();
        double sidePrice = Enum.valueOf(SideItems.SideItem.class, sideChoice).getValue();

        addToList(sideChoice, sidePrice);
        //System.out.println(sideChoice + " = " + sidePrice);

    }


    public void printOrderPrice(){
        double amount = 0;

        System.out.println("_".repeat(10) + " Meal Order "+"_".repeat(10));

        for (int i = 0; i< items.size(); i++){
            amount = amount + prices.get(i);
            String text = items.get(i) + " = "+prices.get(i);
            System.out.println(items.get(i) + " = "+prices.get(i));
        }
        System.out.printf("Total amount for the meal = "+ amount);


        StringBuilder message = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            message.append(items.get(i)).append(" - ").append(prices.get(i)).append("\n");
        }
        message.append("\n");
        message.append("Total amount = ").append(amount).append("\n");
        JOptionPane.showMessageDialog(null, message.toString(), " Meal Order ", JOptionPane.PLAIN_MESSAGE);



    }
}
