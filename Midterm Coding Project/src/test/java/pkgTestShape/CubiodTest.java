package pkgTestShape;
import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.Exception;
import pkgShape.Cuboid;
import pkgShape.Rectangle;

import java.util.*;
import pkgShape.SortByArea;
import pkgShape.SortByVolume;


public class CubiodTest {
	
	@Test
	public void constructor_Test() throws Exception
	{
		Cuboid arr = new Cuboid(1,2,3);
		assertTrue(arr.getiWid() == 1 && arr.getiLen() == 2 && arr.getiDep() == 3);
	}
	
	@Test
    public void getiDep_Test() throws Exception 
	{
    	Cuboid arr = new Cuboid(1,2,3);
		assertTrue(arr.getiDep() == 3);
    }
    
	@Test
    public void setiDep_Test() throws Exception 
	{
    	Cuboid arr = new Cuboid(3,4);
    	arr.setiDep(9);
		assertTrue(arr.getiDep() == 9);
    }
	@Test
	public void getiLen_Test() throws Exception 
	{
		Cuboid arr = new Cuboid(1, 3);
		double cubLen = arr.getiLen();
		double test = 3;

		assertTrue(cubLen == test);
	
	}
	@Test
	public void setiLen_test() throws Exception {
		Cuboid arr = new Cuboid(1, 3);
		arr.setiLen(3);
		assertTrue(arr.getiLen() == 3);
	}
	
	@Test
	public void getiWid_Test() throws Exception 
	{
		Cuboid arr = new Cuboid(1, 3);
		double cubWid = arr.getiWid();
		double test = 1;

		assertTrue(cubWid == test);
	
	}
	
	@Test
	public void setiWid_test() throws Exception {
		Cuboid arr = new Cuboid(1, 3);
		arr.setiWid(1);
		assertTrue(arr.getiWid() == 1);
		System.out.println();
	}
    
	@Test
    public void area_Test() throws Exception // Could not figure out why this fails
	{
    	Cuboid arr = new Cuboid(3,4,5);
    	assertTrue(arr.area() == 94);
    }
	
	@Test
    public void volume_Test() throws Exception
	{
    	Cuboid arr = new Cuboid(1,2,3);
    	assertTrue(arr.volume() == 6);
    }

	@Test
	(expected = UnsupportedOperationException.class)
	public void Perimeter_Test() throws Exception {
		Cuboid testCub = new Cuboid(1, 2, 3);
		testCub.perimeter();
	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void ThrownProperly_Test_InitDep() throws Exception 
	{
		Cuboid testCub = new Cuboid(1, 2, 0);
	}
	
	@Test
	public void SortByArea_Test() throws Exception {
		Cuboid testCub1 = new Cuboid(1, 2, 3);
		Cuboid testCub2 = new Cuboid(4, 5, 6);
		
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
		cubs.add(testCub1);
		cubs.add(testCub2);
	
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>();
		expected.add(testCub2);
		expected.add(testCub1);
		
		Collections.sort(cubs, new SortByArea());		
		assertTrue(cubs.equals(expected));			
		}
	
	@Test
	public void SortByVolume_Test_Pass() throws Exception {
		Cuboid testCub1 = new Cuboid(3, 4, 5);
		Cuboid testCub2 = new Cuboid(6, 7, 8);	
		
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
		cubs.add(testCub1);
		cubs.add(testCub2);
	
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>();
		expected.add(testCub2);
		expected.add(testCub1);
		
		Collections.sort(cubs, new SortByVolume());	
		assertTrue(cubs.equals(expected));			
		}

}
