public class TurnCarRightCommand implements CommandInterface {
    private RaceCar raceCar;

    public TurnCarRightCommand(RaceCar raceCar){
        this.raceCar = raceCar;
    }

    @Override
    public void execute(){
        raceCar.turnRight();
    }

}
