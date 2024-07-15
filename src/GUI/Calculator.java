package GUI;

import java.awt.*;
import java.awt.event.*;

class close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener, MouseListener {

    TextField tf;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button bAdd, bSub, bMul, bDiv, bPerc, bSqr;
    Button bDec, bEqu, bDel, bClr;
    String fv, sv, op;
    Double fdv, sdv, tot;

    Color originalColor;
    Color hoverColor = Color.LIGHT_GRAY;

    @Override
    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }

        Object o = d.getSource();

        if (o.equals(bDec)) {
            tf.setText(tf.getText().concat("."));

        } else if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());

        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());

        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());

        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());

        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());

        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());

        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());

        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());

        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());

        } else if (o.equals(b0)) {
            tf.setText(tf.getText() + b0.getLabel());

        } else if (o.equals(bDel)) {
            String string = tf.getText();
            tf.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                tf.setText(tf.getText() + string.charAt(i));
            }

        } else if (o.equals(bClr)) {
            tf.setText("");

        } else if (o.equals(bAdd)) {         // +

            fv = tf.getText();
            op = bAdd.getLabel();
            tf.setText("");

        } else if (o.equals(bSub)) {         // -

            fv = tf.getText();
            op = bSub.getLabel();
            tf.setText("");

        } else if (o.equals(bMul)) {         // ×

            fv = tf.getText();
            op = bMul.getLabel();
            tf.setText("");

        } else if (o.equals(bDiv)) {         // ÷

            fv = tf.getText();
            op = bDiv.getLabel();
            tf.setText("");

        } else if (o.equals(bEqu)) {         // =

            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);
            tf.setText("");
            if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");
            } else if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");
            } else if (op.equals("*")) {
                tot = fdv * sdv;
                tf.setText(tot + "");
            } else if (op.equals("/")) {
                tot = fdv / sdv;
                tf.setText(tot + "");
            }
        }

        if (o.equals(bSqr)) {
            fv = tf.getText();
            fdv = Double.valueOf(fv);
            tot = Math.sqrt(fdv);
            tf.setText(String.valueOf(tot));
        }

        if (o.equals(bPerc)) {
            fv = tf.getText();
            fdv = Double.valueOf(fv);
            tot = fdv / 100;
            tf.setText(String.valueOf(tot));
        }
    }

    Cal() {

        Frame f = new Frame();
        Color backgroundColor = new Color(12, 44, 64);

        f.addWindowListener(new close());
        f.setBackground(backgroundColor);
        f.setTitle("My Calculator");
        f.setResizable(true);
        f.setSize(400, 550);
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Quicksand", Font.BOLD, 30);
        Font f2 = new Font("Quicksand", Font.BOLD, 20);
        Font f3 = new Font("Quicksand", Font.BOLD, 35);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi = new MenuItem("Standard");
        m1.add(mi);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        Menu m3 = new Menu("Help");
        MenuItem mi4 = new MenuItem("About");
        m3.add(mi4);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(5, 4, 10, 10);
        p2.setLayout(g1);
        p2.setBackground(Color.WHITE);

        tf = new TextField(14);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(Color.black);
        tf.setBackground(Color.WHITE);
        tf.setText("0");

        p1.add(tf);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        bAdd = new Button("+");
        bSub = new Button("-");
        bMul = new Button("*");
        bDiv = new Button("/");
        bPerc = new Button("%");
        bSqr = new Button("√ ");
        bDec = new Button(".");
        bEqu = new Button("=");
        bDel = new Button("Del");
        bClr = new Button("C");

        bAdd.setForeground(Color.BLUE);
        bSub.setForeground(Color.BLUE);
        bMul.setForeground(Color.BLUE);
        bDiv.setForeground(Color.BLUE);
        bPerc.setForeground(Color.BLUE);
        bSqr.setForeground(Color.BLUE);
        bEqu.setForeground(Color.BLUE);
        bClr.setForeground(Color.RED);

        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);
        b0.setBackground(Color.white);
        bAdd.setBackground(Color.white);
        bSub.setBackground(Color.white);
        bMul.setBackground(Color.white);
        bDiv.setBackground(Color.white);
        bPerc.setBackground(Color.white);
        bSqr.setBackground(Color.white);
        bDec.setBackground(Color.white);
        bEqu.setBackground(Color.white);
        bDel.setBackground(Color.white);
        bClr.setBackground(Color.white);

        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f1);
        b9.setFont(f1);
        b0.setFont(f1);
        bAdd.setFont(f2);
        bSub.setFont(f2);
        bMul.setFont(f2);
        bDiv.setFont(f2);
        bPerc.setFont(f2);
        bSqr.setFont(f2);
        bDec.setFont(f2);
        bEqu.setFont(f3);
        bDel.setFont(f2);
        bClr.setFont(f2);

        p2.add(bClr);
        p2.add(bPerc);
        p2.add(bSqr);
        p2.add(bDel);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(bMul);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bDiv);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bSub);
        p2.add(bDec);
        p2.add(b0);
        p2.add(bEqu);
        p2.add(bAdd);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bPerc.addActionListener(this);
        bSqr.addActionListener(this);
        bDec.addActionListener(this);
        bEqu.addActionListener(this);
        bDel.addActionListener(this);
        bClr.addActionListener(this);

        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);
        b5.addMouseListener(this);
        b6.addMouseListener(this);
        b7.addMouseListener(this);
        b8.addMouseListener(this);
        b9.addMouseListener(this);
        b0.addMouseListener(this);
        bAdd.addMouseListener(this);
        bSub.addMouseListener(this);
        bMul.addMouseListener(this);
        bDiv.addMouseListener(this);
        bPerc.addMouseListener(this);
        bSqr.addMouseListener(this);
        bDec.addMouseListener(this);
        bEqu.addMouseListener(this);
        bDel.addMouseListener(this);
        bClr.addMouseListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);
        f.setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof Button) {
            Button button = (Button) e.getSource();
            originalColor = button.getBackground();
            button.setBackground(hoverColor);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof Button) {
            Button button = (Button) e.getSource();
            button.setBackground(originalColor);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

}

public class Calculator {

    public static void main(String[] args) {
        Cal cal = new Cal();
    }
}
