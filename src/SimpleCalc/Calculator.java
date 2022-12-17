package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton computeResultButton;
    private JTextField textResult;

public Calculator(){
    computeResultButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
              int num1 = Integer.parseInt(textField1.getText());
              int num2 = Integer.parseInt(textField2.getText());
              int result;

              if(comboBox1.getSelectedItem().equals("+")){
                  result = num1 + num2;
                  String str = String.valueOf(result);
                  textResult.setText(str);
              }
              if(comboBox1.getSelectedItem().equals("-")){
                  result = num1 - num2;
                  String str = String.valueOf(result);
                  textResult.setText(str);
              }
                if(comboBox1.getSelectedItem().equals("*")){
                  result = num1 * num2;
                  String str = String.valueOf(result);
                  textResult.setText(str);
            }
                if(comboBox1.getSelectedItem().equals("/")){
                  result = num1 / num2;
                  String str = String.valueOf(result);
                  textResult.setText(str);
              }
            } catch(NumberFormatException a){
                JOptionPane.showMessageDialog(null, "Invalid");
            }
        }
    });
}

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setTitle("Simple Calculator");
        calc.setContentPane(calc.panel1);
        calc.setSize(600, 300);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}




