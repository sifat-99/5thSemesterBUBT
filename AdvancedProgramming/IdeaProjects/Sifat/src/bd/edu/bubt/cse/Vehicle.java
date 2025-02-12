package bd.edu.bubt.cse;

public class Vehicle extends Main{
    protected double speed;
    protected int xPos;
    protected int yPos;

    public void move(int DesXPos, int DesYPos){
        this.xPos = DesXPos;
        this.yPos = DesYPos;
    }
    public void setSpeed(double Speed){
        this.speed = Speed;
    }
}

class AV extends Vehicle{
    protected int noOfProp;

    public void DisplayInfo(){
        System.out.printf("X Position: ");
        System.out.println( xPos);
        System.out.printf("Y Position: ");
        System.out.println(yPos);
        System.out.printf("No of Propeller : ");
        System.out.println(noOfProp);
        System.out.printf("Speed: ");
        System.out.println(speed);
    }
    public void setProp(int prop){
        this.noOfProp = prop;
    }
}
