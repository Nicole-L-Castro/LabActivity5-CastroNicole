package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FoodOrderingSystem extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderingSystem() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double totalPrice = 0;
                    totalPrice += cPizza.isSelected() ? 100 : 0;
                    totalPrice += cBurger.isSelected() ? 80 : 0;
                    totalPrice += cFries.isSelected() ? 65 : 0;
                    totalPrice += cSoftDrinks.isSelected() ? 55 : 0;
                    totalPrice += cTea.isSelected() ? 50 : 0;
                    totalPrice += cSundae.isSelected() ? 40 : 0;
                    if (rb5.isSelected()) {
                        totalPrice *= 0.95;
                    } else if (rb10.isSelected()) {
                        totalPrice *= 0.9;
                    } else if (rb15.isSelected()) {
                        totalPrice *= 0.85;
                    }
                    DecimalFormat df = new DecimalFormat("#.00");
                    JOptionPane.showMessageDialog(null, "The total price is Php " + df.format(totalPrice));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Food Ordering System");
        frame.setContentPane(new FoodOrderingSystem().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
