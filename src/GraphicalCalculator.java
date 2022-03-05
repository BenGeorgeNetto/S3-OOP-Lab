import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GraphicalCalculator implements ActionListener {
    char operator;
    double num1, num2, result;
    String temp;
    JFrame f;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton bAdd, bSub, bMul, bDiv, bMod, bRes, bC; 
    JPanel p;
    JTextField tf;

    GraphicalCalculator() {
        f = new JFrame("Calculator");
        p = new JPanel();

        f.setLayout(new FlowLayout());

        b1 = new JButton("1");
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.addActionListener(this);
        b5 = new JButton("5");
        b5.addActionListener(this);
        b6 = new JButton("6");
        b6.addActionListener(this);
        b7 = new JButton("7");
        b7.addActionListener(this);
        b8 = new JButton("8");
        b8.addActionListener(this);
        b9 = new JButton("9");
        b9.addActionListener(this);
        b0 = new JButton("0");
        b0.addActionListener(this);

        bAdd = new JButton("+");
        bAdd.addActionListener(this);
        bSub = new JButton("-");
        bSub.addActionListener(this);
        bMul = new JButton("x");
        bMul.addActionListener(this);
        bDiv = new JButton("/");
        bDiv.addActionListener(this);
        bDiv = new JButton("/");
        bDiv.addActionListener(this);
        bMod = new JButton("%");
        bMod.addActionListener(this);
        bRes = new JButton("=");
        bRes.addActionListener(this);
        bC = new JButton("C");
        bC.addActionListener(this);

        tf = new JTextField(11);
        tf.setFont(new Font("Times New Roman", Font.BOLD, 33));
        f.add(tf);

        p.setLayout(new GridLayout(4, 4, 10, 20));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(bAdd);
        p.add(bSub);
        p.add(bMul);
        p.add(bDiv);
        p.add(bMod);
        p.add(bRes);
        p.add(bC);
        p.setPreferredSize(new Dimension(300, 300));

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.add(p);
        f.setSize(350, 420); 
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAdd) { 
            num1 = Double.parseDouble(tf.getText());
            tf.setText(""); 
            operator = '+'; 
        } else if (e.getSource() == bSub) { 
            num1 = Double.parseDouble(tf.getText());
            tf.setText(""); 
            operator = '-'; 
        } else if (e.getSource() == bMul) { 
            num1 = Double.parseDouble(tf.getText());  
            tf.setText(""); 
            operator = '*'; 
        } else if (e.getSource() == bDiv) { 
            num1 = Double.parseDouble(tf.getText());  
            tf.setText(""); 
            operator = '/'; 
        } else if (e.getSource() == bMod) { 
            num1 = Double.parseDouble(tf.getText());  
            tf.setText(""); 
            operator = '%'; 
        } else if (e.getSource() == bRes) { 
            num2 = Double.parseDouble(tf.getText()); 
            if (operator == '+') { 
                result = num1 + num2; 
                tf.setText(String.valueOf(result));  
            } else if (operator == '-') { 
                result = num1 - num2; 
                tf.setText(String.valueOf(result));  
            } else if (operator == '*') { 
                result = num1 * num2; 
                tf.setText(String.valueOf(result));  
            } else if (operator == '/') { 
                try { 
                    if (num2 != 0) { 
                        result = num1 / num2;
                        tf.setText(String.valueOf(result));
                    } else { 
                        tf.setText("Infinite");
                    } 
                } catch (Exception E) {
                    E.printStackTrace();
                }
            } else if (operator == '%') { 
                result = num1 % num2; 
                tf.setText(String.valueOf(result));  
            } 
        } else if (e.getSource() == bC) { 
            tf.setText(""); 
        } else { 
            temp = tf.getText() + e.getActionCommand();
            tf.setText(temp); 
        }
    }

    public static void main(String[] args) {
        new GraphicalCalculator();
    }
}
