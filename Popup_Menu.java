
import java.awt.*;
import java.awt.event.*;

class Popup_Menu
{
    Frame frame;
    PopupMenu popupMenu;
    MenuItem cut, copy, paste;

    Popup_Menu() 
    {

        frame = new Frame("Pop-Up-Menu");
        popupMenu = new PopupMenu("Edit");
        cut = new MenuItem("Cut");
        copy = new MenuItem("Copy");
        paste = new MenuItem("Paste");
        
        cut.setActionCommand("Cut");
        copy.setActionCommand("Copy");
        paste.setActionCommand("Paste");

        Font f=new Font(Font.SERIF,Font.BOLD ,24 );
        popupMenu.setFont(f);

        popupMenu.add(paste);
        popupMenu.add(copy);
        popupMenu.add(cut);

        frame.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                popupMenu.show(frame, e.getX(), e.getY());
            }
        });
        frame.add(popupMenu);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        new Popup_Menu();
    }
}