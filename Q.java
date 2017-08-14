
import javax.swing.*;
import java.awt.*;

import javax.swing.*;

public class Q {

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");

    JPanel WC = new JPanel();
    JTextField displayField = new JTextField(30);


    Q (){
       BorderLayout b1 = new BorderLayout();
       WC.setLayout(b1);

       WC.add("North", displayField);

       JPanel p1 = new JPanel();
       GridLayout g1 = new GridLayout(4, 3);

       p1.setLayout(g1);
       p1.add(button1);
       p1.add(button2);
       p1.add(button3);
       p1.add(button4);
       p1.add(button5);
       p1.add(button6);
       p1.add(button7);
       p1.add(button8);
       p1.add(button9);
       p1.add(button0);
       p1.add(buttonPoint);
       p1.add(buttonEqual);

       WC.add("Center", p1);

        JPanel p2 = new JPanel();
        GridLayout g2 = new GridLayout(4,1);

        p2.setLayout(g2);
        p2.add(buttonPlus);
        p2.add(buttonMultiply);
        p2.add(buttonMinus);
        p2.add(buttonDivide);

        WC.add("East", p2);

        JFrame frame = new JFrame("MFC");
        frame.setContentPane(WC);

        frame.pack();
        frame.setVisible(true);

        CE ce = new CE(this);

        button0.addActionListener(ce);
        button1.addActionListener(ce);
        button2.addActionListener(ce);
        button3.addActionListener(ce);
        button4.addActionListener(ce);
        button5.addActionListener(ce);
        button6.addActionListener(ce);
        button7.addActionListener(ce);
        button8.addActionListener(ce);
        button9.addActionListener(ce);

        buttonPoint.addActionListener(ce);
        buttonPlus.addActionListener(ce);
        buttonMultiply.addActionListener(ce);
        buttonMinus.addActionListener(ce);
        buttonDivide.addActionListener(ce);
        buttonEqual.addActionListener(ce);
    }


    public static void main(String[] args) {
    Q qw = new Q();
    }


}

