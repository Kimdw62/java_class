//문자열 연결
public class StringConcat {
	public static void main(String[] args) {
		String str1 = "Coffee";
		String str2 = "Bread";
		
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		String str4 = "Fresh".concat(str3);
		System.out.println(str4);
		
		str4 = "Fresh" + str1 + str2;
		System.out.println(str4);
	}

}
