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
		System.out.println(size + "인치 " + color + "색 입니다.");
	}
}

public class ClassTV {
	public static void main(String[] args) {
			
		System.out.println("TV 테스트");

		TV1 tv = new TV1(10,"blue");
        TV1 tv12 = new TV1(20,"blue");
        
        System.out.println(tv.getSize() + "인치 입니다");
        System.out.println(tv.getColor() + "색 입니다");
        
        tv.show(); // 10 인치 bule 색 입니다.       		
	}
}
