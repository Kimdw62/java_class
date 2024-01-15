import com.wxfx.smart.Child;
import com.wxfx.smart.Circle;
import com.wxfx.smart.Rectangle;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());

		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		
		//문제가 되는 부분
//		c.rad = -4.5;    // 컴파일 오류로 이어짐
		
		System.out.println(c.getArea());
/***********************************************************/		
		Rectangle rec = new Rectangle(10, 5);
		System.out.println(rec.getArea());
/***********************************************************/		
		Child per1 = new Child(15, "홍길동");
		per1.showInfo();

		Child per2 = new Child(-15, null);
		per2.showInfo();
		
	}

}

