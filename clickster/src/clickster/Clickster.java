/*CSI 3370 Project - CLICKSTER
Final Build!
 */
package clickster;

import javax.swing.JFrame;
import java.io.IOException;
import java.net.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Clickster {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, MalformedURLException, LineUnavailableException {
        SaveSystem SaveSystem = new SaveSystem();
        JLabelBuild jLabelBuild = new JLabelBuild();
        Milestone ms = new Milestone();
        Audio audio = new Audio();
        ImageList imageList = new ImageList();
        ClickDB ClickDB = new ClickDB();
        
        //Loads save upon start up.
        SaveSystem.loadGame();
        jLabelBuild.revalidate();

        //Check milestones on start up.
        ms.checkAllMilestones();
        
        //Load milestone statuses.
        jLabelBuild.changeMilestoneStatusLabels();
        
        if(ClickDB.getMilestoneFiveFlag() == false){
        audio.play("file:/" + System.getProperty("user.dir") + "/sound/test.wav");
        }
        else{
            audio.play("file:/" + System.getProperty("user.dir") + "/sound/testWin.wav");
        }

        Pane gui = new Pane();
        gui.storeRef(gui);
        gui.setTitle("Clickster 9000");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setResizable(false);
        gui.setSize(900, 550);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        System.out.println("main");
    }
}


    
    

