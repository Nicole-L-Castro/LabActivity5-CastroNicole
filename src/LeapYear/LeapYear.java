package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnYearChecker;
public LeapYear(){
    btnYearChecker.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                int year = Integer.parseInt(tfYear.getText());
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
private boolean isPrime(int year){
    if( (year % 4 == 0) && (year % 100 != 0) || (year%400==0) ){
        JOptionPane.showMessageDialog(null, "Leap Year");
        return true;
    }
    else {
        JOptionPane.showMessageDialog(null, "Not a Leap Year");
        return true;
    }
}
    public static void main(String[] args) {
        LeapYear checker = new LeapYear();
        checker.setContentPane(checker.panel1);
        checker.setSize(400, 300);
        checker.setDefaultCloseOperation(EXIT_ON_CLOSE);
        checker.setVisible(true);
    }
}


