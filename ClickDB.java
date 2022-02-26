package clickster;

public class ClickDB {

    static float points;
    static float multiplier = 1;

    public void setPoints(float sentPoints) {
        this.points = sentPoints;
    }

    public float increasePoints() {
        this.points = points + (1 * multiplier);
        System.out.println(points);
        return points;
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

}
