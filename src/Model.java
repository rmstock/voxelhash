
public class Model {
	private static Model instance = new Model();
	private String saveName;
	private Scene scene;
	
	private Model() {
		saveName = null;
		scene = null;
	}
	
	public static Model getInstance() {
		return instance;
	}
	
	public String getSaveName() {
		return saveName;
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public void loadSave(String saveName) {
		// TODO work on this
		// Check if save old data before propagation.
		if (Controller.getInstance().getShouldSave()) {
			// Save old data
			scene.save();
		}
		// Get new data
		SaveReader reader = new SaveReader("", saveName, ".sav");
		String[] words;
		while ((words = reader.readLine()) != null) {
			if (words[0] == "new" && words[1] == "SCENE") {
				scene = new Scene();
			}
			else if (words[0] == "SCENE" && words[1] == "load") {
				scene.load(words[2]);
			}
		}
	}
	
	public void update(long time) {
		// TODO fill this
	}
}
