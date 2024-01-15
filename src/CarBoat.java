class Car {
   void myCar() {
      System.out.println("This is my car");
   }

//   public static void main(String[] args) {
//      CarBoat c = new CarBoat();
//      c.myCar();
//      Boat t = new Boat();
//      t.myBoat();
//   }
}

class Boat {
   void myBoat() {
      System.out.println("This is my boat \n");
   }

//   public static void main(String[] args) {
//	      Car c = new Car();
//	      c.myCar();
//	      CarBoat t = new CarBoat();
//	      t.myBoat();
//	   }
}

class UpDown {
	int num = 0;
	
	void up(int num) {
		this.num += num;
		System.out.println("int this.num = " + this.num);
	}
	void up(double num) {
		this.num += num;
		System.out.println("double this.num = " + this.num);
	}
	void up(String str) {
		System.out.println("String = " + str);
	}
	void up(int num1, int num2) {
		System.out.println("int + int = " + num1 + num2);
	}
	void up(int num1, char chr) {
		System.out.println("num1, char = " + num1 + " " + chr);
	}
	void up(String str1, String str2) {
		System.out.println("String, String = " + str1 + " " + str2);
	}
}

public class CarBoat {
	public static void main(String[] args) {
		Car c = new Car();
		c.myCar();
		Boat t = new Boat();
		t.myBoat();
		
		//오버로딩
		UpDown up = new UpDown();
		up.up(9);
		up.up(7.5);
		up.up("AAA");
		up.up(10, 20);
		up.up("AAA", "BBB");
		up.up(10, 'K');
	}
}
