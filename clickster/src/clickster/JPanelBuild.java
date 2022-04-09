package clickster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class JPanelBuild extends JPanel {

    JButtonBuild jButtonBuild;
    JLabelBuild jLabelBuild;
    ImageList imageList;

    JPanel clickScreenPanel;
    JPanel pointsPanel;
    JPanel multiplierPanel;
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
    JPanel milestoneThree;
    JPanel milestoneFour;
    JPanel milestoneFive;
    JPanel milestonePanel;

    public JPanelBuild() {
        jButtonBuild = new JButtonBuild();
        jLabelBuild = new JLabelBuild();

        clickScreenPanel = new JPanel();
        pointsPanel = new JPanel();
        multiplierPanel = new JPanel();
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

        multiplierPanel.add(jLabelBuild.getMultiplierLabel());
        multiplierPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        multiplierPanel.setBackground(Color.WHITE);

        topClicksPanel.add(pointsPanel);
        topClicksPanel.add(clicksAmtPanel);
        topClicksPanel.add(multiplierPanel);
        topClicksPanel.setBackground(Color.white);

        //Panel with the CLICK button in it.
        clickMenuPanel.add(jButtonBuild.click);
        clickMenuPanel.setBackground(Color.white);

        //Panel with the changing image in it.
        imageList = new ImageList();
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
        upgrade1.setLayout(new BorderLayout());
        upgrade1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        upgrade1.add(jLabelBuild.u1_image, BorderLayout.NORTH);
        upgrade1.add(jLabelBuild.u1_descript, BorderLayout.CENTER);
        upgrade1.add(jButtonBuild.upgrade_one, BorderLayout.SOUTH);
        upgrade1.setBackground(Color.WHITE);

        upgrade2 = new JPanel();
        upgrade2.setLayout(new BorderLayout());
        upgrade2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        upgrade2.add(jLabelBuild.u2_image, BorderLayout.NORTH);
        upgrade2.add(jLabelBuild.u2_descript, BorderLayout.CENTER);
        upgrade2.add(jButtonBuild.upgrade_two, BorderLayout.SOUTH);
        upgrade2.setBackground(Color.WHITE);

        JPanel part1 = new JPanel();
        part1.add(upgrade1);
        part1.add(upgrade2);
        part1.setLayout(new GridLayout(1, 2));

        upgrade3 = new JPanel();
        upgrade3.setLayout(new BorderLayout());
        upgrade3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        upgrade3.add(jLabelBuild.u3_image, BorderLayout.NORTH);
        upgrade3.add(jLabelBuild.u3_descript, BorderLayout.CENTER);
        upgrade3.add(jButtonBuild.upgrade_three, BorderLayout.SOUTH);
        upgrade3.setBackground(Color.WHITE);

        upgrade4 = new JPanel();
        upgrade4.setLayout(new BorderLayout());
        upgrade4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        upgrade4.add(jLabelBuild.u4_image, BorderLayout.NORTH);
        upgrade4.add(jLabelBuild.u4_descript, BorderLayout.CENTER);
        upgrade4.add(jButtonBuild.upgrade_four, BorderLayout.SOUTH);
        upgrade4.setBackground(Color.WHITE);

        JPanel part2 = new JPanel();
        part2.add(upgrade3);
        part2.add(upgrade4);
        part2.setLayout(new GridLayout(1, 2));

        JPanel shopTitle = new JPanel();
        shopTitle.add(jLabelBuild.shopTitle);
        shopTitle.setBackground(Color.WHITE);
        shopTitle.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

        shopScreenPanel = new JPanel();
        shopScreenPanel.setLayout(new BoxLayout(shopScreenPanel, BoxLayout.Y_AXIS));
        shopScreenPanel.add(shopTitle);
        shopScreenPanel.add(part1);
        shopScreenPanel.add(part2);
        shopScreenPanel.setBackground(new Color(235, 86, 75));
        shopScreenPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //The panel that contains Setting-related contents.
        JPanel settingsTitlePanel = new JPanel();
        settingsTitlePanel.add(jLabelBuild.settingsTitle);
        settingsTitlePanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        settingsTitlePanel.setBackground(Color.WHITE);

        JPanel saveButtonPanel = new JPanel();
        saveButtonPanel.setLayout(new BorderLayout());
        saveButtonPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        saveButtonPanel.add(jLabelBuild.save, BorderLayout.CENTER);
        saveButtonPanel.add(jButtonBuild.save, BorderLayout.SOUTH);
        saveButtonPanel.setBackground(Color.WHITE);

        JPanel resetButtonPanel = new JPanel();
        resetButtonPanel.setLayout(new BorderLayout());
        resetButtonPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        resetButtonPanel.add(jLabelBuild.reset, BorderLayout.CENTER);
        resetButtonPanel.add(jButtonBuild.reset, BorderLayout.SOUTH);
        resetButtonPanel.setBackground(Color.WHITE);

        JPanel muteButtonPanel = new JPanel();
        muteButtonPanel.setLayout(new BorderLayout());
        muteButtonPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        muteButtonPanel.add(jLabelBuild.mute, BorderLayout.CENTER);
        muteButtonPanel.add(jButtonBuild.mute, BorderLayout.SOUTH);
        muteButtonPanel.setBackground(Color.WHITE);

        JPanel unmuteButtonPanel = new JPanel();
        unmuteButtonPanel.setLayout(new BorderLayout());
        unmuteButtonPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        unmuteButtonPanel.add(jLabelBuild.unmute, BorderLayout.CENTER);
        unmuteButtonPanel.add(jButtonBuild.unmute, BorderLayout.SOUTH);
        unmuteButtonPanel.setBackground(Color.WHITE);

        settingsPanel = new JPanel();
        settingsPanel.setLayout(new BoxLayout(settingsPanel, BoxLayout.Y_AXIS));
        settingsPanel.add(settingsTitlePanel);
        settingsPanel.add(saveButtonPanel);
        settingsPanel.add(resetButtonPanel);
        settingsPanel.add(muteButtonPanel);
        settingsPanel.add(unmuteButtonPanel);
        settingsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        settingsPanel.setBackground(Color.PINK);

        milestonePanel = new JPanel();
        milestoneOne = new JPanel();
        milestoneTwo = new JPanel();
        milestoneThree = new JPanel();
        milestoneFour = new JPanel();
        milestoneFive = new JPanel();

        JPanel milestoneTitlePanel = new JPanel();
        milestoneTitlePanel.add(jLabelBuild.milestoneTitle);
        milestoneTitlePanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        milestoneTitlePanel.setBackground(Color.WHITE);

        milestoneOne.add(jLabelBuild.getMilestoneOneStatusLabel());
        milestoneOne.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        milestoneOne.setBackground(Color.WHITE);

        milestoneTwo.add(jLabelBuild.getMilestoneTwoStatusLabel());
        milestoneTwo.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        milestoneTwo.setBackground(Color.WHITE);

        milestoneThree.add(jLabelBuild.getMilestoneThreeStatusLabel());
        milestoneThree.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        milestoneThree.setBackground(Color.WHITE);

        milestoneFour.add(jLabelBuild.getMilestoneFourStatusLabel());
        milestoneFour.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        milestoneFour.setBackground(Color.WHITE);

        milestoneFive.add(jLabelBuild.getMilestoneFiveStatusLabel());
        milestoneFive.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        milestoneFive.setBackground(Color.WHITE);

        milestonePanel.setLayout(new BoxLayout(milestonePanel, BoxLayout.Y_AXIS));
        milestonePanel.add(milestoneTitlePanel);
        milestonePanel.add(milestoneOne);
        milestonePanel.add(milestoneTwo);
        milestonePanel.add(milestoneThree);
        milestonePanel.add(milestoneFour);
        milestonePanel.add(milestoneFive);
        milestonePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

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
