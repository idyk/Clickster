package clickster;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Basic Save System that I made! Shouldn't be too hard to implement into project... hopefully.
public class SaveSystem {
    JLabelBuild jLabelBuild = new JLabelBuild();
    File file = new File("UserData.txt");
    ClickDB ClickDB = new ClickDB();
    //This will probably get changed to float since value could eventually get very high.
    int level = 0;
    int points = 0;
    boolean upgrade_one_flag = false;

    List<Integer> fileIntValues = new ArrayList<>();
    List<Boolean> fileBooleanValues = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void saveGame() {
        int points = ClickDB.getValue();
        System.out.println("Saving data...");
        file.delete(); //deletes old file, makes new file with updated data after
        try {
            PrintWriter pw = new PrintWriter(file);
            //NEED NEW LINE AFTER EVERY ENTRY UNLESS IT'S THE LAST ENTRY.
            pw.write("points " + points);
            pw.write("\n");
            pw.write("upgrade_1_flag " + upgrade_one_flag);
            pw.write("\n");
            pw.write("level " + level);
            pw.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    //Uses BufferedReader to load the saved .txt file. 
    //This stores separate data types into separate lists for access later on.
    //Example as seen below: first int would be in an int list with index 0, first boolean would be in a boolean list with index 0.
    public void loadGame() {
        try (BufferedReader BufferedReader = new BufferedReader(new FileReader(file))) {
            Scanner fileScanInt = new Scanner(file);
            Scanner fileScanBoolean = new Scanner(file);
            System.out.println("Loading data...");
            while (fileScanInt.hasNext()) {
                if (fileScanInt.hasNextInt()) {
                    fileIntValues.add(fileScanInt.nextInt());
                } else {
                    fileScanInt.next();
                }
            while (fileScanBoolean.hasNext()) {
                if (fileScanBoolean.hasNextBoolean()) {
                    fileBooleanValues.add(fileScanBoolean.nextBoolean());
                } else {
                    fileScanBoolean.next();
                    }
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
        try{
        ClickDB.setPoints(fileIntValues.get(0)); //index 0 of int = user's points amount
        }
        catch(Exception e){
            e.getCause();
        }
        
        jLabelBuild.changePointsLabel();
    }

}
