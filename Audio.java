package clickster;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Audio {

    static Clip audio;

    public void play(String filepath){

        //The way this directory is set up should make it universal for each user's system to run correctly...
        try{
        String soundDirectory = filepath;
        URL url = new URL(soundDirectory);
        System.out.println(soundDirectory);

        //Plays track from filepath.
        audio = AudioSystem.getClip();
 
        AudioInputStream input = AudioSystem.getAudioInputStream(url);
        audio.open(input);
        audio.start();
        audio.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void mute(){
        try{
        audio.stop();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void unmute(){
        try{
            audio.start();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    //Good for sound effects!
    public void playOnce(String filepath){

        //The way this directory is set up should make it universal for each user's system to run correctly...
        try{
        String soundDirectory = filepath;
        URL url = new URL(soundDirectory);
        System.out.println(soundDirectory);

        //Plays track from filepath.
        audio = AudioSystem.getClip();
 
        AudioInputStream input = AudioSystem.getAudioInputStream(url);
        audio.open(input);
        audio.start();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

}
