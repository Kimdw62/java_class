
class Triangle {
	int num1;
	int num2;
	
	public void initTriangle(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getArea() {
		return (num1 * num2) / 2;
	}
}


public class TriangleTest {
	public static void main(String[] args) {

		Triangle triangle2 = new Triangle();
		triangle2.initTriangle(10, 1000);
		        
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ´Â " + triangle2.getArea()); 		
	}
}
