package voxelhash;
import java.util.Set;

// TODO Everything!
public class Camera {
	private float[] up;
	private float[] forward;
	private float[] right;
	private float fov;
	private float viewDist;
	
	private ViewType viewType;
	
	public Camera(float[] up, float[] forward, float[] right, float fov, float viewDist, ViewType viewType) {
		this.up = up;
		this.forward = forward;
		this.right = right;
		this.fov = fov;
		this.viewDist = viewDist;
		this.viewType = viewType;
	}
	
	public Set<int[]> lookAt(ModelGroup world) {
		// TODO fill out
		return null;
	}

}
