class TV1 {
	int size;
	String color;
	
	public TV1(int size, String color) {
		this.size = size;
		this.color = color;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}
	
	public void show() {
		System.out.println(size + "��ġ " + color + "�� �Դϴ�.");
	}
}

public class ClassTV {
	public static void main(String[] args) {
			
		System.out.println("TV �׽�Ʈ");

		TV1 tv = new TV1(10,"blue");
        TV1 tv12 = new TV1(20,"blue");
        
        System.out.println(tv.getSize() + "��ġ �Դϴ�");
        System.out.println(tv.getColor() + "�� �Դϴ�");
        
        tv.show(); // 10 ��ġ bule �� �Դϴ�.       		
	}
}
