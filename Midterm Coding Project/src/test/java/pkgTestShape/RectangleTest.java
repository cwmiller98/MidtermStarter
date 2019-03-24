package pkgTestShape;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Rectangle;


public class RectangleTest {

	@Test
	public void RectangleTest1() throws Exception {
		
		Rectangle arr = new Rectangle(1, 3);
		System.out.println(arr);
	
	}
	
	@Test
	public void getiLen_Test() throws Exception 
	{
		Rectangle arr = new Rectangle(1, 3);
		double recLen = arr.getiLen();
		double test = 3;

		assertTrue(recLen == test);
	
	}
	@Test
	public void setiLen_test() throws Exception {
		Rectangle arr = new Rectangle(1, 3);
		arr.setiLen(3);
		assertTrue(arr.getiLen() == 3);
	}
	
	@Test
	public void getiWid_Test() throws Exception 
	{
		Rectangle arr = new Rectangle(1, 3);
		double recWid = arr.getiWid();
		double test = 1;

		assertTrue(recWid == test);
	
	}
	
	@Test
	public void setiWid_test() throws Exception {
		Rectangle arr = new Rectangle(1, 3);
		arr.setiWid(1);
		assertTrue(arr.getiWid() == 1);
		System.out.println();
	}
	
	@Test
	public void RectangleAreaTest() throws Exception 
	{
		Rectangle arr = new Rectangle(2, 3);	
		double recA = arr.area();
		double test = 6;
		
		assertTrue(recA == test);
		
	}
	
	@Test
	public void RectanglePerimeterTest() throws Exception 
	{
		Rectangle arr = new Rectangle(3, 4);		
		double recP = arr.perimeter();
		double test = 14;
		
		assertTrue(recP == test);	

}
	@Test
	(expected = IllegalArgumentException.class)
	public void Exception_test1() throws Exception
	{
		Rectangle arr = new Rectangle(0,-3);	
	}
	
	// COULD NOT FIGURE OUT HOW TO TEST COMPARE TO
	
}

