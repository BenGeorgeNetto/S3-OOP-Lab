import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TrafficLight extends Frame implements ItemListener {
    Checkbox red, yellow, green;
    CheckboxGroup cbg;

    TrafficLight() {
        cbg = new CheckboxGroup();
        red = new Checkbox("Red", cbg, false);
        yellow = new Checkbox("Yellow", cbg, false);
        green = new Checkbox("Green", cbg, false);
        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
        add(red);
        add(yellow);
        add(green);
        repaint();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(300, 300);
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new TrafficLight();
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        g.drawOval(130, 80, 50, 50);
        g.drawOval(130, 140, 50, 50);
        g.drawOval(130, 200, 50, 50);
        if (cbg.getSelectedCheckbox() == red) {
            g.setColor(Color.red);
            g.fillOval(130, 80, 50, 50);
        } else if (cbg.getSelectedCheckbox() == yellow) {
            g.setColor(Color.yellow);
            g.fillOval(130, 140, 50, 50);
        } else if (cbg.getSelectedCheckbox() == green) {

            g.setColor(Color.green);
            g.fillOval(130, 200, 50, 50);
        }
    }
}