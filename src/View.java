import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class View{
	private static Stage primaryStage;
	private static View instance = new View();
	private Scene world;
	private Camera cam;
	
	private View(){
	}
	
	public static View getInstance() {
		return instance;
	}
	
	public void showError(Exception e) {
		// TODO write code
	}
	
	public void start(Stage newStage) {
		primaryStage = newStage;
		primaryStage.show();
	}
	
	public void setScene(Scene view) {
		primaryStage.setScene(view);
	}
}
