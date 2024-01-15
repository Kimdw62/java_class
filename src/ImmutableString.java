
public class ImmutableString {
	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		String str5 = "simple String";
   
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
//		String ss = "카운트";
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
		
		if(str1.equals(str3))	//equals-글자비교
			System.out.println("같음");
		else
			System.out.println("틀림");

		
		System.out.println();
		
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
		if(str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		
		
	}
}
