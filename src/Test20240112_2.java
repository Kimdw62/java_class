import java.util.Scanner;

public class Test20240112_2 {
	public static void main(String[] args) {
//		char chaStr;
//		String resChar = "";
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���ڿ��� �Է��ϼ���.(�������� ��Ÿ����) >> \n");
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
		      System.out.println("�� ���ڿ��� �����ϴ�.");
		   else
		      System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
	
		   cmp = st1.compareTo(st2);	//compareTo
		   System.out.println("st1.compareTo(st2) = " + cmp);
		   if(cmp == 0)
		      System.out.println("�� ���ڿ��� ��ġ�մϴ�.");
		   else if (cmp < 0)
		      System.out.println("������ �տ� ��ġ�ϴ� ����: " + st1);
		   else
		      System.out.println("������ �տ� ��ġ�ϴ� ����: " + st2);
		   
		   if(st1.compareToIgnoreCase(st2) == 0)	//compareToIgnoreCase
		      System.out.println("�� ���ڿ��� �����ϴ�.");
		   else
		      System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
	
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
		   
		   String birth = "<��>" + 7 + '.' + 16;
		   System.out.println(birth);
		   birth = (new StringBuilder("<��>").append(7).append('.').append(16)).toString();	//StringBuilder
		   System.out.println(birth);
///////////////////////////////////////////////////////////////////////////
		   // ���ڿ� "123"�� ����� �ν��Ͻ��� ����
		   StringBuilder stbuf = new StringBuilder("123");
		   
		   stbuf.append(45678);   // ���ڿ� �����̱�
		   System.out.println(stbuf.toString());	//12345678
		   System.out.println(stbuf);				//12345678
		   
		   stbuf.delete(0, 2);    // ���ڿ� �Ϻ� ����
		   System.out.println(stbuf.toString());	//345678
		   
		   stbuf.replace(0, 3, "AB");    // ���ڿ� �Ϻ� ��ü
		   System.out.println(stbuf.toString());	//AB678

		   stbuf.reverse();    // ���ڿ� ���� ������
		   System.out.println(stbuf.toString());	//876BA

		   String sub = stbuf.substring(2, 4);  // �Ϻθ� ���ڿ��� ��ȯ
		   System.out.println(sub);				//6B
////////////		   
		   StringBuilder sbStr = new StringBuilder("age");
		   sbStr.append(17);   // ���ڿ� �����̱�
		   System.out.println(sbStr.toString());	//age17
////////////////////////////////////////////////////////////////////////////
		   
		   
	}

}
