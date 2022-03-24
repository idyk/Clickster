package clickster;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Basic Save System.
public class SaveSystem {

    JLabelBuild jLabelBuild = new JLabelBuild();
    File file = new File("UserData.txt");
    ClickDB ClickDB = new ClickDB();

    //ANY NUMERIC VALUES USE FLOAT. IF AN INT FROM HERE IS NEEDED SOMEWHERE ELSE IN ANOTHER CLASS, JUST CAST IT TO AN INT THERE.
    float points = 0.0f;
    float multiplier = 1.0f;
    float totalClicksDone = 0.0f;
    float imageIndex = 0;
    float milestoneBonus = 0.0f;

    boolean milestoneOneFlag = false;
    boolean milestoneTwoFlag = false;

    List<Float> fileFloatValues = new ArrayList<>();
    List<Boolean> fileBooleanValues = new ArrayList<>();

    public void saveGame() {
        points = ClickDB.getPoints();
        multiplier = ClickDB.getMultiplier();
        imageIndex = ClickDB.getImageIndex();
        totalClicksDone = ClickDB.getTotalClicksDone();
        milestoneBonus = ClickDB.getMilestoneBonus();
        milestoneOneFlag = ClickDB.getMilestoneOneFlag();
        milestoneTwoFlag = ClickDB.getMilestoneTwoFlag();
        System.out.println("Saving data...");
        file.delete(); //deletes old file, makes new file with updated data after
        try {
            PrintWriter pw = new PrintWriter(file);
            //NEED NEW LINE AFTER EVERY ENTRY UNLESS IT'S THE LAST ENTRY.
            pw.write("points " + points);
            pw.write("\n");
            pw.write("multiplier " + multiplier);
            pw.write("\n");
            pw.write("total_clicks_done " + totalClicksDone);
            pw.write("\n");
            pw.write("imageindex " + imageIndex);
            pw.write("\n");
            pw.write("milestone_bonus " + milestoneBonus);
            pw.write("\n");
            pw.write("milestone_one " + milestoneOneFlag);
            pw.write("\n");
            pw.write("milestone_two " + milestoneTwoFlag);
            pw.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    //Uses BufferedReader to load the saved .txt file. 
    //This stores separate data types into separate lists for access later on.
    //Example as seen below: first float would be in an float list with index 0, first boolean would be in a boolean list with index 0.
    public void loadGame() {
        try (BufferedReader BufferedReader = new BufferedReader(new FileReader(file))) {
            Scanner fileScanFloat = new Scanner(file);
            Scanner fileScanBoolean = new Scanner(file);
            Scanner fileScanInt = new Scanner(file);
            System.out.println("Loading data...");
            while (fileScanFloat.hasNext()) {
                if (fileScanFloat.hasNextFloat()) {
                    fileFloatValues.add(fileScanFloat.nextFloat());
                    System.out.println(fileFloatValues);
                } else {

                    fileScanFloat.next();
                }

                while (fileScanBoolean.hasNext()) {
                    if (fileScanBoolean.hasNextBoolean()) {
                        fileBooleanValues.add(fileScanBoolean.nextBoolean());
                        System.out.println(fileBooleanValues);
                    } else {
                        fileScanBoolean.next();
                    }
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
        try {
            ClickDB.setPoints(fileFloatValues.get(0)); //index 0 of float list = user's points amount
            ClickDB.setMultiplier(fileFloatValues.get(1)); //index 1 of float list = user's multiplier
            ClickDB.setTotalClicksDone(fileFloatValues.get(2)); //index 2 of float list = user's total amount of clicks
            ClickDB.setImageIndex(fileFloatValues.get(3)); //index 3 of float list = user's saved creature image progress
            ClickDB.setMilestoneBonus(fileFloatValues.get(4)); // index 4 of float list = user's saved Milestone Bonus 
            ClickDB.setMilestoneOneFlag(fileBooleanValues.get(0)); //index 0 of boolean list = user's saved Milestone One progress
            ClickDB.setMilestoneTwoFlag(fileBooleanValues.get(1)); //index 1 of boolean list = user's saved Milestone Two progress
            

            System.out.println("Saved Points: " + fileFloatValues.get(0));
            System.out.println("Saved Multiplier: " + fileFloatValues.get(1));
            System.out.println("Saved Total Clicks: " + fileFloatValues.get(2));
            System.out.println("Saved Image Index: " + fileFloatValues.get(3));
            System.out.println("Saved Milestone Bonus: " + fileFloatValues.get(4));
            System.out.println("Saved Milestone 1 Status: " + fileBooleanValues.get(0));
            System.out.println("Saved Milestone 2 Status: " + fileBooleanValues.get(1));

        } catch (Exception e) {
            e.getCause();
        }
        jLabelBuild.changePointsLabel();
        jLabelBuild.changeMilestoneStatusLabels();
        jLabelBuild.changeClicksLabel();
    }

}
