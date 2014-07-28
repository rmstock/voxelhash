
public class View {
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
}
