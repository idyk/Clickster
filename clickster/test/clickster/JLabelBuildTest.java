package clickster;

import javax.swing.JLabel;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class JLabelBuildTest {

    private ClickDB clickDB;
    private JLabelBuild jLabelBuild;

    @Before
    public void setUp() {
        System.out.println("set up");
        clickDB = new ClickDB();
        jLabelBuild = new JLabelBuild();
    }

    @After
    public void tearDown() {
        clickDB = null;
        jLabelBuild = null;
        System.out.println("tear down");
    }

    @Test
    public void testGetPointsLabel() {
        System.out.println("getPointsLabel");
        JLabel expectedLabel = new JLabel("Points: " + 0.0);
        System.out.println("testing " + jLabelBuild.getPointsLabel().getText());
        System.out.println("expected " + expectedLabel.getText());
        assertTrue(jLabelBuild.getPointsLabel().getText().equals(expectedLabel.getText()));
    }

    @Test
    public void testGetClicksLabel() {
        System.out.println("getClicksLabel");
        JLabel expectedLabel = new JLabel("Clicks: " + 0.0);
        System.out.println("testing " + jLabelBuild.getClicksLabel().getText());
        System.out.println("expected " + expectedLabel.getText());
        assertTrue(jLabelBuild.getClicksLabel().getText().equals(expectedLabel.getText()));
    }

    @Test
    public void testGetMilestoneOneStatusLabel() {
        System.out.println("getMilestoneOneStatusLabel");
        JLabel expectedLabel = new JLabel("<html> <b> <center> Milestone One: Getting Started </center> </b> Keep on clicking! Click 50 times for a +0.5 points bonus! <br> <center> Your milestone status currently is: " + clickDB.getMilestoneOneFlag() + "</center></html> ");
        System.out.println("testing " + jLabelBuild.getMilestoneOneStatusLabel().getText());
        System.out.println("expected " + expectedLabel.getText());
        assertTrue(jLabelBuild.getMilestoneOneStatusLabel().getText().equals(expectedLabel.getText()));
    }

}
