import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {
    private JPanel panelMain;
    private JPanel panelTop;
    private JPanel panelBottom;
    private JTextField textFieldInput1;
    private JTextField textFieldInput2;
    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JLabel labelAnswer;

    Screen(){
    super("Basic Calculator");
    this.setContentPane(this.panelMain);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();


        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonAddClick(e);
            }
        });
        buttonSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSubtractClick(e);
            }
        });
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonMultiplyClick(e);
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDivideClick(e);
            }
        });
    }

    public void buttonAddClick(ActionEvent e){
        String text1 = textFieldInput1.getText();
        double a = Double.parseDouble(text1);

        String text2 = textFieldInput2.getText();
        double b = Double.parseDouble(text2);

        double answer = a + b;

        labelAnswer.setText(String.valueOf(answer));
    }

    public void buttonSubtractClick(ActionEvent e){
        String text1 = textFieldInput1.getText();
        double a = Double.parseDouble(text1);

        String text2 = textFieldInput2.getText();
        double b = Double.parseDouble(text2);

        double answer = a - b;

        labelAnswer.setText(String.valueOf(answer));
    }

    public void  buttonMultiplyClick(ActionEvent e){
        String text1 = textFieldInput1.getText();
        double a = Double.parseDouble(text1);

        String text2 = textFieldInput2.getText();
        double b = Double.parseDouble(text2);

        double answer = a * b;

        labelAnswer.setText(String.valueOf(answer));
    }

    public void buttonDivideClick(ActionEvent e){
        String text1 = textFieldInput1.getText();
        double a = Double.parseDouble(text1);

        String text2 = textFieldInput2.getText();
        double b = Double.parseDouble(text2);

        if (b == 0.0)
            labelAnswer.setText("Cannot divide by ZERO");
        else{
            double answer = a / b;
            labelAnswer.setText(String.valueOf(answer));
        }
    }

    public static void main(String[] args) {
       Screen screen = new Screen();
       screen.setVisible(true);
    }

}
