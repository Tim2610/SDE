public class RaceCar {
    private CarStateInterface state;
    private int speed;

    public RaceCar(){
        this.state = new NormalCarState();
        this.speed = 0;
    }
    public void setState(CarStateInterface state){
        this.state = state;
    }
    public void accelerate() {
        state.accelerate(this);
    }
    public void brake(){
        state.brake(this);
    }
    public void turnLeft(){
        state.turnLeft();
    }
    public void turnRight(){
        state.turnRight();
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
