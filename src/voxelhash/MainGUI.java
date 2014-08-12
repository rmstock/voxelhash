package voxelhash;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;

public class MainGUI{	
	
	public static Scene getScene() {
		StackPane root = new StackPane();
		return new Scene(root, 300, 250);
	}
}
