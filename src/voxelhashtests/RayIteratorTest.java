package voxelhashtests;

import voxelhash.Coordinate;
import voxelhash.RayIterator;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class RayIteratorTest {

  @BeforeClass
  public void beforeClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }


  @Test
  public void RayIterator() {
    RayIterator ray = new RayIterator(new int[] {0,0,0}, new float[]{0,0,0});
    Assert.assertTrue(ray.hasNext());
    Assert.assertEquals(Arrays.hashCode(ray.next()), Arrays.hashCode(new int[] {0,1,0}));
  }

  @Test
  public void hasNext() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void next() {
    throw new RuntimeException("Test not implemented");
  }
}
