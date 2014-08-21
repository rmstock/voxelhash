package voxelhashtests;

import voxelhash.RayIterator;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RayIteratorTest {

  @Test
  public void RayIterator() {
    RayIterator ray = new RayIterator(new int[] {0,0,0}, new float[]{0,1,0});
    Assert.assertTrue(ray.hasNext());
    Assert.assertEquals(Arrays.hashCode(ray.next()), Arrays.hashCode(new int[] {0,0,0}));
    int[] coord = new int[]{(int)(Math.random()*10.0), (int)(Math.random()*10.0), (int)(Math.random()*10.0)};
    float[] vector = new float[]{(float)Math.random() - .5f, (float)Math.random() - .5f, (float)Math.random() - .5f};
    ray = new RayIterator(coord, vector);
    int prev = coord[0] + coord[1] + coord[2] - 1;
    System.out.println(coord[0] + " " + coord[1] + " " + coord[2]);
    for (int i = 0; i < 100; i++) {
    	int[] next = ray.next();
    	int value = next[0] + next[1] + next[2];
    	System.out.println(next[0] + " " + next[1] + " " + next[2]);
    	Assert.assertTrue(value - prev == 1 || value - prev == -1);
    	prev = value;
    }
  }
}
