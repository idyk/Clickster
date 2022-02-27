package clickster;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JLabelBuild extends JLabel {

    //If any JLabels have updates during start up or run time, they need to be made static.
    static JLabel pointsAmt;
    JLabel shopTitle = new JLabel("Spend all of your points on these items please, or else :D!");
    JLabel settingsTitle = new JLabel("Select from a variety of settings, they will probably help you!");

    ClickDB ClickDB = new ClickDB();

    Font font = new Font("Comic Sans MS", Font.BOLD, 20);


    public JLabelBuild() {
        System.out.println("caller: " + Thread.currentThread().getStackTrace()[2].getClassName());
        pointsAmt = new JLabel("Points: " + ClickDB.getPoints());
        pointsAmt.setFont(font);
        shopTitle.setFont(font);
        settingsTitle.setFont(font);   
    }

    public JLabel getPointsLabel() {
        return pointsAmt;
    }

    public void changePointsLabel() {
        pointsAmt.setText("Points: " + ClickDB.getPoints());
    }

}
