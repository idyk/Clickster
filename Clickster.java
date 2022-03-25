/*CSI 3370 Project - CLICKSTER
v1.04
 */
package clickster;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.io.IOException;
import java.net.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class Clickster {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, MalformedURLException, LineUnavailableException {
        SaveSystem SaveSystem = new SaveSystem();
        JLabelBuild jLabelBuild = new JLabelBuild();
        Milestone ms = new Milestone();
        Audio audio = new Audio();
        ImageList imageList = new ImageList();
        //Loads save upon start up.
        SaveSystem.loadGame();
        jLabelBuild.revalidate();

        //Check milestones on start up.
        ms.checkAllMilestones();
        
        //Load milestone statuses.
        jLabelBuild.changeMilestoneStatusLabels();
        
        audio.play("file:/" + System.getProperty("user.dir") + "/sound/test.wav");

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


    
    

