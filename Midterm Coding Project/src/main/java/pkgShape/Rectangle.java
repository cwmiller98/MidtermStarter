package pkgShape;
import pkgShape.Shape;
import java.lang.Exception;


public class Rectangle extends Shape implements Comparable<Object> {
	
	private int iWid;
	private int iLen;
	
	public Rectangle(int iWid, int iLen) throws Exception {
		super();
		if(iWid > 0 && iLen > 0) {
		this.iWid = iWid;
		this.iLen = iLen;
	}
		else 
			throw new IllegalArgumentException("Invalid Length or Width");
	}
	
	public int getiWid() {
		return iWid;
	}
	
	public void setiWid(int iWid) {
		this.iWid = iWid;
		
	}
	
	public int getiLen() {
		return iLen;
	}
	
	public void setiLen(int iLen) {
		this.iLen = iLen;
		
	}

	@Override
	public int compareTo(Object o) {

		Rectangle r = (Rectangle)o;
		
		if (o instanceof Rectangle) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		double thisArea = this.area();
		double otherArea = r.area();
		
		if 
		(thisArea > otherArea) {
			return 1;
		}
		else if (thisArea == otherArea) {
			return 0;
		}
		else {
			return -1;
		}
	}

	@Override
	public double area() {

		return iLen * iWid;
	}

	@Override
	public double perimeter() throws Exception {

		return 2 * (iLen + iWid);
	}
	
}
