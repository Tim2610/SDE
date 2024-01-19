public class NormalCarState implements CarStateInterface {
    @Override
    public void accelerate(RaceCar raceCar) {
        System.out.println("Normal acceleration");
        raceCar.setSpeed(raceCar.getSpeed() + 20);
        if (raceCar.getSpeed() > 250) {
            raceCar.setSpeed(250);
        }
        System.out.println("Current Speed: " + raceCar.getSpeed() + " km/h");
    }

    @Override
    public void brake(RaceCar raceCar){
        System.out.println("braking");
        raceCar.setSpeed(raceCar.getSpeed() - 30);
        if(raceCar.getSpeed() < 0){
            raceCar.setSpeed(0);
        }
        System.out.println("Current Speed: " + raceCar.getSpeed() + " km/h");
    }

    @Override
    public void turnLeft(){
        System.out.println("turning left");
    }

    @Override
    public void turnRight(){
        System.out.println("turning right");
    }
}
