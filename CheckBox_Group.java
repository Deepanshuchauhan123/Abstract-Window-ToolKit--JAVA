
import java.awt.*;
import java.awt.event.*;

class CheckBox_Group implements ItemListener 
{

    Frame frame;
    Checkbox c1, c2, c3;
    TextField textField;
    CheckboxGroup checkboxGroup;

    CheckBox_Group() 
    {
        frame = new Frame("CheckBox Group");
        textField = new TextField("Deepanshu Chauhan");
        checkboxGroup = new CheckboxGroup();

        c1 = new Checkbox("Red", checkboxGroup, true);
        c2 = new Checkbox("Green", checkboxGroup, false);
        c3 = new Checkbox("Blue", checkboxGroup, false);


        frame.setLayout(null);

        c1.setBounds(20, 100, 80, 30);
        c2.setBounds(20, 150, 80, 30);
        c3.setBounds(20, 200, 80, 30);
        textField.setBounds(150, 150, 260, 40);

        Font f = new Font("Serif", Font.ITALIC, 24);
        c1.setFont(f);
        c2.setFont(f);
        c3.setFont(f);
        textField.setFont(f);
        frame.add(c1);
        frame.add(textField);
        frame.add(c2);
        frame.add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }


    public static void main(String[] args) 
    {
        CheckBox_Group myClass = new CheckBox_Group();
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if (checkboxGroup.getSelectedCheckbox() == c1) 
        {
            textField.setBackground(Color.RED);
        } else if (checkboxGroup.getSelectedCheckbox() == c2) 
        {
            textField.setBackground(Color.GREEN);
        } else if (checkboxGroup.getSelectedCheckbox() == c3) 
        {
            textField.setBackground(Color.BLUE);
        }
    }
}

