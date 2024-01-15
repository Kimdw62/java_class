import java.lang.System;;

class NumberPrinter {
	private int myNum = 0;
	
	static void showInt(int n) {
		System.out.println(n);
	}
	
	static void showDouble(double n) {
		System.out.println(n);
//		System.out.println("d->" + myNum);
	}
	
	void setMyNumber(int n) {
		myNum = n;
		System.out.println(myNum);
	}
	
	void showMyNumber() {
		showInt(myNum);
	}
}





public class ClassMethod {
	public static void main(String[] args) {
		NumberPrinter.showInt(20);	//클래스명 접근

		NumberPrinter np = new NumberPrinter();	//객체생성 접근
		NumberPrinter.showDouble(3.15);
	    
		np.setMyNumber(75);	//객체
		np.showMyNumber();
	}

}
