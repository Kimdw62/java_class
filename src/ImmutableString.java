
public class ImmutableString {
	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		String str5 = "simple String";
   
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
//		String ss = "ī��Ʈ";
//		for(int i = 1; i < 10000; i++) {
//			ss = ss + i;
//			System.out.println(ss);
//		}
		
		String str6 = "two";
		switch (str6) {
		case "two":
			System.out.println("two");
			break;

		default:
			break;
		}
		
		if(str1 == str5)
			System.out.println("True");
		else
			System.out.println("False");

		if(str1 == str3)
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println();
		
		if(str1.equals(str3))	//equals-���ں�
			System.out.println("����");
		else
			System.out.println("Ʋ��");

		
		System.out.println();
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
		
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str3�� str4�� �ٸ� �ν��Ͻ� ����");
		
		
	}
}
