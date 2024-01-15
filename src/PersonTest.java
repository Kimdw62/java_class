class Person {
	private int regiNum;    // 주민등록 번호
	private int passNum;    // 여권 번호
	private String strName;
	
	public Person(int regiNum, int passNum) {	//jung -1-
//		this.regiNum = regiNum;
//		this.passNum = passNum;
		this(regiNum, passNum, "");
		System.out.println("check-----------------jung");
		this.showPersonalInfo();
	}
	
	public Person(int regiNum) {	//hong
//		this.regiNum = regiNum;
//		this.passNum = 0;
		this(regiNum, 0);			//-1-을 참조
		System.out.println("check-----------------hong");
		this.showPersonalInfo();
	}
	
	public Person(int regiNum, int passNum, String strName) {	//kim
		this.regiNum = regiNum;
		this.passNum = passNum;
		this.strName = strName;
//		this(regiNum, passNum, strName);
	}
	
	void showPersonalInfo() {
		System.out.println("주민등록번호 : " + regiNum);
		
		if(passNum != 0) {
			System.out.println("여권번호 : " + passNum);
		} else {
			System.out.println("여권을 가지고 있지 않습니다.");
		}
		
		if(strName != null) {
			System.out.println("이름 : " + strName);
		} else {
			System.out.println("이름 : 이름업음");
		}
		System.out.println();	//라인피드
	}
}

public class PersonTest {
	public static void main(String[] args) {
		// 여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(330101, 112233);
		   
		// 여권 없는 사람의 정보를 담은 인스턴스 생성
		Person hong = new Person(771231);
		   
		jung.showPersonalInfo();
		hong.showPersonalInfo();
		
		Person kim = new Person(240101, 123123, "김선달");
		kim.showPersonalInfo();
	}

}
