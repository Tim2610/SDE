import java.util.Scanner;
public class RaceCarGame {
    public static void main(String[] args){
        //Creational Design Pattern: Singleton
        GameManager gameManager = GameManager.getInstance();

        //Structural DesignPattern: State
        RaceCar raceCar = new RaceCar();
        raceCar.setState(new NormalCarState());

        //Behavioral Design Pattern: Command
        CommandInterface accelerateCommand = new AccelerateCarCommand(raceCar);
        CommandInterface brakeCommand = new BrakeCarCommand(raceCar);
        CommandInterface turnLeftCommand = new TurnCarLeftCommand(raceCar);
        CommandInterface turnRightCommand = new TurnCarRightCommand(raceCar);



        // Command line input to change state and start driving
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 'accelerate' to start driving, 'brake' to stop driving, 'left' to turn left, 'right' to turn right, 'change' to choose between boosted or normal driving, or 'exit' to exit:");
            String choice = scanner.next();

            switch (choice) {
                case "accelerate" :
                    accelerateCommand.execute();
                    break;
                case "brake":
                    brakeCommand.execute();
                    break;
                case "left":
                    turnLeftCommand.execute();
                    break;
                case "right":
                    turnRightCommand.execute();
                    break;
                case "change":
                    System.out.println("Enter 'normal' for Normal state or 'boosted' for Boosted state:");
                    String stateChoice = scanner.next();
                    if (stateChoice.equals("normal")) {
                        raceCar.setState(new NormalCarState());
                    } else if (stateChoice.equals("boosted")) {
                        raceCar.setState(new BoostedCarState());
                    } else {
                        System.out.println("Invalid choice. Setting to Normal state.");
                        raceCar.setState(new NormalCarState());
                    }
                    break;
                case "exit":
                    System.out.println("Exiting the game.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}