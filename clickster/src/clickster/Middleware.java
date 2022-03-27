package clickster;

import java.awt.event.ActionEvent;

public class Middleware {
//The class that controls all button logic in the game. 

    Pane gui;
    JLabelBuild jLabelBuild = new JLabelBuild();
    ImageList imageList = new ImageList();
    ClickDB ClickDB = new ClickDB();
    SaveSystem SaveSystem = new SaveSystem();
    Milestone ms = new Milestone();
    

    public void actionPerformed(ActionEvent e) {
        //When something that has a listener is hit, it will display the source.
        System.out.println("Source: " + e.getSource());

        //Based on name of button that is hit - it goes into the .equals("...") section.
        if (e.getActionCommand().equals("Click")) {
            System.out.println("Clicked");
            ClickDB.increasePoints();
            ClickDB.increaseClickTotal();
            ms.checkAllMilestones();
            jLabelBuild.changePointsLabel();
            jLabelBuild.changeMilestoneStatusLabels();
            jLabelBuild.changeClicksLabel();
        }
        
         if (e.getActionCommand().equals("Click")) {
            System.out.println("Clicked");
            ClickDB.increasePoints();
            ClickDB.increaseClickTotal();
            ms.checkAllMilestones();
            jLabelBuild.changePointsLabel();
            jLabelBuild.changeMilestoneStatusLabels();
            jLabelBuild.changeClicksLabel();
        }

        if (e.getActionCommand().equals("Save")) {
            System.out.println("Saved");
            SaveSystem.saveGame();
        }

        if (e.getActionCommand().equals("Reset")) {
            System.out.println("Resetting");
            ClickDB.setPointsZero();
            ClickDB.setMultiplier(1);
            ClickDB.setImageIndexZero();
            ClickDB.setTotalClicksDone(0);
            ClickDB.setMilestoneOneFlag(false);
            ClickDB.setMilestoneTwoFlag(false);
            ClickDB.setMilestoneBonusZero();
            SaveSystem.saveGame();
            System.exit(0);
        }

//        First of many upgrades. Checks if user has 50 points/clicks, increases the "click power" by 1% if they do.
//        Updates multiplier, removes points, changes label.
        if (e.getActionCommand().equals("Cursor - 50 points")) {
            if (ClickDB.getPoints() >= 50) {
                System.out.println("Click power increased by 1%!");
                ClickDB.changeMultipler(.01f);
                ClickDB.removePoints(50);
                jLabelBuild.changePointsLabel();
            }
        }
              


        //Testing at the moment, but will be used for progressing through the stages of the creature.
        if (e.getActionCommand().equals("Testing - change image")) {
            if (ClickDB.getImageIndex() < imageList.imageList.size() - 1) {
                System.out.println("Image changed.");
                try {
                    ClickDB.setImageIndex(1);
                    imageList.changeImage();
                } catch (IndexOutOfBoundsException oob) {
                    System.out.println("There is not another creature in the list! " + oob.getMessage());
                }
            }
        }

         if (e.getActionCommand().equals("Farm - 300 points")) {
            if (ClickDB.getPoints() >= 300) {
                System.out.println("Click power increased by 3%!");
                ClickDB.changeMultipler(.03f);
                ClickDB.removePoints(300);
                jLabelBuild.changePointsLabel();
            }
        }
         
          if (e.getActionCommand().equals("Extra Food - 500 points")) {
            if (ClickDB.getPoints() >= 500) {
                System.out.println("Click power increased by 5%!");
                ClickDB.changeMultipler(.05f);
                ClickDB.removePoints(500);
                jLabelBuild.changePointsLabel();
            }
        }

        

   

    }
}