
public class HomeTheaterFacade {
	
	private Screen screen;
	private Projector proj;
	private Amplifier amplifier;
	private CdPlayer cd;
	private DvdPlayer dvd;
	private PopcornPopper popcorn;
	private TheaterLights lights;
	private Tuner tuner;
	
	public HomeTheaterFacade() {
		screen = new Screen("écran");
		amplifier = new Amplifier("ampli");
		dvd = new DvdPlayer("dvd", amplifier);
		proj = new Projector("proj", dvd);
		tuner = new Tuner("tuner", amplifier);
		lights = new TheaterLights("lumières");
		cd = new CdPlayer("cd", amplifier);
		popcorn = new PopcornPopper("pop corn machine");
	};
	
	public void watchMovie() {
		screen.down();
		proj.on();
		proj.wideScreenMode();
		dvd.on();
		tuner.on();
		cd.off();
		amplifier.on();
		lights.off();
		popcorn.on();
	}
	
	public void endMovie() {
		screen.up();
		proj.off();
		dvd.off();
		lights.on();
		amplifier.off();
		popcorn.off();
		tuner.off();
	}
	
	public void listenToCd() {
		tuner.on();
		amplifier.on();
		cd.on();
		lights.on();
		popcorn.on();
	}
	
	public void endCd() {
		tuner.off();
		amplifier.off();
		cd.off();
		lights.off();
		popcorn.off();
	}
	
	public void listenToRadio() {
		tuner.on();
		amplifier.on();
		lights.on();
		popcorn.on();
	}

	public void endRatio() {
		tuner.off();
		amplifier.off();
		lights.off();
		popcorn.off();
	}
}
