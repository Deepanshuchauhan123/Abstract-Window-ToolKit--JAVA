/*
Mix Layout of Border and Grid Layout using panel.

Panel: Panel is also a AWT container but not having any visual interface.

Note: You cannot add directly two layout on a single frame. 
*/


import java.awt.*;

class Border_Grid_Layout_Using_Panel{

    Frame frame;
    Panel panel;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    TextField textField;

    Border_Grid_Layout_Using_Panel() {
        frame = new Frame("Mix Layout of Border and Grid Layout");
        panel = new Panel();
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        b6 = new Button("Button 6");
        b7 = new Button("Button 7");
        b8 = new Button("Button 8");
        b9 = new Button("Button 9");
        b10 = new Button("Button 10");
        b11 = new Button("Button 11");
        b12 = new Button("Button 12");
        b13 = new Button("Border Layout Button");


        panel.setLayout(new GridLayout(3, 4));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);


        Font f = new Font("Serif", Font.ITALIC, 30);
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        b10.setFont(f);
        b11.setFont(f);
        b12.setFont(f);
        b13.setFont(f);


        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.green);
        b3.setBackground(Color.CYAN);
        b4.setBackground(Color.ORANGE);
        b5.setBackground(Color.PINK);
        b6.setBackground(Color.BLUE);
        b7.setBackground(Color.YELLOW);
        b8.setBackground(Color.CYAN);
        b9.setBackground(Color.ORANGE);
        b10.setBackground(Color.PINK);
        b11.setBackground(Color.WHITE);
        b12.setBackground(Color.green);
        b13.setBackground(Color.RED);


        textField = new TextField("This Is TextField In Border Layout");
        textField.setFont(f);
        textField.setBackground(Color.RED);
        frame.setLayout(new BorderLayout());
        frame.add(b13, BorderLayout.WEST);
        frame.add(textField, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Border_Grid_Layout_Using_Panel myClass = new Border_Grid_Layout_Using_Panel();
    }


}

