public class BrakeCarCommand implements CommandInterface {
    private RaceCar raceCar;

    public BrakeCarCommand(RaceCar raceCar){
        this.raceCar = raceCar;
    }
    @Override
    public void execute(){
        raceCar.brake();
    }
}
