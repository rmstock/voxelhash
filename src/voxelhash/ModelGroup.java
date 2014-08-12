package voxelhash;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ModelGroup implements IRenderable, ISaveable{
	Set<IRenderable> renderables;
	Terrain baseMap;
	
	public ModelGroup() {
		renderables = new HashSet<IRenderable>();
		baseMap = new Terrain();
	}
	
	public boolean add(IRenderable toAdd) {
		if (toAdd.isImmutable()) {
			return baseMap.addVoxels(toAdd.getVoxelMap(), toAdd.getOffset());
		}
		else {
			return renderables.add(toAdd);
		}
	}
	
	public boolean remove(IRenderable toRemove) {
		return renderables.remove(toRemove);
	}

	@Override
	public Map<Coordinate, IVoxel> getVoxelMap() {
		return null;
	}

	@Override
	public Coordinate getOffset() {
		return Coordinate.getZero();
	}

	@Override
	public boolean boundingHit(Ray incoming) {
		if (baseMap.boundingHit(incoming)) return true;
		for (IRenderable r : renderables) {
			if (r.boundingHit(incoming)) return true;
		}
		return false;
	}

	@Override
	public boolean isImmutable() {
		return false;
	}

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean load(String fileName) {
		SaveReader reader = new SaveReader(fileName, Model.getInstance().getSaveName(), ".scn");
		String[] words;
		Placeable toAdd = null;
		boolean worked = true;
		while ((words = reader.readLine()) != null) {
			if (words[0].equals("new") && words[1].equals("PLACEABLE")) {
				if (toAdd != null) {
					add(toAdd);
				}
				toAdd = new Placeable();
			}
			else if (words[0].equals("PLACEABLE") && words[1].equals("load")) {
				if (toAdd != null) {
					toAdd.load(words[2]);
				} else {
					worked = false;
				}
			}
		}
		return worked;
	}
}