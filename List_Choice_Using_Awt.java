import java.awt.*;
import java.awt.event.*;

class List_Choice_Using_Awt implements ItemListener{

    Frame frame;
    List list;
    Choice choice;

    List_Choice_Using_Awt (){
        frame=new Frame("Sample Program");
        list=new List();
        choice=new Choice();

        list.add("Jaipur");
        list.add("Jaisalmer");
        list.add("Ajmer");
        list.add("Kota");
        list.add("Alwar");
        list.add("Udaipur");

        choice.add("City - Jaipur");
        choice.add("Jaisalmer");
        choice.add("Ajmer");
        choice.add("Kota");
        choice.add("Alwar");
        choice.add("Udaipur");

        frame.setLayout(null);

        list.setBounds(20,150,80,100);
        choice.setBounds(120,150,100,50);

        frame.add(list);
        frame.add(choice);

        list.addItemListener(this);
        choice.addItemListener(this);

        frame.setSize(300,300);
        frame.setVisible(true);
    }



    public static void main(String[] args) {
    List_Choice_Using_Awt myClass=new List_Choice_Using_Awt ();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()== list){
            choice.add(list.getSelectedItem());
            list.remove(list.getSelectedItem());
        }else{
            list.add(choice.getSelectedItem());
            choice.remove(choice.getSelectedItem());
        }
    }
}

