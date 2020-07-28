

import java.awt.*;
import java.awt.event.*;

class can extends Canvas 
{
    int value, left, top, width, height, x1, y1, x2, y2;

    public void update(Graphics graphics) 
    {
        if (value == 0) 
        {
            
        } else if (value == 1) {
            graphics.drawRect(left, top, width, height);
        } else if (value == 2) {
            graphics.drawOval(left, top, width, height);
        } else if (value == 3) {
            graphics.drawLine(x1, y1, x2, y2);
        } else if (value == 4) {
            graphics.drawOval(x1, y1, 2, 2);
        }
    }
}

class Paint_Pad implements ActionListener, MouseListener 
{
    Frame frame;
    Panel panel;
    Button rect, oval, line;
    can c;

    Paint_Pad() 
    {
        frame = new Frame("Paint");
        panel = new Panel();
        rect = new Button("Rectangle");
        oval = new Button("Circle");
        line = new Button("Line");
        rect.setBackground(Color.CYAN);
        oval.setBackground(Color.pink);
        line.setBackground(Color.orange);

        panel.setLayout(new GridLayout(3, 1));

        Font font = new Font(Font.SERIF, Font.BOLD, 24);
        rect.setFont(font);
        oval.setFont(font);
        line.setFont(font);

        panel.add(rect);
        panel.add(line);
        panel.add(oval);


        c = new can();

        frame.add(panel, BorderLayout.WEST);
        frame.add(c);
        rect.addActionListener(this);
        oval.addActionListener(this);
        line.addActionListener(this);

        c.addMouseListener(this);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {

        new Paint_Pad();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == rect) 
        {
            c.value = 1;
        } else if (e.getSource() == oval) 
        {
            c.value = 2;
        } else if (e.getSource() == line) 
        {
            c.value = 3;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        c.left = c.x1 = e.getX();
        c.top = c.y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        c.x2 = e.getX();
        c.y2 = e.getY();
        if (c.x1 < c.x2 && c.y1 < c.y2) 
        {
            c.width = c.x2 - c.left;
            c.height = c.y2 - c.top;
            c.left = c.x1;
            c.top = c.y1;
        } else if (c.x1 > c.x2 && c.y1 > c.y2) 
        {
            c.width = c.left - c.x2;
            c.height = c.top - c.y2;
            c.left = c.x2;
            c.top = c.y2;
        }
        if (c.x1 > c.x2 && c.y1 < c.y2) 
        {
            c.width = c.left - c.x2;
            c.height = c.y2 - c.top;
            c.left = c.x2;
            c.top = c.y1;
        }
        if (c.x1 < c.x2 && c.y1 > c.y2) 
        {
            c.width = c.x2 - c.left;
            c.height = c.top - c.y2;
            c.left = c.x1;
            c.top = c.y2;
        }
        c.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) 
    {

    }


}


