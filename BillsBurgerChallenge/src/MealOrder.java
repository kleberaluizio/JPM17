import javax.swing.*;
import java.util.HashMap;

public class MealOrder {

    private Hamburger hamburger;
    private Drink drink;
    private HashMap<String, Double> itemsAndPrices;

    public void orderBurger(){
        Object[] hamburgerOptions = Hamburger.BurgerType.values();
        String hamburgerChoice = JOptionPane.showInputDialog(null, "Choose an option:", "Hamburger's Menu",
                JOptionPane.PLAIN_MESSAGE, null, hamburgerOptions, hamburgerOptions[0]).toString();
        double hamburguerPrice = Enum.valueOf(Hamburger.BurgerType.class,hamburgerChoice).getValue();

        itemsAndPrices.put(hamburgerChoice,hamburguerPrice);
        System.out.println(hamburgerChoice +" = "+ hamburguerPrice);
    }
}
