
public class Controller {
	private static Controller instance = new Controller();
	
	private Controller() {
	}

	public static Controller getInstance() {
		return instance;
	}

	public boolean getShouldSave() {
		// TODO get from view
		return false;
	}
}
