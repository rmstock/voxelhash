package voxelhash;


public class Model {
	private static Model instance = new Model();
	private String saveName;
	private ModelGroup scene;
	
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
	
	public ModelGroup getScene() {
		return scene;
	}
	
	public void loadSave(String fileName) {
		// TODO work on this
		// Check if save old data before propagation.
		if (Controller.getInstance().getShouldSave()) {
			// Save old data
			scene.save();
		}
		// Get new data
		SaveReader reader = new SaveReader(fileName, null, ".sav");
		String[] words;
		while ((words = reader.readLine()) != null) {
			if (words[0].equals("new") && words[1].equals("SCENE")) {
				scene = new ModelGroup();
			}
			else if (words[0].equals("SCENE") && words[1].equals("load")) {
				scene.load(words[2]);
			}
		}
	}
	
	public void update(long time) {
		// TODO fill this
	}
}
