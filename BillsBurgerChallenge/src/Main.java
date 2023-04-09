import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Object[] hamburgerOptions = Hamburger.BurgerType.values();
        String hamburgerChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Hamburger's Menu",
                        JOptionPane.PLAIN_MESSAGE, null, hamburgerOptions, hamburgerOptions[0]).toString();

        JOptionPane.showMessageDialog(null, "You chose: " + hamburgerChoice);

        Object[] drinkTypeOption = Drink.DrinkType.values();
        String drinkTypeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Menu",
                JOptionPane.PLAIN_MESSAGE, null, drinkTypeOption, drinkTypeOption[0]).toString();

        JOptionPane.showMessageDialog(null, "You chose: " + drinkTypeChoice);

        Object[] drinkSizeOption = Drink.DrinkSize.values();
        String drinkSizeChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Drink's Size",
                JOptionPane.PLAIN_MESSAGE, null, drinkSizeOption, drinkSizeOption[0]).toString();

        JOptionPane.showMessageDialog(null, "You chose: " + drinkSizeChoice);
    }
}
