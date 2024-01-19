# Java Race Car Game

This simple Java console application demonstrates the use of design patterns in a text-based race car game.

## Design Patterns Used

### 1. Creational Design Pattern: Singleton

The `GameManager` class utilizes the Singleton pattern to ensure that there is only one instance of the game manager throughout the application's lifecycle.

### 2. Structural Design Pattern: State

The State pattern is employed to represent different states of the race car. The `RaceCar` class has different states (`NormalState` and `BoostedState`), and it can transition between these states based on user input or game logic.

### 3. Behavioral Design Pattern: Command

The Command pattern is implemented through the `Command` interface and its concrete implementations (`AccelerateCarCommand`, `BrakeCarCommand`, 'Turn'). These classes encapsulate specific actions (acceleration and braking) as objects, allowing them to be passed around and executed dynamically.


## Gameplay Instructions
* Enter 'accelerate' to accelerate the race car.
* Enter 'brake' to brake the race car.
* Enter 'left' to make the race car turn left
* Enter 'right' to make the race car turn right
* Enter 'change' to switch between the Normal and Boosted states.
* Enter 'exit' to exit the game.

## Notes
* The speedometer displays the current speed of the race car in kilometers per hour.
* The race car has a maximum speed of 250 km/h.
* In Boosted state, the race car accelerates faster and brakes harder.
