class Caaa3{
	public void display() {
		System.out.println("printed from Caaa class");
	}
}
class Cbbb3 extends Caaa3 {
	
    public void display() {
    	System.out.println("printed from Cbbb class");
    }
}
public class Class09 {

	public static void main(String[] args) {
		Caaa3 bb=new Cbbb3();
		bb.display();
	}

}
