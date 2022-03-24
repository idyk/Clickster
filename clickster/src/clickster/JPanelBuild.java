package clickster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.*;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
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
            
    JPanel upgrade1;
    JPanel upgrade2;
    JPanel upgrade3; 
    JPanel upgrade4;
    JPanel upgrade5;

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
        upgrade1 = new JPanel();    
        upgrade1.setLayout(new BoxLayout(upgrade1, BoxLayout.Y_AXIS));      
        upgrade1.setBorder((BorderFactory.createEmptyBorder(0, 0, 10, 30)));
        upgrade1.add(jLabelBuild.u1_image);
        upgrade1.add(jLabelBuild.u1_descript);
        upgrade1.add(jButtonBuild.upgrade_one);
        upgrade1.setBackground(Color.GREEN);
        
        upgrade2 = new JPanel();
        upgrade2.setLayout(new BoxLayout(upgrade2, BoxLayout.Y_AXIS));
        upgrade2.setBorder((BorderFactory.createEmptyBorder(1, 5, 10, 30)));
        upgrade2.add(jLabelBuild.u2_image);
        upgrade2.add(jLabelBuild.u2_descript);
        upgrade2.add(jButtonBuild.upgrade_two);
        upgrade2.setBackground(Color.GREEN);
        
        JPanel part1 = new JPanel();
        part1.add(upgrade1);
        part1.add(upgrade2);
        part1.setLayout(new GridLayout(1,2));
              
        upgrade3 = new JPanel();
        upgrade3.setLayout(new BoxLayout(upgrade3, BoxLayout.Y_AXIS));
        upgrade3.setBorder((BorderFactory.createEmptyBorder(1, 0, 1, 10)));
        upgrade3.add(jLabelBuild.u3_image);
        upgrade3.add(jLabelBuild.u3_descript);
        upgrade3.add(jButtonBuild.upgrade_three);
        upgrade3.setBackground(Color.GREEN);

       
        upgrade4 = new JPanel();
        upgrade4.setLayout(new BoxLayout(upgrade4, BoxLayout.Y_AXIS));
        upgrade4.setBorder((BorderFactory.createEmptyBorder(1, 5, 1, 10)));
        upgrade4.add(jLabelBuild.u4_image);
        upgrade4.add(jLabelBuild.u4_descript);
        upgrade4.add(jButtonBuild.upgrade_four);
        upgrade4.setBackground(Color.GREEN);
        
        JPanel part2 = new JPanel();
        part2.add(upgrade3);
        part2.add(upgrade4);
        part2.setLayout(new GridLayout(1,2));
        
        JPanel title = new JPanel();
        title.add(jLabelBuild.shopTitle);
        title.setLayout(new GridLayout (1,1));
        title.setBackground(Color.GREEN);
                
        
//        shopScreenPanel = new JPanel();
//        shopScreenPanel.add(jLabelBuild.shopTitle);
//        shopScreenPanel.add(upgrade1);
//        shopScreenPanel.add(upgrade2);
//        shopScreenPanel.add(upgrade3);
//        shopScreenPanel.add(upgrade4);
////        //shopScreenPanel.setLayout(new GridLayout(2,2));
//        shopScreenPanel.setBackground(Color.GREEN);

        shopScreenPanel = new JPanel();
        //shopScreenPanel.add(jLabelBuild.shopTitle);
        shopScreenPanel.setLayout(new BoxLayout(shopScreenPanel, BoxLayout.Y_AXIS));
        shopScreenPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 10));
        shopScreenPanel.add(title);
        shopScreenPanel.add(part1);
        shopScreenPanel.add(part2);
        shopScreenPanel.setBackground(Color.GREEN);
        



        //The panel that contains Setting-related contents.
        settingsPanel = new JPanel();
        //settingsPanel.setLayout(new BoxLayout(settingsPanel, BoxLayout.PAGE_AXIS));
        settingsPanel.add(jLabelBuild.settingsTitle);
        settingsPanel.add(jButtonBuild.save);
        settingsPanel.add(jButtonBuild.reset);
        settingsPanel.add(jButtonBuild.audio);
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
