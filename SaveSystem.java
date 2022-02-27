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
    float points = 0;
    boolean upgrade_one_flag = false;

    float multiplier = 1.0f;

    int imageIndex = 0;

    List<Float> fileFloatValues = new ArrayList<>();
    List<Boolean> fileBooleanValues = new ArrayList<>();
    List<Integer> fileIntValues = new ArrayList<>();
    

    public void saveGame() {
        points = ClickDB.getPoints();
        multiplier = ClickDB.getMultiplier();
        imageIndex = ClickDB.getImageIndex();
        System.out.println("Saving data...");
        file.delete(); //deletes old file, makes new file with updated data after
        try {
            PrintWriter pw = new PrintWriter(file);
            //NEED NEW LINE AFTER EVERY ENTRY UNLESS IT'S THE LAST ENTRY.
            pw.write("points " + points);
            pw.write("\n");
            pw.write("upgrade_one_flag " + upgrade_one_flag);
            pw.write("\n");
            pw.write("multiplier " + multiplier);
            pw.write("\n");
            pw.write("imageindex " + imageIndex);
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
                } else {
                    fileScanFloat.next();
                }
                while (fileScanBoolean.hasNext()) {
                    if (fileScanBoolean.hasNextBoolean()) {
                        fileBooleanValues.add(fileScanBoolean.nextBoolean());
                    } else {
                        fileScanBoolean.next();
                    }
                }
                while (fileScanInt.hasNext()) {
                    if (fileScanInt.hasNextInt()) {
                        fileIntValues.add(fileScanInt.nextInt());
                    } else {
                        fileScanInt.next();
                    }
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
        try {
            ClickDB.setPoints(fileFloatValues.get(0)); //index 0 of float list = user's points amount
            ClickDB.setMultiplier(fileFloatValues.get(1)); //index 1 of float list = user's multiplier
            ClickDB.setImageIndex(fileIntValues.get(0)); //index 0 of int list = user's saved creature image progress
            System.out.println("Saved Points: " + ClickDB.getPoints());
            System.out.println("Saved Multiplier: " + ClickDB.getMultiplier());

        } catch (Exception e) {
            e.getCause();
        }

        jLabelBuild.changePointsLabel();
    }

}
