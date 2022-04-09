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
    ImageIcon egg_chick;
    ImageIcon egg_cracked_chick;
    ImageIcon animal_chick;
    ImageIcon egg_cow;
    ImageIcon egg_cracked_cow;
    ImageIcon animal_cow;
    ImageIcon egg_horse;
    ImageIcon egg_cracked_horse;
    ImageIcon animal_horse;
    ImageIcon egg_pig;
    ImageIcon egg_cracked_pig;
    ImageIcon animal_pig;
    ImageIcon egg_rooster;
    ImageIcon egg_cracked_rooster;
    ImageIcon animal_rooster;

    //shop images
    ImageIcon cursor;
    ImageIcon farmer;
    ImageIcon farm;
    ImageIcon plate;
    ImageIcon egg;

    //Then... initialize a URL for the file.
    URL url_egg_chick;
    URL url_egg_cracked_chick;
    URL url_animal_chick;
    URL url_egg_cow;
    URL url_egg_cracked_cow;
    URL url_animal_cow;
    URL url_egg_horse;
    URL url_egg_cracked_horse;
    URL url_animal_horse;
    URL url_egg_pig;
    URL url_egg_cracked_pig;
    URL url_animal_pig;
    URL url_egg_rooster;
    URL url_egg_cracked_rooster;
    URL url_animal_rooster;

    URL url_cursor;
    URL url_farmer;
    URL url_farm;
    URL url_plate;
    URL url_egg;

    public ImageList() {
        String directory_url_cursor = "file:" + System.getProperty("user.dir") + "/icons/cursor.png";
        String directory_url_farmer = "file:" + System.getProperty("user.dir") + "/icons/farmer.png";
        String directory_url_farm = "file:" + System.getProperty("user.dir") + "/icons/farm.png";
        String directory_url_plate = "file:" + System.getProperty("user.dir") + "/icons/plate.png";
        String directory_url_egg = "file:" + System.getProperty("user.dir") + "/icons/egg.png";

        String directory_url_egg_chick = "file:" + System.getProperty("user.dir") + "/icons/egg_chick.gif";
        String directory_url_egg_cracked_chick = "file:" + System.getProperty("user.dir") + "/icons/egg_cracked_chick.gif";
        String directory_url_animal_chick = "file:" + System.getProperty("user.dir") + "/icons/animal_chick.gif";
        String directory_url_egg_cow = "file:" + System.getProperty("user.dir") + "/icons/egg_cow.gif";
        String directory_url_egg_cracked_cow = "file:" + System.getProperty("user.dir") + "/icons/egg_cracked_cow.gif";
        String directory_url_animal_cow = "file:" + System.getProperty("user.dir") + "/icons/animal_cow.gif";
        String directory_url_egg_horse = "file:" + System.getProperty("user.dir") + "/icons/egg_horse.gif";
        String directory_url_egg_cracked_horse = "file:" + System.getProperty("user.dir") + "/icons/egg_cracked_horse.gif";
        String directory_url_animal_horse = "file:" + System.getProperty("user.dir") + "/icons/animal_horse.gif";
        String directory_url_egg_pig = "file:" + System.getProperty("user.dir") + "/icons/egg_pig.gif";
        String directory_url_egg_cracked_pig = "file:" + System.getProperty("user.dir") + "/icons/egg_cracked_pig.gif";
        String directory_url_animal_pig = "file:" + System.getProperty("user.dir") + "/icons/animal_pig.gif";
        String directory_url_egg_rooster = "file:" + System.getProperty("user.dir") + "/icons/egg_rooster.gif";
        String directory_url_egg_cracked_rooster = "file:" + System.getProperty("user.dir") + "/icons/egg_cracked_rooster.gif";
        String directory_url_animal_rooster = "file:" + System.getProperty("user.dir") + "/icons/animal_rooster.gif";

        try {
            //Make the URL.
            url_egg_chick = new URL(directory_url_egg_chick);
            url_egg_cracked_chick = new URL(directory_url_egg_cracked_chick);
            url_animal_chick = new URL(directory_url_animal_chick);
            url_egg_cow = new URL(directory_url_egg_cow);
            url_egg_cracked_cow = new URL(directory_url_egg_cracked_cow);
            url_animal_cow = new URL(directory_url_animal_cow);
            url_egg_horse = new URL(directory_url_egg_horse);
            url_egg_cracked_horse = new URL(directory_url_egg_cracked_horse);
            url_animal_horse = new URL(directory_url_animal_horse);
            url_egg_pig = new URL(directory_url_egg_pig);
            url_egg_cracked_pig = new URL(directory_url_egg_cracked_pig);
            url_animal_pig = new URL(directory_url_animal_pig);
            url_egg_rooster = new URL(directory_url_egg_rooster);
            url_egg_cracked_rooster = new URL(directory_url_egg_cracked_rooster);
            url_animal_rooster = new URL(directory_url_animal_rooster);

            url_cursor = new URL(directory_url_cursor);
            url_farmer = new URL(directory_url_farmer);
            url_farm = new URL(directory_url_farm);
            url_plate = new URL(directory_url_plate);
            url_egg = new URL(directory_url_egg);

        } catch (Exception exc) {
            exc.getCause();
        }
        System.out.println("IMAGE url_A_stage1: " + url_egg_chick);
        //Finalize the ImageIcon objects.
        egg_chick = new ImageIcon(url_egg_chick);
        egg_cracked_chick = new ImageIcon(url_egg_cracked_chick);
        animal_chick = new ImageIcon(url_animal_chick);
        egg_cow = new ImageIcon(url_egg_cow);
        egg_cracked_cow = new ImageIcon(url_egg_cracked_cow);
        animal_cow = new ImageIcon(url_animal_cow);
        egg_horse = new ImageIcon(url_egg_horse);
        egg_cracked_horse = new ImageIcon(url_egg_cracked_horse);
        animal_horse = new ImageIcon(url_animal_horse);
        egg_pig = new ImageIcon(url_egg_pig);
        egg_cracked_pig = new ImageIcon(url_egg_cracked_pig);
        animal_pig = new ImageIcon(url_animal_pig);
        egg_rooster = new ImageIcon(url_egg_rooster);
        egg_cracked_rooster = new ImageIcon(url_egg_cracked_rooster);
        animal_rooster = new ImageIcon(url_animal_rooster);

        cursor = new ImageIcon(url_cursor);
        farmer = new ImageIcon(url_farmer);
        farm = new ImageIcon(url_farm);
        plate = new ImageIcon(url_plate);
        egg = new ImageIcon(url_egg);

        // **STOP HERE** Add it to the imageList. This is used for saving the user's index.
        imageList.add(egg_chick);
        imageList.add(egg_cracked_chick);
        imageList.add(animal_chick);
        imageList.add(egg_cow);
        imageList.add(egg_cracked_cow);
        imageList.add(animal_cow);
        imageList.add(egg_horse);
        imageList.add(egg_cracked_horse);
        imageList.add(animal_horse);
        imageList.add(egg_pig);
        imageList.add(egg_cracked_pig);
        imageList.add(animal_pig);
        imageList.add(egg_rooster);
        imageList.add(egg_cracked_rooster);
        imageList.add(animal_rooster);

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
