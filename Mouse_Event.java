/*
Mouse Event : Dragged Position and Mouse Current State
*/


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Mouse_Event implements MouseListener, MouseMotionListener {

    Frame frame;
    TextField mouse_opr, mouse_pos;

    Mouse_Event() {
        frame = new Frame("Mouse Operation and Position");
        mouse_opr = new TextField();
        mouse_pos = new TextField();

        Font font = new Font(Font.SERIF, Font.BOLD, 30);
        mouse_pos.setFont(font);
        mouse_opr.setFont(font);
        frame.setBackground(Color.cyan);

        frame.add(mouse_opr, BorderLayout.NORTH);
        frame.add(mouse_pos, BorderLayout.SOUTH);

        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);

        frame.setSize(1000, 1000);
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        Mouse_Event myClass = new Mouse_Event();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouse_opr.setText("Mouse State:::  Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        mouse_opr.setText("Mouse State:::  Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouse_opr.setText("Mouse State:::  Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouse_opr.setText("Mouse State:::  Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouse_opr.setText("Mouse State:::  Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouse_pos.setText("MOUSE DRAGGED  X-Coordinate :" + e.getX() + "    Y-Coordinate :" + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouse_opr.setText("Mouse State:::  Mouse Moved");
    }
}

