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
    Audio audio = new Audio();

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

            if (ClickDB.getMuteFlag() == false) {
                System.out.println("mute flag is " + ClickDB.getMuteFlag());
                audio.playOnce("file:/" + System.getProperty("user.dir") + "/sound/click.wav");
            }
        }

        if (e.getActionCommand().equals("Save")) {
            if (ClickDB.getMuteFlag() == false) {

                audio.playOnce("file:/" + System.getProperty("user.dir") + "/sound/save.wav");

            }
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
            ClickDB.setMilestoneThreeFlag(false);
            ClickDB.setMilestoneFourFlag(false);
            ClickDB.setMilestoneFiveFlag(false);
            ClickDB.setMilestoneBonusZero();
            SaveSystem.saveGame();
            System.exit(0);
        }

        if (e.getActionCommand().equals("Mute")) {
            System.out.println("Muting");
            ClickDB.setMuteFlag(true);
            audio.mute();
        }

        if (e.getActionCommand().equals("Unmute")) {
            System.out.println("Unmuting");
            ClickDB.setMuteFlag(false);
            audio.unmute();
        }

//        First of many upgrades. Checks if user has 50 points/clicks, increases the "click power" by 1% if they do.
//        Updates multiplier, removes points, changes label.
        if (e.getActionCommand().equals("Poke - 50 points")) {
            if (ClickDB.getPoints() >= 50) {
                System.out.println("Click power increased by 1%!");
                ClickDB.changeMultipler(.01f);
                ClickDB.removePoints(50);
                jLabelBuild.changePointsLabel();
                jLabelBuild.changeMultiplierLabel();
            }
        }

        //Used for progressing through the stages of the creature.
        if (e.getActionCommand().equals("Progress the lifecycle... - 600 points")) {
            System.out.println("ClickDB image index: " + ClickDB.getImageIndex());
            if (ClickDB.getImageIndex() < imageList.imageList.size() - 1 && ClickDB.getPoints() >= 600) {
                ClickDB.removePoints(600);
                System.out.println("Image changed.");
                try {
                    ClickDB.setImageIndex(1);
                    imageList.changeImage();
                } catch (IndexOutOfBoundsException oob) {
                    System.out.println("There is not another creature in the list! " + oob.getMessage());
                }
            } else if (ClickDB.getImageIndex() == imageList.imageList.size() - 1) {
                System.out.println("max index");

            }
        }

        if (e.getActionCommand().equals("Farm - 500 points")) {
            if (ClickDB.getPoints() >= 500) {
                System.out.println("Click power increased by 12%!");
                ClickDB.changeMultipler(.12f);
                ClickDB.removePoints(300);
                jLabelBuild.changePointsLabel();
                jLabelBuild.changeMultiplierLabel();
            }
        }

        if (e.getActionCommand().equals("Extra Food - 2000 points")) {
            if (ClickDB.getPoints() >= 2000) {
                System.out.println("Click power increased by 45%!");
                ClickDB.changeMultipler(.45f);
                ClickDB.removePoints(500);
                jLabelBuild.changePointsLabel();
                jLabelBuild.changeMultiplierLabel();
            }
        }

    }
}
