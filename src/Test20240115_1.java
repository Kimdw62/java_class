import java.util.Scanner;

class Box {
	private String conts;
	
	Box(String cont) {
		this.conts = cont;
	}
	public String toString() {	//오버로딩 적용
		return conts;
	}
}

public class Test20240115_1 {

	public static void main(String[] args) {
//		StringBuilder stb = new StringBuilder("12");
//		stb.append("34");
//		System.out.println(stb);
//		System.out.println(stb.toString());
//
//		Box box = new Box("Camera");
//		System.out.println(box.toString());
//		System.out.println(box);
//		
//		String source = "1 3 5";
//		Scanner sc = new Scanner(source);
//		//Scanner sc = new Scanner(System.in);	//1 3 5
//		int num1 = sc.nextInt();	//1
//		int num2 = sc.nextInt();	//3
//		int num3 = sc.nextInt();	//5
//		
//		int sum = num1 + num2 + num3;
//		System.out.println(sum);
//
//		Scanner sc1 = new Scanner(System.in);
//		String str1 = sc1.next();		//스페이스 구분자
//		String str2 = sc1.next();
//		//String str1 = sc1.nextLine();	//라인단위
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		sc.close();
		
		int[] ar1 = new int[5];
		double[] ar2 = new double[7];
		float[] ar3;
		ar3 = new float[9];
		
		System.out.println("ar1 = " + ar1.length);
		System.out.println("ar2 = " + ar2.length);
		System.out.println("ar3 = " + ar3.length);
		
		//값을 쓴다=값을 넣는다=저장한다
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		ar1[3] = 4;
		ar1[4] = 5;
		
		//값을 읽는다
		for(int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		int[] arr = new int[10];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);	//fasasfas
	}

}
