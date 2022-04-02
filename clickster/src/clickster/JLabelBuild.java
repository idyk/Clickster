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
    static JLabel multiplierAmt;
    static JLabel milestoneOneStatus;
    static JLabel milestoneTwoStatus;
    static JLabel milestoneThreeStatus;
    static JLabel milestoneFourStatus;
    static JLabel milestoneFiveStatus;

    ImageIcon clickTop;
    URL url_clickTop;

    //Shop icons
    ImageIcon cursor;
    URL url_cursor;
    ImageIcon farmer;
    URL url_farmer;

    // Trying to get images to show up 
    JLabel shopTitle = new JLabel("Welcome to the shop! Buy some stuff!");

    JLabel u1_image = new JLabel(new ImageIcon("icons/cursor.png"));
    JLabel u1_descript = new JLabel("You poke the creature and gain 1% clicking power.", SwingConstants.CENTER);

//    JLabel u2_image = new JLabel(new ImageIcon("icons/farmer.png"));
//    JLabel u2_descript = new JLabel("Upgrade click power by 'X'%");
    JLabel u2_image = new JLabel(new ImageIcon("icons/egg.png"));
    JLabel u2_descript = new JLabel("Continue the lifecycle.", SwingConstants.CENTER);

    JLabel u3_image = new JLabel(new ImageIcon("icons/farm.png"));
    JLabel u3_descript = new JLabel("Your farm is growing! Grow your click power by 12%!", SwingConstants.CENTER);

    JLabel u4_image = new JLabel(new ImageIcon("icons/plate.png"));
    JLabel u4_descript = new JLabel("<html> <p>Extra food boosts your creature's speed,</p> <p> upgrade your click power by 45%! </p> </html>", SwingConstants.CENTER);

    JLabel save = new JLabel("Save your progress.", SwingConstants.CENTER);
    JLabel reset = new JLabel("Reset and close the game.", SwingConstants.CENTER);
    JLabel mute = new JLabel("Mute the game's sound.", SwingConstants.CENTER);
    JLabel unmute = new JLabel("Unmute the game's sound.", SwingConstants.CENTER);

//    JLabel u2_image = new JLabel(new ImageIcon("icons/egg.png"));
//    JLabel u2_descript = new JLabel("Extra food boosts your speed, upgrade click power by 'X'%");
    JLabel settingsTitle = new JLabel("Select from a variety of settings!");
    JLabel milestoneTitle = new JLabel("Achieve various milestones for various passive upgrades!");

    ClickDB ClickDB = new ClickDB();

    Font font = new Font("Comic Sans MS", Font.BOLD, 20);
    Font msFont = new Font("Comic Sans MS", Font.PLAIN, 14);

    public JLabelBuild() {
        System.out.println("caller: " + Thread.currentThread().getStackTrace()[2].getClassName());
        pointsAmt = new JLabel("Points: " + ClickDB.getPoints());
        clicksAmt = new JLabel("Clicks: " + ClickDB.getTotalClicksDone());
        multiplierAmt = new JLabel("Multiplier: " + ClickDB.getMultiplier());
        milestoneOneStatus = new JLabel("<html> <b> <center> Milestone One: Getting Started </center> </b> Keep on clicking! Click 50 times for a +0.5 points bonus! <br> <center> Your milestone status currently is: " + ClickDB.getMilestoneOneFlag() + "</center></html> ");
        milestoneTwoStatus = new JLabel("<html> <b> <center> Milestone Two: Getting Further </center> </b> Don't stop clicking! Click 100 times for a +0.5 points bonus!<br> <center> Your milestone status currently is: " + ClickDB.getMilestoneTwoFlag() + "</center></html> ");
        milestoneThreeStatus = new JLabel("<html> <b> <center> Milestone Three: Click Learner </center> </b> Just keep clicking! Click 1000 times for a +0.5 points bonus! <br> <center> Your milestone status currently is: " + ClickDB.getMilestoneThreeFlag() + "</center></html> ");
        milestoneFourStatus = new JLabel("<html> <b> <center> Milestone Four: Click Pro </center> </b> Good, you're still clicking. Click 5000 times for a +0.5 points bonus! <br> <center> Your milestone status currently is: " + ClickDB.getMilestoneFourFlag() + "</center></html> ");
        milestoneFiveStatus = new JLabel("<html> <b> <center> Milestone Five: Clickster </center> </b> You have accomplished everything. Click 9000 times and also reach the last animal to win! <br> <center> Your milestone status currently is: " + ClickDB.getMilestoneFiveFlag() + "</center></html> ");

        pointsAmt.setFont(font);
        clicksAmt.setFont(font);
        multiplierAmt.setFont(font);
        shopTitle.setFont(font);
        settingsTitle.setFont(font);
        milestoneTitle.setFont(font);
        milestoneOneStatus.setFont(msFont);
        milestoneTwoStatus.setFont(msFont);
        milestoneThreeStatus.setFont(msFont);
        milestoneFourStatus.setFont(msFont);
        milestoneFiveStatus.setFont(msFont);
        u1_descript.setFont(msFont);
        u2_descript.setFont(msFont);
        u3_descript.setFont(msFont);
        u4_descript.setFont(msFont);
        save.setFont(msFont);
        reset.setFont(msFont);
        mute.setFont(msFont);
        unmute.setFont(msFont);

    }

    public JLabel getPointsLabel() {
        return pointsAmt;
    }

    public JLabel getClicksLabel() {
        return clicksAmt;
    }

    public JLabel getMultiplierLabel() {
        return multiplierAmt;
    }

    public JLabel getMilestoneOneStatusLabel() {
        return milestoneOneStatus;
    }

    public JLabel getMilestoneTwoStatusLabel() {
        return milestoneTwoStatus;
    }

    public JLabel getMilestoneThreeStatusLabel() {
        return milestoneThreeStatus;
    }

    public JLabel getMilestoneFourStatusLabel() {
        return milestoneFourStatus;
    }

    public JLabel getMilestoneFiveStatusLabel() {
        return milestoneFiveStatus;
    }

    public void changePointsLabel() {
        pointsAmt.setText("Points: " + ClickDB.getPoints());
    }

    public void changeClicksLabel() {
        clicksAmt.setText("Clicks: " + ClickDB.getTotalClicksDone());
    }
    
    public void changeMultiplierLabel(){
        multiplierAmt.setText("Multiplier: " + ClickDB.getMultiplier());
    }

    public void changeMilestoneStatusLabels() {
        milestoneOneStatus.setText("<html> <b> <center> Milestone One: Getting Started </center> </b> Keep on clicking! Click 50 times for a +0.5 points bonus! <br> <center> Your milestone status currently is: " + ClickDB.getMilestoneOneFlag() + "</center></html> ");
        milestoneTwoStatus.setText("<html> <b> <center> Milestone Two: Getting Further </center> </b> Don't stop clicking! Click 100 times for a +0.5 points bonus!<br> <center> Your milestone status currently is: " + ClickDB.getMilestoneTwoFlag() + "</center></html> ");
        milestoneThreeStatus.setText("<html> <b> <center> Milestone Three: Click Learner </center> </b> Just keep clicking! Click 1000 times for a +0.5 points bonus! <br> <center> Your milestone status currently is: " + ClickDB.getMilestoneThreeFlag() + "</center></html> ");
        milestoneFourStatus.setText("<html> <b> <center> Milestone Four: Click Pro </center> </b> Good, you're still clicking. Click 5000 times for a +0.5 points bonus! <br> <center> Your milestone status currently is: " + ClickDB.getMilestoneFourFlag() + "</center></html> ");
        milestoneFiveStatus.setText("<html> <b> <center> Milestone Five: Clickster </center> </b> You have accomplished everything. Click 9000 times and also reach the last animal to win! <br> <center> Your milestone status currently is: " + ClickDB.getMilestoneFiveFlag() + "</center></html> ");

    }

}
