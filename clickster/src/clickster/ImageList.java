package clickster;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageList {

    static JLabel imgLabel;
    
    int imageListIndex;

    ClickDB ClickDB = new ClickDB();

    List<ImageIcon> imageList = new ArrayList<>();
 //(1)   //New image? First, make a new ImageIcon object for each image or gif. Follow the process through the comments below.
    ImageIcon A_stage1;
    ImageIcon A_stage2;
    
    //shop images
    ImageIcon cursor;  
    ImageIcon farmer;
    ImageIcon farm;
    ImageIcon plate;
    ImageIcon egg;


    

    //Then... initialize a URL for the file.
    URL url_A_stage1;
    URL url_A_stage2;
    URL url_cursor; 
    URL url_farmer;
    URL url_farm;
    URL url_plate;
    URL url_egg;

    public ImageList() {
        String directory_url_A_stage1 = "file:" + System.getProperty("user.dir") + "/icons/A_stage1.gif";
        String directory_url_A_stage2 = "file:" + System.getProperty("user.dir") + "/icons/A_stage1.png";
        String directory_url_cursor = "file:" + System.getProperty("user.dir") + "/icons/cursor.png";
        String directory_url_farmer = "file:" + System.getProperty("user.dir") + "/icons/farmer.png";
        String directory_url_farm = "file:" + System.getProperty("user.dir") + "/icons/farm.png";
        String directory_url_plate = "file:" + System.getProperty("user.dir") + "/icons/plate.png";
        String directory_url_egg = "file:" + System.getProperty("user.dir") + "/icons/egg.png";

  
        try {
            //Make the URL.
            url_A_stage1 = new URL(directory_url_A_stage1);
            url_A_stage2 = new URL(directory_url_A_stage2);
            url_cursor = new URL(directory_url_cursor);
            url_farmer = new URL(directory_url_farmer);
            url_farm = new URL(directory_url_farm);
            url_plate = new URL(directory_url_plate);
            url_egg = new URL(directory_url_egg);
            
            
        } catch (Exception exc) {
            exc.getCause();
        }
        System.out.println("IMAGE url_A_stage1: " + url_A_stage1);
        
                   

        //Finalize the ImageIcon objects.
        A_stage1 = new ImageIcon(url_A_stage1);
        A_stage2 = new ImageIcon(url_A_stage2);
        cursor = new ImageIcon(url_cursor);
        farmer = new ImageIcon(url_farmer);
        farm = new ImageIcon(url_farm);
        plate = new ImageIcon(url_plate);
        egg = new ImageIcon(url_egg);

        // **STOP HERE** Add it to the imageList. This is used for saving the user's index.
        imageList.add(A_stage1);
        imageList.add(A_stage2);

        
        
        imgLabel = new JLabel();
        imgLabel.setIcon(imageList.get(ClickDB.getImageIndex()));
        System.out.println("imageListIndex = " + ClickDB.getImageIndex());
    }

    public JLabel getImageLabel() {
        return imgLabel;
    }
    
    public void changeImage() {
        System.out.println("New img index: " + imageList.get(ClickDB.getImageIndex()));
        System.out.println("imageList size: " + imageList.size());
        imgLabel.setIcon(imageList.get(ClickDB.getImageIndex()));
    }

}
