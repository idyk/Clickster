package clickster;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JButtonBuild extends JButton {

    //Create button instance up here...
    JButton click;
    JButton save;
    JButton load;
    JButton reset;
    JButton upgrade_one;
    JButton upgrade_two;
    JButton upgrade_three;
    JButton upgrade_four;
    JButton upgrade_five;

    ButtonHandler handler;
    Middleware mw = new Middleware();

    Font font = new Font("Comic Sans MS", Font.PLAIN, 20);

    public JButtonBuild() {
        //...and then finish the instance in here.

        //Click button...
        click = new JButton("Click");
        click.setFont(font);
        System.out.println("click" + click.getSize());

        //Save button...
        save = new JButton("Save");
        save.setFont(font);

        //Load button...
        load = new JButton("Load");
        load.setFont(font);

        //Reset button...
        reset = new JButton("Reset");
        reset.setFont(font);

        //Upgrade buttons... 
        upgrade_one = new JButton("50 CLICKS - Upgrade click power by 1%");
        upgrade_one.setFont(font);

        upgrade_two = new JButton("Testing - change image");
        upgrade_two.setFont(font);

        upgrade_three = new JButton("??? CLICKS - ????????????????????");
        upgrade_three.setFont(font);

        upgrade_four = new JButton("??? CLICKS - ????????????????????");
        upgrade_four.setFont(font);

        upgrade_five = new JButton("??? CLICKS - ????????????????????");
        upgrade_five.setFont(font);

        handler = new ButtonHandler();

        //add listeners to each instance here. (see Middleware for the logic it corresponds to...) 
        click.addActionListener(handler);
        save.addActionListener(handler);
        load.addActionListener(handler);
        reset.addActionListener(handler);
        upgrade_one.addActionListener(handler);
        upgrade_two.addActionListener(handler);
        upgrade_three.addActionListener(handler);
        upgrade_four.addActionListener(handler);
        upgrade_five.addActionListener(handler);
        
        System.out.println("button");
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("Action performed");
            mw.actionPerformed(event);
        }
    }

    public JButton getClick() {
        return click;
    }

}
