public class AccelerateCarCommand implements CommandInterface {
    private RaceCar raceCar;

    public AccelerateCarCommand(RaceCar raceCar){
        this.raceCar = raceCar;
    }

    @Override
    public void execute(){
        raceCar.accelerate();
    }
}
