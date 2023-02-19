public class App {
    public static void main(String[] args) throws Exception {

    
    
    DvdPlayer dvd = new DvdPlayer();
    Amplifier amp = new Amplifier(dvd);
    Tuner tuner = new Tuner(amp);
    CdPlayer cd = new CdPlayer(amp);
    Projector projector = new Projector();
    TheaterLights lights = new TheaterLights();
    Screen screen = new Screen();
    PocorponPoper poper = new PocorponPoper();

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp,tuner,dvd,cd,projector,lights,screen,poper);
    homeTheater.watchMovie("Raidersof the lost Ark");
    homeTheater.endMovie();

    }
    
}
