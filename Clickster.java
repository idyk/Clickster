package clickster;

import javax.swing.JFrame;
import java.io.IOException;
import java.net.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Clickster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, MalformedURLException, LineUnavailableException {
        SaveSystem SaveSystem = new SaveSystem();
        JLabelBuild jLabelBuild = new JLabelBuild();

        //Loads save upon start up.
        SaveSystem.loadGame();
        jLabelBuild.revalidate();

        //Should make this compatible no matter how it's ran...... assuming every folder is where it should be.
        String soundDirectory = "file:/" + System.getProperty("user.dir") + "/sound/test.wav";
        URL url = new URL(soundDirectory);
        System.out.println(soundDirectory);

        //Plays starting track upon start up.
        Clip audio = AudioSystem.getClip();
        AudioInputStream input = AudioSystem.getAudioInputStream(url);
        audio.open(input);
        audio.loop(Clip.LOOP_CONTINUOUSLY);

        Pane gui = new Pane();
        gui.storeRef(gui);
        gui.setTitle("Clickster 9000");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setResizable(false);
        gui.setSize(700, 550);
        gui.setLocationRelativeTo(null);
        gui.revalidate();
        gui.repaint();
        gui.setVisible(true);
    }

}
