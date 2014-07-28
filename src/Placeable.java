import java.util.HashMap;
import java.util.Map;


public class Placeable implements IRenderable, ISaveable {

	@Override
	public Map<Coordinate, IVoxel> getVoxelMap() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Coordinate getOffset() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean boundingHit(Ray incoming) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isImmutable() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean load(String fileName) {
		SaveReader reader = new SaveReader(fileName, Model.getInstance().getSaveName(), ".obj");
		String[] words;
		HashMap<Coordinate, IVoxel> toAdd = null;
		IVoxel colored = null;
		boolean worked = true;
		while ((words = reader.readLine()) != null) {
			if (words[0].equals("new") && words[1].equals("VOXELMAP")) {
				toAdd = new HashMap<Coordinate, IVoxel>();
			} else if (words[0].equals("new") && words[1].equals("LIST")) {
				String[] line;
				if (colored == null) {
					System.out.println("Colored Voxel = null when added.");
					worked = false;
				}
				while (!(line = reader.readLine())[0].equals("end")) {
					toAdd.put(new Coordinate(new int[] {Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])}), colored);
				}
			} else if (words[0].equals("set") && words[1].equals("COLOR")) {
				colored = new ColorVoxel(new Coordinate(new int[] {Integer.parseInt(words[2]), Integer.parseInt(words[3]), Integer.parseInt(words[4])}));
			}
		}
		return worked;
	}
}
