class CShape{
	public double area() {
		return 0.0;
	}
}
class CCircle extends CShape{
	private double radius;
	private double value1;
	public CCircle(int a) {
		radius = a;
	}
	
	public double area() {
		value1 = radius*radius*3.14;
		return value1;
	}
}
class CSquare extends CShape{
	private double base2;
	private double value2;
	public CSquare(int a) {
		base2 = a;
	}
	public double area() {
		value2 = base2*base2;
		return value2;
	}
}
class CTriangle1 extends CShape{
	private double base1;
	private double height1;
	private double value3;
	public CTriangle1(int a,int b) {
		base1 = a;
		height1 = b;
	}
	public double area() {
		value3 = base1*height1/2;
		return value3;
	}
}
public class Class11 {
	public static void main(String[] args) {
		CShape a = new CCircle(10);
		CShape b = new CSquare(5);
		CShape c = new CTriangle1(5,10);
		double x[] = new double[3];
		
		System.out.println("CCircle(10)=" + a.area());
        System.out.println("CSquare(5)=" + b.area());
        System.out.println("CTriangle1(5,10)=" + c.area());
        x[0] = a.area();
        x[1] = b.area();
        x[2] = c.area();
        System.out.println("The largest area is " + largest(x));
	}
	public static double largest(double x[]) {
        double max = x[0];
        for (int i = 0; i < x.length; i++)
            if (max < x[i])
                max = x[i];
        return max;
    }
}
