class CShape{
	public double area() {
		return 0.0;
	}
	public void show() {
		System.out.println(area());
	}
}
class CCircle extends CShape{
	private double radius;
	public CCircle(int a) {
		radius = a;
	}
	public double area() {
		return radius*radius*3.14;
	}
}
class CSquare extends CShape{
	private double base2;
	public CSquare(int a) {
		base2 = a;
	}
	public double area() {
		return base2*base2;
	}
}
class CTriangle1 extends CShape{
	private double base1;
	private double height1;
	public CTriangle1(int a,int b) {
		base1 = a;
		height1 = b;
	}
	public double area() {
		return base1*height1/2;
	}
}
public class Class11 {

	public static void main(String[] args) {
		CShape a = new CCircle(10);
		a.show();
		CShape b = new CSquare(5);
		b.show();
		CShape c = new CTriangle1(5,10);
		c.show();
	}

}
