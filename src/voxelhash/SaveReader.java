package voxelhash;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SaveReader {
	private BufferedReader br;
	
	public SaveReader(String header, String save, String close) {
		try {
			br = new BufferedReader(new FileReader(".\\Saves\\" + save + "\\" + header + close));
		} catch (IOException e) {
			try {
				br = new BufferedReader(new FileReader(".\\Saves\\" + header + close));
			} catch (IOException e2) {
				e.printStackTrace();
				e2.printStackTrace();
				
			}
		}
	}
	
	public String[] readLine() {
		try {
			return br.readLine().split(" ");
		} catch (IOException e) {
			System.out.println("Tried to read past end of file.");
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		br = null;
		return null;
	}
	
}
