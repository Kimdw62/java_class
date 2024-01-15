
public class EscapeSequences {

	public static void main(String[] args) {
		System.out.println("bAB" + '\b' + 'C');		//프롬프트에서는 정상으로 표현됨(C:\Users\601-11\Documents\workspace-sts-3.9.11.RELEASE\java_class\bin>java EscapeSequences)
		System.out.println("tAB" + '\t' + 'C');
		System.out.println("nAB" + '\n' + 'C');
		System.out.println("rAB" + '\r' + 'C');
	}

}
