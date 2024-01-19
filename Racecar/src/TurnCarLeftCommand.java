public class TurnCarLeftCommand implements CommandInterface {
    private RaceCar raceCar;

    public TurnCarLeftCommand(RaceCar raceCar){
        this.raceCar = raceCar;
    }

    @Override
    public void execute(){
        raceCar.turnLeft();
    }
}
