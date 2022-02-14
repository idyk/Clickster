
package clickster;
import javax.swing.JLabel;

public class JLabelBuild extends JLabel{
    static JLabel pointsAmt; 
    ClickDB ClickDB = new ClickDB();
    JLabel ShopTitle = new JLabel("Shop here soon.");
    JLabel SettingsTitle = new JLabel("Settings here soon.");
    public JLabelBuild(){
        pointsAmt = new JLabel("Points: " + ClickDB.getValue());
    }    
 
    public JLabel getPointsLabel(){
        return pointsAmt;
    }
    
    public void changePointsLabel(){
        pointsAmt.setText("Points: " + ClickDB.getValue());
    }
    
}
