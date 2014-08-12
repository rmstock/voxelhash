package voxelhash;
import javafx.stage.Stage;

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
	
	public void start(Stage primaryStage) {
		View.getInstance().start(primaryStage);
		View.getInstance().setScene(MainGUI.getScene());
		Model.getInstance().loadSave("tileFloor");
	}
}
