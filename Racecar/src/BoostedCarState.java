public class BoostedCarState implements CarStateInterface {
    @Override
    public void accelerate(RaceCar raceCar){
        System.out.println("Super fast Acceleration");
        raceCar.setSpeed(raceCar.getSpeed() + 40);
        if (raceCar.getSpeed() > 250) {
            raceCar.setSpeed(250);
        }
        System.out.println("Current Speed: " + raceCar.getSpeed() + " km/h");
    }
    @Override
    public void brake(RaceCar raceCar){
        System.out.println("Hard braking");
        raceCar.setSpeed(raceCar.getSpeed() - 50);
        if(raceCar.getSpeed() < 0){
            raceCar.setSpeed(0);
        }
        System.out.println("Current Speed: " + raceCar.getSpeed() + " km/h");
    }

    @Override
    public void turnLeft(){
        System.out.println("Taking a sharp left turn");
    }
    @Override
    public void turnRight(){
        System.out.println("Taking a sharp right turn");
    }
}
