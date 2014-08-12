package voxelhash;
import java.io.IOException;
import java.io.PrintWriter;

public class DataSaver {
	private PrintWriter fw;
	
	public DataSaver(String header, String saveName, String close) {
		try {
			fw = new PrintWriter("Saves\\" + saveName + "\\" + header + close);
		} catch (IOException e) {
			e.printStackTrace();
			View.getInstance().showError(e);
		}
	}
	
	public void writeLine(String line) {
		fw.println(line);
	}
	
	public void close() {
		fw.close();
	}

}
