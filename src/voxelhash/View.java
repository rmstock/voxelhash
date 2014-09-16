package voxelhash;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class View{
	private static Stage primaryStage;
	private static View instance = new View();
	private ModelGroup world;
	private Camera cam;
	
	private View(){
		cam = new Camera(null,1,1,ViewType.GRID, 500, 500);
	}
	
	public static View getInstance() {
		return instance;
	}
	
	public void showError(Exception e) {
		// TODO write code
	}
	
	public void setModelGroup(ModelGroup mg) {
		world = mg;
	}
	
	public void start(Stage newStage) {
		primaryStage = newStage;
		primaryStage.show();
	}
	
	public void setScene(Scene view) {
		primaryStage.setScene(view);
	}
	
	public void update (long time) {
		cam.lookAt(world);
	}
}
