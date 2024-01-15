class AccessWay {
	static int num = 0;
	
	AccessWay() {
		incrCnt();
	}

	void incrCnt() {
		num++;
	}
}

class Card {
	String kind;
	int num;
	
	static final int WIDTH = 180;
	static final int HEIGHT = 180;



}





public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay way = new AccessWay();	//1
		way.num++;							//2 외부에서 인스턴스의 이름을 통한 접근
		AccessWay.num++;					//3 외부에서 클래스의 이름을 통한 접근
		System.out.println("num = " + AccessWay.num);
		
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		
	}
}
