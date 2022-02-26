package clickster;

import java.awt.Font;
import javax.swing.JLabel;

public class JLabelBuild extends JLabel {

    static JLabel pointsAmt;
    ClickDB ClickDB = new ClickDB();
    JLabel shopTitle = new JLabel("Spend all of your points on these items please, or else :D!");
    JLabel settingsTitle = new JLabel("Settings here soon.");

    public JLabelBuild() {
        pointsAmt = new JLabel("Points: " + ClickDB.getPoints());
        pointsAmt.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        shopTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    }

    public JLabel getPointsLabel() {
        return pointsAmt;
    }

    public void changePointsLabel() {
        pointsAmt.setText("Points: " + ClickDB.getPoints());
    }

}
