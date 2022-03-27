/*CSI 3370 Project - CLICKSTER
v1.04
 */
package clickster;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.io.IOException;
import java.net.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Clickster {
    
    public void actionPerformed(ActionEvent s) throws UnsupportedAudioFileException, IOException, MalformedURLException, LineUnavailableException {
            String soundDirectory = "file:" + System.getProperty("user.dir") + "/sound/test.wav";
            URL url = new URL(soundDirectory);
            System.out.println(soundDirectory);
        
        //When something that has a listener is hit, it will display the source.
            System.out.println("Source: " + s.getSource());
        
            Clip audio = AudioSystem.getClip();
            AudioInputStream input = AudioSystem.getAudioInputStream(url);
            audio.open(input);
            audio.loop(Clip.LOOP_CONTINUOUSLY);
        
 
        if (s.getActionCommand().equals("Mute")) {
                audio.stop();
            }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, MalformedURLException, LineUnavailableException {
        SaveSystem SaveSystem = new SaveSystem();
        JLabelBuild jLabelBuild = new JLabelBuild();
        Milestone ms = new Milestone();

        //Loads save upon start up.
        SaveSystem.loadGame();
        jLabelBuild.revalidate();

        //Check milestones on start up.
        ms.checkAllMilestones();
        
        //Load milestone statuses.
        jLabelBuild.changeMilestoneStatusLabels();
        
       // The way this directory is set up should make it universal for each user's system to run correctly...
//        String soundDirectory = "file:" + System.getProperty("user.dir") + "/sound/test.wav";
//        URL url = new URL(soundDirectory);
//        System.out.println(soundDirectory);
//
//      //  Plays starting track upon start up.
//        Clip audio = AudioSystem.getClip();
//        AudioInputStream input = AudioSystem.getAudioInputStream(url);
//        audio.open(input);
//        audio.loop(Clip.LOOP_CONTINUOUSLY);
//        //audio.stop();
////        
//  
///      if (e.getActionCommand().equals("Mute")) {
//       if (audio == null) {
//               audio.(); // true mutes, false unmutes
           

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


    
    
