public class HomeTheaterFacade {

    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;
    private final TheaterLights lights;

    public HomeTheaterFacade(
            Amplifier amplifier,
            DvdPlayer dvdPlayer,
            Projector projector,
            Screen screen,
            TheaterLights lights) {

        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Getting ready to watch a movie...");

        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");

        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();

        amplifier.off();
        projector.off();
        screen.up();
        lights.on();
    }
}