import java.util.Scanner;

import com.wxfx.simple.Circle;
//import com.wxfx.smart.Circle;


//1. 변수의 스코프에 대하여 설명하시오. - 
//1. 변수의 스코프와 라이프 타임 
//변수의 스코프(영역)란 변수가 접근할 수 있는 유효 범위를 말한다.
//일반적인 규칙은 변수가 선언된 블록내에서만 변수에 접근할 수 있다.
//블록은 { }을 말하는데, Java에서 Class와 Method가 블록을 가진다.
// 
//쉽게 말해 스코프란 변수를 사용할 수 있는 영역이고, 스코프는 변수가 선언되는 영역에 따라 접근하는 방법이 다르다.
// 
//라이프 타임은 이러한 변수가 유효한 시간을 말하는데, 프로그램이 구동되는 동안 변수가 '값을 담고 있을 수 있는 주기'를 말한다.
//라이프 타임은 변수의 종류에 따라 상이하기 때문에 각각의 차이를 이해하는 것이 중요하다. 
//출처: https://hyunsdevnote.tistory.com/9 [Hyun's Developer Note:티스토리]

//2. 지역변수란? - 
//지역변수(Local Variables)는 인스턴스 및 클래스 변수가 아닌 모든 변수를 말한다. 
//스코프는 선언된 블록 내이며 컨트롤이 선언된 블록을 떠날 때까지 유효하다.
//쉽게 말해 지역 변수는 메소드 내에서 선언되어 메소드 내에서만 사용이 가능한 변수를 말한다. 
//출처: https://hyunsdevnote.tistory.com/9 [Hyun's Developer Note:티스토리]

//3. 인스턴스 변수란? - 
//인스턴스 변수(Instacne Variables)는 클래스 내부와 모든 메소드 및 블록 외부에서 선언된 변수를 말한다.
//static 메서드를 제외한 클래스 전체를 소코프로 가진다.
//객체가 메모리에 남아있을 때까지 유효하다. 
//출처: https://hyunsdevnote.tistory.com/9 [Hyun's Developer Note:티스토리]
	
//5.클래스의 구성요소는?
//필드, 생성자, 메서드 + This




class A{
	int a = 5;	//인스턴스 변수, 객체 변수 (함수 외부)
	
	public int getA() {
		return a;
	}

	public void setA(int b) {
		a = b;
	}
}

class B{
	int b;
	
	public int getB() {
		return b;
	}
}

class Circle1{
//	final double PI = 3.14;
//	double radius;
//
//	//생성자(constructor)
//	public Circle1() {
//		System.out.println("생성자 : 안녕하세요.");
//	}
//	
//	public double getRadius() {
//		return radius;
//	}
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
//
//	public double getArea() {
//		return radius * radius * PI;
//	}
	
	double rad = 0;
	final double PI = 3.14;
	
	public Circle1(double r) {
		setRad(r);
	}
	
	public void setRad(double r) {
		if (r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}

	public double getArea() {
		return rad * rad * PI;
	}
}
	
	

//class Rectangle {
//	public int GetArea(int w, int h) {
//		return w * h;
//	}
//	public int setWidthHeight(int w, int h) {
//		return w * h;
//	}
//
////	public int setWidht(int w) {
////		return w = 50;
////	}
//}

class AA {
	//생성자
	//일반 함수와는 다름
	//리턴타입 없음, 클래스 이름과 같다
	int num;
	int count;
	
	public AA() {
		System.out.println("AA : 안녕하세요");
	}

	public AA(int num, int count) {
		this.num = num;
		this.count = count;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class TV {
	String brand;	//String 대문자
	int year;
	int inch;
	
	public TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println (brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}

	public void objShow(TV myTV) {
//		System.out.println (brand + "에서 만든 " + year + "년형 " + inch + "인치 TV - objShow");
		myTV.show();
	}
}

//평균
class Grade {
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {
		return (math + science + english) / 3.0;
	}
}

class Song {
	String title;	//String 대문자
	String artist;
	int year;
	String country;
	
	public Song() {	//기본 생성자
		
	}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	//1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
	public void show() {
		System.out.println (year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}

	public void objShow(Song song) {
//		System.out.println (year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
		song.show();
	}
}

class BankAccount {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkBalance() {
		System.out.println("잔액:" + balance);
		return balance;
	}
}

//지역변수(함수 내부)
public class ClassTest {
	public static void main(String[] args) {
		int result;
	
//		System.out.println(Math.PI);
//		Scanner sc1 = new Scanner(System.in);
//		Circle c = new Circle();
//		com.wxfx.simple.Circle c1 = new com.wxfx.simple.Circle();
//		com.wxfx.smart.Circle c2 = new com.wxfx.smart.Circle();
		
		AA aa = new AA();
		System.out.println(aa);
		
		AA aa2 = new AA(5, 10);
		System.out.println(aa2.getNum());
		
		aa2.setNum(100);
		System.out.println(aa2.getNum());
		
		A a = new A();	//객체 생성
		A a1 = new A();
		
		a.a = 10;
		a1.a = 10;
		
		System.out.println(a.a);
		
		System.out.println(a1.a);
		
		result = a.getA();
		System.out.println(result);
		
		a.setA(55);
		System.out.println(a.a);

////////////////////////////////////////////////////////////
		B b = new B();
		B b1 = new B();
		
		b.b = 7;
		
		System.out.println(b);
		System.out.println(b.b);
		System.out.println(b1.b);

		result = b.getB();
		System.out.println(result);
		
//////////////////////////////////////////////////////////////
//		Circle1 circle = new Circle1(1.5);
		
//		System.out.println(circle.getArea());

//		circle.setRad(2.5);
//		System.out.println(circle.getArea());
//		circle.setRad(-3.3);
//		System.out.println(circle.getArea());
//		circle.rad = -4.5;    // 컴파일 오류 발생 안함
//		System.out.println(circle.getArea());
		
//		System.out.println(circle.PI);
//		System.out.println(circle.rad);
//		System.out.println(circle.getArea());
//		
//		circle.rad = 10;
//		System.out.println(circle.getArea());
//		
//		circle.rad = 20;
//		System.out.println(circle.getArea());
////////////////////////////////////////////////////////////////
//		int width;
//		int height;
//		
//		Rectangle rec = new Rectangle();
//
//		width = 10;
//		height = 10;
//		result = rec.GetArea(width, height);
//		System.out.println(result);
//		
//		width = 20;
//		height = 20;
//		result = rec.setWidthHeight(width, height);
//		System.out.println(result);
/////////////////////////////////////////////////////////////
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년형 32인치 TV
		myTV.show();
		
		
		myTV.objShow(myTV);
		
		
		
/////////////////////////////////////////////////////////////	성적
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
//		int math = sc.nextInt();
//		int science = sc.nextInt();
//		int english = sc.nextInt();
//
//		Grade me = new Grade(math, science, english);
//		System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴
//		
//		sc.close();
////////////////////////////////////////////////////////////////////////		
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴"); // 1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
		song.show();

		song.objShow(song);
		
////////////////////////////////////////////////////////////////////////
		BankAccount ref1 = new BankAccount();	//ref1 기준 : 3000 + 2000 - 400 - 300 : 4300
		BankAccount ref2 = ref1;
		
//		ref2 = null;
//		System.out.println(ref2);
//		if(ref2 == null) {
//			System.out.println("프로그램을 종료 합니다.");
//		} else {
			ref1.deposit(3000);
			ref2.deposit(2000);
			ref1.withdraw(400);
			ref2.withdraw(300);
			ref1.checkBalance();
			ref2.checkBalance();
//		}
////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
	}
	

}
