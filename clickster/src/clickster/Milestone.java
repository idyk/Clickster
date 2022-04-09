package clickster;

public class Milestone {

    ClickDB ClickDB = new ClickDB();

    Audio audio = new Audio();

    ImageList imageList = new ImageList();
    


    //Initialize milestones!
    static boolean milestoneOneFlag = false;
    static boolean milestoneTwoFlag = false;
    static boolean milestoneThreeFlag = false;
    static boolean milestoneFourFlag = false;
    static boolean milestoneFiveFlag = false;

    //Click amount! VERY DIFFERENT FROM POINTS AMOUNT. Keeps track of lifetime clicks comitted.
    float checkClickAmount;

    //Checks every milestone every load and/or click.
    public void checkAllMilestones() {
        System.out.println("Checking Milestones...");
        if (ClickDB.getMilestoneOneFlag() == false) {
            checkMilestoneOne();
        }
        if (ClickDB.getMilestoneTwoFlag() == false) {
            checkMilestoneTwo();
        }
        if (ClickDB.getMilestoneThreeFlag() == false) {
            checkMilestoneThree();
        }
        if (ClickDB.getMilestoneFourFlag() == false) {
            checkMilestoneFour();
        }
        if (ClickDB.getMilestoneFiveFlag() == false) {
            checkMilestoneFive();
        }
    }

    /*MAKE THE MILESTONES. Every milestone must have an entry in ClickDB for set/get methods, along with in SaveSystem for the
    corresponding generated entry on the UserData.txt file.*/
    //Let's say... Milestone One is that the user reaches 50 clicks. "Getting Started!" Gives a reward of +0.5 clicks per click.
    public void checkMilestoneOne() {
        checkClickAmount = ClickDB.getTotalClicksDone();
        milestoneOneFlag = ClickDB.getMilestoneOneFlag();
        System.out.println("Checking Milestone 1 with click amount of " + checkClickAmount);
        if (checkClickAmount >= 50) {
            System.out.println("congrats, you have milestone 1");
            if (ClickDB.getMuteFlag() == false) {
                audio.playOnce("file:/" + System.getProperty("user.dir") + "/sound/milestone.wav");
            }
            ClickDB.setMilestoneOneFlag(true);
            ClickDB.setMilestoneBonus(0.5f);

        }
    }

    //Let's say... Milestone Two is that the user reaches 100 clicks. "Getting Further!"
    public void checkMilestoneTwo() {
        checkClickAmount = ClickDB.getTotalClicksDone();
        milestoneTwoFlag = ClickDB.getMilestoneTwoFlag();
        System.out.println("Checking Milestone 2 with click amount of " + checkClickAmount);
        if (checkClickAmount >= 100) {
            System.out.println("congrats, you have milestone 2");
            if (ClickDB.getMuteFlag() == false) {
                audio.playOnce("file:/" + System.getProperty("user.dir") + "/sound/milestone.wav");
            }
            ClickDB.setMilestoneTwoFlag(true);
            ClickDB.setMilestoneBonus(0.5f);
        }
    }

    //Let's say... Milestone Three is that the user reaches 1000 clicks. "Click Learner"
    public void checkMilestoneThree() {
        checkClickAmount = ClickDB.getTotalClicksDone();
        milestoneThreeFlag = ClickDB.getMilestoneThreeFlag();
        System.out.println("Checking Milestone 3 with click amount of " + checkClickAmount);
        if (checkClickAmount >= 1000) {
            System.out.println("congrats, you have milestone 3");
            if (ClickDB.getMuteFlag() == false) {
                audio.playOnce("file:/" + System.getProperty("user.dir") + "/sound/milestone.wav");
            }
            ClickDB.setMilestoneThreeFlag(true);
            ClickDB.setMilestoneBonus(0.5f);
        }
    }

    //Let's say... Milestone Four is that the user reaches 5000 clicks. "Click Pro"
    public void checkMilestoneFour() {
        checkClickAmount = ClickDB.getTotalClicksDone();
        milestoneFourFlag = ClickDB.getMilestoneFourFlag();
        System.out.println("Checking Milestone 4 with click amount of " + checkClickAmount);
        if (checkClickAmount >= 5000) {
            System.out.println("congrats, you have milestone 4");
            if (ClickDB.getMuteFlag() == false) {
                audio.playOnce("file:/" + System.getProperty("user.dir") + "/sound/milestone.wav");
            }
            ClickDB.setMilestoneFourFlag(true);
            ClickDB.setMilestoneBonus(0.5f);
        }
    }

    //Let's say... Milestone Five is that the user reaches 9000 clicks and reaches the Rooster. "Clickster 9000"
    public void checkMilestoneFive() {

        checkClickAmount = ClickDB.getTotalClicksDone();
        milestoneFiveFlag = ClickDB.getMilestoneFiveFlag();
        System.out.println("Checking Milestone 5 with click amount of " + checkClickAmount);
        if (checkClickAmount >= 9000 && ClickDB.getImageIndex() == imageList.imageList.size() - 1) {
            System.out.println("congrats, you have milestone 5");
            if (ClickDB.getMuteFlag() == false) {
                audio.playOnce("file:/" + System.getProperty("user.dir") + "/sound/victory.wav");
                audio.mute();
                audio.play("file:/" + System.getProperty("user.dir") + "/sound/testWin.wav");
            }
            ClickDB.setMilestoneFiveFlag(true);
            ClickDB.setMilestoneBonus(0.5f);
        }
    }
}
