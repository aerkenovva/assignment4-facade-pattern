public class Main {

    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(
                        amplifier,
                        dvdPlayer,
                        projector,
                        screen,
                        lights
                );

        homeTheater.watchMovie("Interstellar");

        System.out.println();

        homeTheater.endMovie();
    }
}