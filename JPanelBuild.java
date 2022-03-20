package clickster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class JPanelBuild extends JPanel {

    JButtonBuild jButtonBuild;
    JLabelBuild jLabelBuild;
    ImageList imageList;



    JPanel clickScreenPanel;
    JPanel pointsPanel;
    JPanel clicksAmtPanel;
    JPanel topClicksPanel;
    JPanel clickMenuPanel;
    JPanel imagePanel;

    JPanel shopScreenPanel;

    JPanel settingsPanel;

    JPanel milestoneOne;
    JPanel milestoneTwo;
    JPanel milestonePanel;

    public JPanelBuild() {
        imageList = new ImageList();
        jButtonBuild = new JButtonBuild();
        jLabelBuild = new JLabelBuild();

        clickScreenPanel = new JPanel();
        pointsPanel = new JPanel();
        topClicksPanel = new JPanel();
        clicksAmtPanel = new JPanel();
        clickMenuPanel = new JPanel();
        imagePanel = new JPanel();

        //Panel with the points in it.
        pointsPanel.add(jLabelBuild.getPointsLabel());
        pointsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pointsPanel.setBackground(Color.WHITE);

        //Panel with the total clicks done in it.
        clicksAmtPanel.add(jLabelBuild.getClicksLabel());
        clicksAmtPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        clicksAmtPanel.setBackground(Color.WHITE);

        topClicksPanel.add(pointsPanel);
        topClicksPanel.add(clicksAmtPanel);
        topClicksPanel.setBackground(Color.white);

        //Panel with the CLICK button in it.
        clickMenuPanel.add(jButtonBuild.click);
        clickMenuPanel.setBackground(Color.white);

        //Panel with the changing image in it.
        imagePanel.add(imageList.getImageLabel());
        imagePanel.setBackground(Color.white);

        //A single panel that combines the points, clickMenu, and image panels. 
        //This is the only way for it to work with the tabbedPane format.
        clickScreenPanel.setLayout(new BorderLayout());
        clickScreenPanel.add(topClicksPanel, BorderLayout.NORTH);
        clickScreenPanel.add(clickMenuPanel, BorderLayout.SOUTH);
        clickScreenPanel.add(imagePanel, BorderLayout.CENTER);
        clickScreenPanel.setBackground(Color.WHITE);

        //The panel that contains shop related contents.
        shopScreenPanel = new JPanel();
        shopScreenPanel.add(jLabelBuild.shopTitle);
        shopScreenPanel.add(jButtonBuild.upgrade_one);
        shopScreenPanel.add(jButtonBuild.upgrade_two);
        shopScreenPanel.add(jButtonBuild.upgrade_three);
        shopScreenPanel.add(jButtonBuild.upgrade_four);
        shopScreenPanel.add(jButtonBuild.upgrade_five);
        shopScreenPanel.setBackground(Color.YELLOW);

        //The panel that contains Setting-related contents.
        settingsPanel = new JPanel();
        settingsPanel.add(jLabelBuild.settingsTitle);
        settingsPanel.add(jButtonBuild.save);
        settingsPanel.add(jButtonBuild.reset);
        settingsPanel.add(jButtonBuild.mute);
        settingsPanel.add(jButtonBuild.unmute);
        settingsPanel.setBackground(Color.PINK);

        milestonePanel = new JPanel();
        milestoneOne = new JPanel();
        milestoneTwo = new JPanel();
        milestoneOne.add(jLabelBuild.getMilestoneOneStatusLabel());
        milestoneOne.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        milestoneOne.setBackground(Color.WHITE);
        milestoneTwo.add(jLabelBuild.getMilestoneTwoStatusLabel());
        milestoneTwo.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        milestoneTwo.setBackground(Color.WHITE);
        milestonePanel.add(jLabelBuild.milestoneTitle);
        milestonePanel.add(milestoneOne);
        milestonePanel.add(milestoneTwo);
        milestonePanel.setBackground(Color.CYAN);

        System.out.println("panel");

    }

    //Make sure to make a get method for each. This is for the Pane's Tabs.
    public JPanel getClickScreenPanel() {
        return clickScreenPanel;
    }

    public JPanel getShopScreenPanel() {
        return shopScreenPanel;
    }

    public JPanel getSettingsPanel() {
        return settingsPanel;
    }

    public JPanel getMilestonesPanel() {
        return milestonePanel;
    }
}
