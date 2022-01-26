
package clickster;
import javax.swing.JLabel;

public class JLabelBuild extends JLabel{
    static JLabel pointsAmt; 
    ClickDB ClickDB = new ClickDB();

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
