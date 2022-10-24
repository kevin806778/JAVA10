class CTriangle{
	protected int base;
	protected int height;
	
	protected void show() {
		System.out.println("base="+base+",height="+height);
	}
}
class CDate extends CTriangle{ //(a)
	
	 private double value;
	
	public CDate(int a,int b) {
		base = a;
		height= b;
		value = base * height /2;
	}
	public void area() {
		System.out.println("base=" + base+", height=" + height );
		System.out.println("area=" + value);
	}
}
public class Class06 {

	public static void main(String[] args) {
		CDate obj = new CDate(3,8);
		obj.area();

	}

}
