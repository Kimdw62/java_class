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
		NumberPrinter.showInt(20);	//Ŭ������ ����

		NumberPrinter np = new NumberPrinter();	//��ü���� ����
		NumberPrinter.showDouble(3.15);
	    
		np.setMyNumber(75);	//��ü
		np.showMyNumber();
	}

}
