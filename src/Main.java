public class Main {
	Scene world;
	IRenderable character;
	
	public Main() {
		world = new Scene();
		character = new Character();
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.loop();
	}
	
	public void loop() {
		world.add(character);
	}
}
