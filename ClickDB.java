package clickster;

public class ClickDB {
    static int points;
    
    public void setPoints(int sendPoints){
        this.points = sendPoints;
    }
    
    public int increasePoints(){
        this.points++;
        System.out.println(points);
        return points;
    }
    
    public void setPointsZero(){
        this.points = 0;
    }
    
    public int getValue(){
        System.out.println("Sending getValue() test");
        return points;
    }
    
}
