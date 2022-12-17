package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;
public LeapYear(){
    btnLeapYearChecker.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                int year = Integer.parseInt(tfNumber.getText());
                if(year <= 0){
                    throw new Exception("Invalid Input");
                }
                if(isPrime(year)){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                } else{
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                }
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    });
}
private boolean isPrime(int number){
    if(year == 2){
        return true;
    }
    if(year % 2 == 0){
        return false;
    }
    for(int i=3; i<=Math.sqrt(number); i += 2){
        if(year % 1 == 0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        LeapYear checker = new LeapYear();
        checker.setContentPane(checker.panel1);
        checker.setSize(400, 300);
        checker.setDefaultCloseOperation(EXIT_ON_CLOSE);
        checker.setVisible(true);
    }
}


