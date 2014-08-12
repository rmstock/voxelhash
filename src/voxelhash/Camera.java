package voxelhash;
import java.util.Set;

// TODO Everything!
public class Camera {
	private Vector3 up;
	private Vector3 forward;
	private Vector3 right;
	private float fov;
	private float viewDist;
	
	private ViewType viewType;
	
	public Camera(Vector3 up, Vector3 forward, Vector3 right, float fov, float viewDist, ViewType viewType) {
		this.up = up;
		this.forward = forward;
		this.right = right;
		this.fov = fov;
		this.viewDist = viewDist;
		this.viewType = viewType;
	}
	
	public Set<Coordinate> lookAt(ModelGroup world) {
		// TODO fill out
		return null;
	}

}
