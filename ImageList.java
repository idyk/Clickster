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
    //New image? First, make a new ImageIcon object for each image or gif. Follow the process through the comments below.
    ImageIcon A_stage1;
    ImageIcon A_stage2;

    //Then... initialize a URL for the file.
    URL url_A_stage1;
    URL url_A_stage2;

    public ImageList() {
        String directory_url_A_stage1 = "file:" + System.getProperty("user.dir") + "/icons/A_stage1.gif";
        String directory_url_A_stage2 = "file:" + System.getProperty("user.dir") + "/icons/A_stage1.png";
        try {
            //Make the URL.
            url_A_stage1 = new URL(directory_url_A_stage1);
            url_A_stage2 = new URL(directory_url_A_stage2);
        } catch (Exception exc) {
            exc.getCause();
        }
        System.out.println("IMAGE url_A_stage1: " + url_A_stage1);

        //Finalize the ImageIcon objects.
        A_stage1 = new ImageIcon(url_A_stage1);
        A_stage2 = new ImageIcon(url_A_stage2);

        //Add it to the imageList. This is used for saving the user's index.
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
