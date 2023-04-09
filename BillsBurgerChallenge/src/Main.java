import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Double> itemsAndPrices = new HashMap<String, Double>();

        Object[] hamburgerOptions = Hamburger.BurgerType.values();
        String hamburgerChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Hamburger's Menu",
                        JOptionPane.PLAIN_MESSAGE, null, hamburgerOptions, hamburgerOptions[0]).toString();
        double hamburguerPrice = Enum.valueOf(Hamburger.BurgerType.class,hamburgerChoice).getValue();

        itemsAndPrices.put(hamburgerChoice,hamburguerPrice);
        System.out.println(hamburgerChoice +" = "+ hamburguerPrice);
        // JOptionPane.showMessageDialog(null, "You chose: " + hamburgerChoice + ". It Costs "+ hamburguerPrice);

        int drinkChoice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (drinkChoice == JOptionPane.YES_OPTION) {

            Object[] drinkTypeOption = Drink.DrinkType.values();
            String drinkTypeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Menu",
                    JOptionPane.PLAIN_MESSAGE, null, drinkTypeOption, drinkTypeOption[0]).toString();


            Object[] drinkSizeOption = Drink.DrinkSize.values();
            String drinkSizeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Size",
                    JOptionPane.PLAIN_MESSAGE, null, drinkSizeOption, drinkSizeOption[0]).toString();


            //double drinkPrice = Enum.valueOf(Drink.BurgerType.class,drinkTypeChoice).getValue();
            double drinkPrice = Drink.getValue(drinkTypeChoice,drinkSizeChoice);
            itemsAndPrices.put(drinkTypeChoice,drinkPrice);
            System.out.println(drinkTypeChoice +" = "+ drinkPrice);



        }



        /*
        JOptionPane.showMessageDialog(null, "You chose: " + drinkTypeChoice);

        Object[] drinkSizeOption = Drink.DrinkSize.values();
        String drinkSizeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Size",
                JOptionPane.PLAIN_MESSAGE, null, drinkSizeOption, drinkSizeOption[0]).toString();

        JOptionPane.showMessageDialog(null, "You chose: " + drinkSizeChoice);*/
    }
}
