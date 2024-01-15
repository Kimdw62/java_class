class InstCnt {
	static int instNum = 0;	//테스트1
//	int instNum = 0;
	
	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
}
public class ClassVar {
	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
//		InstCnt cnt1;
//		System.out.println(++InstCnt.instNum);
	
		//테스트1
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();

		//테스트2		
//		System.out.println(++InstCnt.instNum);
//		System.out.println(++cnt1.instNum);
//		System.out.println(++cnt2.instNum);
//		System.out.println(++cnt3.instNum);
	}
}
