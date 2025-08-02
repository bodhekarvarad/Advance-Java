import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XIII_3 extends JFrame
{
    JTextField n1;
    JTextField n2;
    JButton b;
    JLabel l;

    public XIII_3() {
        setTitle("Multiply Calculator");
        setSize(300, 150);
        setLayout(new FlowLayout());

        n1= new JTextField(10);
        n2= new JTextField(10);

        b= new JButton("Multiply");

		l= new JLabel("Result: ");

        add(new JLabel("Enter Number 1: "));
        add(n1);
        add(new JLabel("Enter Number 2: "));
        add(n2);
        add(b);
        add(l);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateProduct();
            }
        });
    }

   void calculateProduct() {
        try {
            double num1 = Double.parseDouble(n1.getText());
            double num2 = Double.parseDouble(n2.getText());

            double product = num1 * num2;

            l.setText("Result: " + product);
        } catch (NumberFormatException ex) {
            l.setText("Invalid input. Please enter numbers.");
        }
    }
    public static void main(String[] args) {
        
                new XIII_3().setVisible(true);
            }
  
    
}
