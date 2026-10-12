# Assignment 4 — Facade Pattern

## Project Overview

This project demonstrates the **Facade Design Pattern** using a Home Theater system.

The goal of the project is to simplify interaction with several subsystem classes by providing one simple interface through `HomeTheaterFacade`.

Instead of controlling each device separately, the client can use:

```
homeTheater.watchMovie("Interstellar");
homeTheater.endMovie();
```

## Facade Pattern

The Facade Pattern is a structural design pattern that provides a simplified interface to a complex subsystem.

In this project, `HomeTheaterFacade` coordinates several subsystem classes and hides the complexity of their interaction from the client.

## Project Structure

- `Main` — Client
- `HomeTheaterFacade` — Facade
- `Amplifier` — controls sound and volume
- `DvdPlayer` — controls movie playback
- `Projector` — controls video projection
- `Screen` — controls the theater screen
- `TheaterLights` — controls lighting

## How It Works

When the client calls:

```
homeTheater.watchMovie("Interstellar");
```

the facade performs several actions in the correct order:

1. Dims the lights
2. Lowers the screen
3. Turns on the projector
4. Enables widescreen mode
5. Turns on the amplifier
6. Enables surround sound
7. Sets the volume
8. Turns on the DVD player
9. Starts the movie

When the client calls:

```
homeTheater.endMovie();
```

the facade shuts down the home theater system in the correct order:

1. Stops the DVD player
2. Ejects the DVD
3. Turns off the DVD player
4. Turns off the amplifier
5. Turns off the projector
6. Raises the screen
7. Turns the theater lights back on

## Clean Code Principles

The project follows several Clean Code principles:

- Meaningful names
- Single Responsibility Principle
- Small and focused classes
- Clear separation of responsibilities
- Simple public API
- No duplicated subsystem logic
- Proper delegation of responsibilities

## Technologies

- Java 17
- IntelliJ IDEA
- Maven

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure Java 17 is selected.
3. Run `Main.java`.
4. The console will show the sequence of actions performed by the facade.

## Conclusion

The project shows how the Facade Pattern reduces complexity by giving the client one simple entry point to a subsystem with multiple classes.

The subsystem classes remain independent, while the facade coordinates them and makes the system easier to use and maintain.