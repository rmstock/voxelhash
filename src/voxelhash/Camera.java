package voxelhash;
import java.util.Set;

// TODO Everything!
public class Camera {
	private float[] forward;
	private float fovRad;
	private float viewDist;
	private ViewType viewType;
	private int width;
	private int height;
	static final float LENS_WIDTH = .002f;
	
	public Camera(float[] forward, float fovRad, float viewDist, ViewType viewType, int width, int height) {
		this.forward = forward;
		this.fovRad = fovRad;
		this.viewDist = viewDist;
		this.viewType = viewType;
		this.width = width;
		this.height = height;
		this.aspect = width / height;
	}
	
	public Set<byte[][][]> lookAt(ModelGroup world) {
		// TODO fill out
		// Camera lens should only be about 1/8 inch or 2mm in diameter.
		// Calculate distance to focal point using fov.
		byte[][][] image = new byte[width][height][3];
		float yDist = LENS_WIDTH / (float)Math.tan(fovRad / 2.0f);
		float pixStep = LENS_WIDTH / (width / 2.0f);
		float xLoc = -pixStep * (width - 1) / 2.0f;
		float zLoc = -pixStep * (height - 1) / 2.0f;
		for (int z = 0; z < height; z++) {
			for (int x = 0; x < width; x++) {
				Ray cast = new Ray(new int[]{0,0,0} , new float[] {xLoc, yDist, zLoc});
				world.collision(cast, image[x][z]);
				xLoc += pixStep;
			}
			zLoc += pixStep;
		}
		return null;
	}

}
