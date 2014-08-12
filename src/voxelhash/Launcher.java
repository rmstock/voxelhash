import javafx.application.Application;
import javafx.stage.Stage;


public class Launcher extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		Controller.getInstance().start(arg0);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
