package clickster;

import java.awt.Font;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;

public class JLabelBuild extends JLabel {

    //If any JLabels have updates during start up or run time, they need to be made static.
    static JLabel pointsAmt;
    static JLabel clicksAmt;
    static JLabel milestoneOneStatus;
    static JLabel milestoneTwoStatus;

    ImageIcon clickTop;
    URL url_clickTop;
    
    //Shop icons
    ImageIcon cursor;
    URL url_cursor;
    ImageIcon farmer;
    URL url_farmer;
            
    
   
      
   // Trying to get images to show up 
   
    
    JLabel shopTitle = new JLabel("Spend all of your points on these items please, or else :D!");
    
    JLabel u1_image = new JLabel(new ImageIcon("icons/cursor.png"));
    JLabel u1_descript = new JLabel("Upgrade click power by 1%");
    
//    JLabel u2_image = new JLabel(new ImageIcon("icons/farmer.png"));
//    JLabel u2_descript = new JLabel("Upgrade click power by 'X'%");
    
    JLabel u2_image = new JLabel(new ImageIcon("icons/egg.png"));
    JLabel u2_descript = new JLabel("A new animal came to the farm!");
    
    JLabel u3_image = new JLabel(new ImageIcon("icons/farm.png"));
    JLabel u3_descript = new JLabel("You farm is growing, grow click power by 3%");
    
    JLabel u4_image = new JLabel(new ImageIcon("icons/plate.png"));
    JLabel u4_descript = new JLabel("Extra food boosts your speed, upgrade click power by 5%");
    
//    JLabel u2_image = new JLabel(new ImageIcon("icons/egg.png"));
//    JLabel u2_descript = new JLabel("Extra food boosts your speed, upgrade click power by 'X'%");
    
    
    JLabel settingsTitle = new JLabel("Select from a variety of settings, they will probably help you!");
    JLabel milestoneTitle = new JLabel("Achieve various milestones for various passive upgrades!");

    ClickDB ClickDB = new ClickDB();

    Font font = new Font("Comic Sans MS", Font.BOLD, 20);
    Font msFont = new Font("Comic Sans MS", Font.PLAIN, 14);

    public JLabelBuild() {
        System.out.println("caller: " + Thread.currentThread().getStackTrace()[2].getClassName());
        pointsAmt = new JLabel("Points: " + ClickDB.getPoints());
        clicksAmt = new JLabel("Clicks: " + ClickDB.getTotalClicksDone());
        milestoneOneStatus = new JLabel("<html> <b> <center> Milestone One: Getting Started! </center> </b>Click 50 times for +0.5 points bonus! Your milestone status currently is: " + ClickDB.getMilestoneOneFlag() + "</html> ");
        milestoneTwoStatus = new JLabel("<html> <b> <center> Milestone Two: Getting Further! </center> </b>Click 100 times for +0.5 points bonus! Your milestone status currently is: " + ClickDB.getMilestoneTwoFlag() + "</html> ");
        pointsAmt.setFont(font);
        clicksAmt.setFont(font);
        shopTitle.setFont(font);
        settingsTitle.setFont(font);
        milestoneTitle.setFont(font);
        milestoneOneStatus.setFont(msFont);
        milestoneTwoStatus.setFont(msFont);
    }

    public JLabel getPointsLabel() {
        return pointsAmt;
    }

    public JLabel getClicksLabel() {
        return clicksAmt;
    }

    public JLabel getMilestoneOneStatusLabel() {
        return milestoneOneStatus;
    }

    public JLabel getMilestoneTwoStatusLabel() {
        return milestoneTwoStatus;
    }


    public void changePointsLabel() {
        pointsAmt.setText("Points: " + ClickDB.getPoints());
    }

    public void changeClicksLabel() {
        clicksAmt.setText("Clicks: " + ClickDB.getTotalClicksDone());
    }

    public void changeMilestoneStatusLabels() {
        milestoneOneStatus.setText("<html> <b> <center> Milestone One: Getting Started! </center> </b>Click 50 times for +0.5 points bonus! Your milestone status currently is: " + ClickDB.getMilestoneOneFlag() + "</html> ");
        milestoneTwoStatus.setText("<html> <b> <center> Milestone Two: Getting Further! </center> </b>Click 100 times for +0.5 points bonus! Your milestone status currently is: " + ClickDB.getMilestoneTwoFlag() + "</html> ");
    }

}
