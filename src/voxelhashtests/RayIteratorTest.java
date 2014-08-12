package voxelhashtests;

import voxelhash.RayIterator;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RayIteratorTest {
	RayIterator ray;

  @Test
  public void RayIterator() {
    ray = new RayIterator(new int[] {0,0,0}, new float[]{0,0,0});
    Assert.assertTrue(ray.hasNext());
    Assert.assertEquals(Arrays.hashCode(ray.next()), Arrays.hashCode(new int[] {0,1,0}));
  }

  @Test (dependsOnMethods = { "RayIterator" })
  public void hasNext() {
    Assert.assertTrue(ray.hasNext());
  }

  @Test (dependsOnMethods = { "RayIterator", "hasNext" })
  public void next() {
	int[] last = null;
    for(int i = 0; i < 100; i++) {
    	int[] now = ray.next();
    	int hash = last == null ? 0 : Arrays.hashCode(last);
    	Assert.assertNotEquals(hash, Arrays.hashCode(now));
    }
  }
}
