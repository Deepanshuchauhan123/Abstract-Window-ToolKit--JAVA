/*
In Border Layout the container window is logically divided into 5 parts
1. EAST
2.WEST
3.NORTH
4.SOUTH
5.CENTER

By Default : CENTER
*/
import java.awt.*;

class Border_Layout{

    Frame frame;
    Button b1, b2, b3, b4, b5;

    Border_Layout() {
        frame = new Frame("Border Layout");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");


        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);

        Font f = new Font("Serif", Font.ITALIC, 30);
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);

        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.green);
        b3.setBackground(Color.CYAN);
        b4.setBackground(Color.ORANGE);
        b5.setBackground(Color.PINK);

        frame.add(b1, BorderLayout.EAST);
        frame.add(b2, BorderLayout.WEST);
        frame.add(b3, BorderLayout.NORTH);
        frame.add(b4, BorderLayout.SOUTH);
        frame.add(b5, BorderLayout.CENTER);


        frame.setSize(600, 400);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        Border_Layout myClass = new Border_Layout();
    }


}

