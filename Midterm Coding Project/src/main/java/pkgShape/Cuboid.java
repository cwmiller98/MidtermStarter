package pkgShape;
import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int iDep;
	
	public Cuboid(int iWid, int iLen) throws Exception {
		super(iWid,iLen);
	}
	
	public Cuboid(int iWid, int iLen, int iDep) throws Exception {
		super(iWid, iLen);
		this.iDep = iDep;
		if(iDep > 0)
			this.iDep = iDep;
		
		else
			throw new IllegalArgumentException("Invalid Depth");
	}
	
	public int getiDep() {
		return iDep;
		
	}
	
	public void setiDep(int iDep) {
		this.iDep = iDep;
		
	}
	
	@Override 
	public double area() {
		
		return (iDep * super.getiWid() * super.getiLen()) * 4; 
		
	}
	
	public double volume() {
	
		return iDep * super.getiWid() * super.getiLen();

}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Invalid");
	} 
	}
