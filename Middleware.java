package clickster;

import java.awt.event.ActionEvent;

public class Middleware {
//The class that controls all button logic in the game.

    Pane gui;
    JLabelBuild jLabelBuild = new JLabelBuild();
    ClickDB ClickDB = new ClickDB();
    SaveSystem SaveSystem = new SaveSystem();

    public void actionPerformed(ActionEvent e) {
        //When something that has a listener is hit, it will display the source.
        System.out.println("Source: " + e.getSource());

        //Based on name of button that is hit - it goes into the .equals("...") section.
        if (e.getActionCommand().equals("Click")) {
            System.out.println("Clicked");
            ClickDB.increasePoints();
            jLabelBuild.changePointsLabel();
        }

        if (e.getActionCommand().equals("Save")) {
            System.out.println("Saved");
            SaveSystem.saveGame();
        }

//Force a load if necessary... not really needed though.
//        if (e.getActionCommand().equals("Load")) {
//            System.out.println("Loaded");
//            SaveSystem.loadGame();
//            
//        }
        if (e.getActionCommand().equals("Reset")) {
            System.out.println("Resetting");
            ClickDB.setPointsZero();
            ClickDB.setMultiplier(1);
            SaveSystem.saveGame();
            jLabelBuild.changePointsLabel();
        }

        if (e.getActionCommand().equals("50 CLICKS - Upgrade click power by 1%")) {
            if(ClickDB.getPoints() >= 50){
            System.out.println("Click power increased by 1%!");
            ClickDB.changeMultipler(.01f);
            ClickDB.removePoints(50);
            jLabelBuild.changePointsLabel();
            }
        }

        if (e.getActionCommand().equals("Upgrade 2")) {

        }

        if (e.getActionCommand().equals("Upgrade 3")) {

        }

        if (e.getActionCommand().equals("Upgrade 4")) {

        }

        if (e.getActionCommand().equals("Upgrade 5")) {

        }

    }
}
