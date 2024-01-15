import java.util.Scanner;

public class Test20240112_2 {
	public static void main(String[] args) {
//		char chaStr;
//		String resChar = "";
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열을 입력하세요.(역순으로 나타내기) >> \n");
//		String str = sc.next();
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			chaStr = str.charAt(i);
//			resChar = resChar.concat(Character.toString(str.charAt(i)));
////			System.out.println(chaStr);
//		}
//		System.out.println(resChar);
//		System.out.println();
//		
//		sc.close();
		
		String str = "abcdef";

		System.out.println(str.substring(2));		//"cdef"
		System.out.println(str.substring(2, 4));	//"cd"

		   String st1 = "Lexicographically";
		   String st2 = "lexicographically";
		   int cmp;
		   
		   if(st1.equals(st2))	//equals
		      System.out.println("두 문자열은 같습니다.");
		   else
		      System.out.println("두 문자열은 다릅니다.");
	
		   cmp = st1.compareTo(st2);	//compareTo
		   System.out.println("st1.compareTo(st2) = " + cmp);
		   if(cmp == 0)
		      System.out.println("두 문자열은 일치합니다.");
		   else if (cmp < 0)
		      System.out.println("사전의 앞에 위치하는 문자: " + st1);
		   else
		      System.out.println("사전의 앞에 위치하는 문자: " + st2);
		   
		   if(st1.compareToIgnoreCase(st2) == 0)	//compareToIgnoreCase
		      System.out.println("두 문자열은 같습니다.");
		   else
		      System.out.println("두 문자열은 다릅니다.");
	
		   double e = 2.718281;
		   String se = String.valueOf(e);
		   System.out.println(se);
		   
		   for(int i = 1; i <= 5; i++) {
			   System.out.println(i + i);
			   System.out.println(String.valueOf(i) + i);	//== System.out.println("" + i + i);
		   }

		   System.out.println("funny" + "camp");
		   System.out.println("funny".concat("camp"));

		   String str1 = "funny";
//		   str1 += "camp";    			// str1 = str1 + "camp"
		   str1 = str1.concat("camp");	// str1 = str1 + "camp"
		   System.out.println(str1);
		   
		   String birth = "<양>" + 7 + '.' + 16;
		   System.out.println(birth);
		   birth = (new StringBuilder("<양>").append(7).append('.').append(16)).toString();	//StringBuilder
		   System.out.println(birth);
///////////////////////////////////////////////////////////////////////////
		   // 문자열 "123"이 저장된 인스턴스의 생성
		   StringBuilder stbuf = new StringBuilder("123");
		   
		   stbuf.append(45678);   // 문자열 덧붙이기
		   System.out.println(stbuf.toString());	//12345678
		   System.out.println(stbuf);				//12345678
		   
		   stbuf.delete(0, 2);    // 문자열 일부 삭제
		   System.out.println(stbuf.toString());	//345678
		   
		   stbuf.replace(0, 3, "AB");    // 문자열 일부 교체
		   System.out.println(stbuf.toString());	//AB678

		   stbuf.reverse();    // 문자열 내용 뒤집기
		   System.out.println(stbuf.toString());	//876BA

		   String sub = stbuf.substring(2, 4);  // 일부만 문자열로 반환
		   System.out.println(sub);				//6B
////////////		   
		   StringBuilder sbStr = new StringBuilder("age");
		   sbStr.append(17);   // 문자열 덧붙이기
		   System.out.println(sbStr.toString());	//age17
////////////////////////////////////////////////////////////////////////////
//		   server edit
		   
	}

}
