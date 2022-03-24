package clickster;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JButtonBuild extends JButton {

    //Create button instance up here...
    ImageIcon clickButtonImg;
    URL url_ClickButtonImg;
    
    
    JButton click;
    JButton save;
    JButton load;
    JButton pause;
    JButton reset;
    JButton audio;
    JButton upgrade_one;
    JButton upgrade_two;
    JButton upgrade_three;
    JButton upgrade_four;
    JButton upgrade_five;

    ButtonHandler handler;
    Middleware mw = new Middleware();

    Font font = new Font("Comic Sans MS", Font.PLAIN, 20);

    public JButtonBuild() {
        String directory_url_Click_Button = "file:" + System.getProperty("user.dir") + "/icons/clickbutton.png";

        try{
            url_ClickButtonImg = new URL(directory_url_Click_Button);
        }
        catch(Exception exc){
            exc.getCause();
        }
        
        System.out.println("IMAGE url_ClickButtonImg " + url_ClickButtonImg);
        
        clickButtonImg = new ImageIcon(url_ClickButtonImg);
        
        //Click button... By only settings the action command, it lets us have a picture as the button!
        click = new JButton();
        click.setActionCommand("Click");
        click.setIcon(clickButtonImg);
        click.setBorder(null);
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
        
        //mute button - settings 
        audio = new JButton("Mute");
        audio.setFont(font);

        //Upgrade buttons... 
        upgrade_one = new JButton("Cursor - 50 points");
        upgrade_one.setFont(font);

        upgrade_two = new JButton("Theme Change - 150 points");
        upgrade_two.setFont(font);

        upgrade_three = new JButton("Farm - 300 points");
        upgrade_three.setFont(font);

        upgrade_four = new JButton("Extra Food - 500 points");
        upgrade_four.setFont(font);

        handler = new ButtonHandler();

        //add listeners to each instance here. (see Middleware for the logic it corresponds to...) 
        click.addActionListener(handler);
        save.addActionListener(handler);
        load.addActionListener(handler);
        reset.addActionListener(handler);
        audio.addActionListener(handler);
        upgrade_one.addActionListener(handler);
        upgrade_two.addActionListener(handler);
        upgrade_three.addActionListener(handler);
        upgrade_four.addActionListener(handler);
        
        
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
