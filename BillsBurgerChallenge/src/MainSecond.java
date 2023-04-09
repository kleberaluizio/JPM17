import javax.swing.*;
import java.awt.*;

public class MainSecond {
    public static void main(String[] args) {
        try {
            // Set the look and feel of the application to the system default.
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                 | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        Object[] drinkTypeOption = Drink.DrinkType.values();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Choose a drink:");
        label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        panel.add(label);
        JComboBox<Object> dropdown = new JComboBox<>(drinkTypeOption);
        dropdown.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        panel.add(dropdown);
        panel.setPreferredSize(new Dimension(300, 100));

        Font font = UIManager.getFont("OptionPane.messageFont").deriveFont(18f);
        UIManager.put("OptionPane.messageFont", font);

        String drinkTypeChoice = JOptionPane.showInputDialog(null, panel, "Drink's Menu",
                JOptionPane.PLAIN_MESSAGE, null, null, drinkTypeOption[0]).toString();

        JOptionPane.showMessageDialog(null, "You chose: " + drinkTypeChoice);
    }
}
