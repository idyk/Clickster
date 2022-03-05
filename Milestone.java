package clickster;

public class Milestone {
    ClickDB ClickDB = new ClickDB();

    //Initialize milestones!
    static boolean milestoneOneFlag = false;
    static boolean milestoneTwoFlag = false;

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
            ClickDB.setMilestoneOneFlag(true);
            ClickDB.setMilestoneBonus(0.5f);
        }
    }

    //Let's say... Milestone Two is that the user reaches 100 clicks. "Getting Further!"
    public void checkMilestoneTwo() {
        checkClickAmount = ClickDB.getTotalClicksDone();
        milestoneTwoFlag = ClickDB.getMilestoneTwoFlag();
        System.out.println("Checking Milestone 2 with click amount of " + checkClickAmount);
        if (checkClickAmount >= 100 && milestoneTwoFlag == false) {
            System.out.println("congrats, you have milestone 2");
            ClickDB.setMilestoneTwoFlag(true);
            ClickDB.setMilestoneBonus(0.5f);
        }
    }

}
