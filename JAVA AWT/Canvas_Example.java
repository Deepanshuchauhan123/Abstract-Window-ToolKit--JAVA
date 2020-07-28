import java.awt.*;

class can extends Canvas
{
    public void paint(Graphics graphics)
    {
        graphics.drawOval(24, 40, 100, 80);
        graphics.drawString("Canvas", 200, 200);
    }
}

class Canvas_Example{

    Frame frame;
    can c;

    Canvas_Example()
    {
        frame = new Frame();
        c = new can();
        frame.add(c);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        Canvas_Example myClass = new Canvas_Example();
    }

}