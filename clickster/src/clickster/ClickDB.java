package clickster;

public class ClickDB {

    static float points;
    static float multiplier = 1;
    static int imageIndex = 0;
    static float totalClicksDone;
    static float milestoneBonus = 0;
    static boolean milestoneOneFlag;
    static boolean milestoneTwoFlag;
    static boolean milestoneThreeFlag;
    static boolean milestoneFourFlag;
    static boolean milestoneFiveFlag;
    static boolean muteFlag = false;

    public void setPoints(float sentPoints) {
        this.points = sentPoints;
    }

    public float increasePoints() {
        this.points = points + (1 * multiplier) + (milestoneBonus);
        System.out.println("Points: " + points);
        return points;
    }

    public float increaseClickTotal() {
        this.totalClicksDone++;
        System.out.println("Total clicks done: " + totalClicksDone);
        return totalClicksDone;
    }

    public void setPointsZero() {
        this.points = 0;
    }

    public void removePoints(int changeAmount) {
        this.points = points - changeAmount;
    }

    public float getPoints() {
        return points;
    }

    public void changeMultipler(float percentage) {
        System.out.println("Multiplier before: " + multiplier);
        this.multiplier = this.multiplier * (1 + percentage);
        System.out.println("Multiplier after: " + multiplier);
    }

    public void setMultiplier(float sentMultiplier) {
        this.multiplier = sentMultiplier;
    }

    public float getMultiplier() {
        return this.multiplier;
    }

    public void setMilestoneBonus(float milestoneBonus) {
        this.milestoneBonus += milestoneBonus;
    }

    public void setMilestoneBonusZero() {
        this.milestoneBonus = 0;
    }

    public float getMilestoneBonus() {
        return this.milestoneBonus;
    }

    public int getImageIndex() {
        return this.imageIndex;
    }

    public void setImageIndex(float imageIndex) {
        this.imageIndex += (int) imageIndex;
    }

    public void setImageIndexZero() {
        this.imageIndex = 0;
    }

    public void setTotalClicksDone(float totalClicksDone) {
        this.totalClicksDone = totalClicksDone;
    }

    public float getTotalClicksDone() {
        return totalClicksDone;
    }

    public void setMilestoneOneFlag(boolean milestoneOneFlag) {
        this.milestoneOneFlag = milestoneOneFlag;
    }

    public boolean getMilestoneOneFlag() {
        return milestoneOneFlag;
    }

    public void setMilestoneTwoFlag(boolean milestoneTwoFlag) {
        this.milestoneTwoFlag = milestoneTwoFlag;
    }

    public boolean getMilestoneTwoFlag() {
        return milestoneTwoFlag;
    }

    public void setMilestoneThreeFlag(boolean milestoneThreeFlag) {
        this.milestoneThreeFlag = milestoneThreeFlag;
    }

    public boolean getMilestoneThreeFlag() {
        return milestoneThreeFlag;
    }

    public void setMilestoneFourFlag(boolean milestoneFourFlag) {
        this.milestoneFourFlag = milestoneFourFlag;
    }

    public boolean getMilestoneFourFlag() {
        return milestoneFourFlag;
    }

    public void setMilestoneFiveFlag(boolean milestoneFiveFlag) {
        this.milestoneFiveFlag = milestoneFiveFlag;
    }

    public boolean getMilestoneFiveFlag() {
        return milestoneFiveFlag;
    }

    public void setMuteFlag(boolean muteFlag) {
        this.muteFlag = muteFlag;
    }

    public boolean getMuteFlag() {
        return muteFlag;
    }

}
