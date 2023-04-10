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

        double hamburgerPrice = Enum.valueOf(Hamburger.BurgerType.class, hamburgerChoice).getPrice();

        addToList(hamburgerChoice, hamburgerPrice);
        orderExtraToppings(hamburgerChoice,hamburgerPrice);

        //System.out.println(hamburgerChoice + " = " + hamburguerPrice);
    }

    public void orderExtraToppings(String hamburgerChoice,double hamburgerPrice) {
        int drinkChoice = JOptionPane.showConfirmDialog(null, "Do you want some extra topping?", "Extra Topping", JOptionPane.YES_NO_OPTION);

        if (drinkChoice == JOptionPane.YES_OPTION) {

            Object[] extraOption = Hamburger.Extra.values();
            String extraChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Extra Topping",
                    JOptionPane.PLAIN_MESSAGE, null, extraOption, extraOption[0]).toString();

            double finalBurgerPrice = hamburgerPrice +Hamburger.Extra.Burger.getPrice();
            items.set(0,hamburgerChoice + " (+ extra "+extraChoice+")");
            prices.set(0,finalBurgerPrice);

        }
    }



    public void orderDrink() {
        int drinkChoice = JOptionPane.showConfirmDialog(null, "Do you want something to drink?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (drinkChoice == JOptionPane.YES_OPTION) {

            Object[] drinkTypeOption = Drink.DrinkType.values();
            String drinkTypeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Menu",
                    JOptionPane.PLAIN_MESSAGE, null, drinkTypeOption, drinkTypeOption[0]).toString();

            if (drinkTypeChoice.contains("Water")) {
                double drinkPrice = Drink.getValue();
                addToList(drinkTypeChoice , drinkPrice);

            } else {
                String drinkSize = getDrinkSize(drinkTypeChoice);
                double drinkPrice = getDrinkPrice(drinkTypeChoice,drinkSize);

                addToList(drinkTypeChoice + " ("+drinkSize+" size)", drinkPrice);

            }


            //System.out.println(drinkTypeChoice + " = " + drinkPrice);
        }

    }

    public String getDrinkSize(String drinkTypeChoice){
        Object[] drinkSizeOption = Drink.DrinkSize.values();
        String drinkSizeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Size",
                JOptionPane.PLAIN_MESSAGE, null, drinkSizeOption, drinkSizeOption[0]).toString();


        return  drinkSizeChoice;
    }
    private double getDrinkPrice(String drinkTypeChoice, String drinkSizeChoice){
        double drinkPrice = Drink.getValue(drinkTypeChoice, drinkSizeChoice);
        return drinkPrice;
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

        StringBuilder message = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            amount = amount + prices.get(i);
            String price = String.format("%.2f",prices.get(i));
            message.append(items.get(i).indent(1)).append(" = ").append(price).append("\n");
        }
        message.append("\n");
        message.append("Total amount = ").append(String.format("%.2f",amount)).append("\n");
        JOptionPane.showMessageDialog(null, message.toString(), " Meal Order ", JOptionPane.PLAIN_MESSAGE);



    }
}
