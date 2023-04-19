import static org.junit.Assert.*;

import java.sql.Array;

import org.junit.*;

public class ArrayTests {


  
  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input1);
	}

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2};
    assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input1));
  }


	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testAverageWithoutLowestGroupMatesIdea(){
    double[] input1 = { -3, -2, -1, 0, 1, 2};
    double ans = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(0.0, ans, 0.000000001);
  }

  @Test
  public void testAverageWithoutLowestRepeatingLowest(){
    double[] input1 = { 1, 1, 5};
    double ans = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(3.0, ans, 0.000000001);
  }
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

}
