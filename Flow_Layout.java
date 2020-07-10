import java.awt.*;

class Flow_Layout{

    Frame frame;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;

    Flow_Layout() {
        frame = new Frame("Flow Layout");
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


        frame.setLayout(new FlowLayout());

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


        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);


        frame.setSize(800, 800);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Flow_Layout myClass = new Flow_Layout();
    }


}