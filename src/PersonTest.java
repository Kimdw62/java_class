class Person {
	private int regiNum;    // �ֹε�� ��ȣ
	private int passNum;    // ���� ��ȣ
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
		this(regiNum, 0);			//-1-�� ����
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
		System.out.println("�ֹε�Ϲ�ȣ : " + regiNum);
		
		if(passNum != 0) {
			System.out.println("���ǹ�ȣ : " + passNum);
		} else {
			System.out.println("������ ������ ���� �ʽ��ϴ�.");
		}
		
		if(strName != null) {
			System.out.println("�̸� : " + strName);
		} else {
			System.out.println("�̸� : �̸�����");
		}
		System.out.println();	//�����ǵ�
	}
}

public class PersonTest {
	public static void main(String[] args) {
		// ���� �ִ� ����� ������ ���� �ν��Ͻ� ����
		Person jung = new Person(330101, 112233);
		   
		// ���� ���� ����� ������ ���� �ν��Ͻ� ����
		Person hong = new Person(771231);
		   
		jung.showPersonalInfo();
		hong.showPersonalInfo();
		
		Person kim = new Person(240101, 123123, "�輱��");
		kim.showPersonalInfo();
	}

}
