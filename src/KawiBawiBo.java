import java.util.Scanner;

public class Player {
	private int rsp;
	
	public Player() {
		rsp = (int)(Math.random() * 3 + 1);
	}
	
	public Player(String str) {
		if (str.equals("����"))
			rsp = 1;
		else if (str.equals("����"))
			rsp = 2;
		else
			rsp = 3;
	}
	
	public void getResult(Player player) {
		if(this.rsp = player.rsp) {
			System.out.println("�����ϴ�.");
			return;
		}
		
		//1.���� 2.���� 3.��
		if(this.rsp == 1 && player.rsp == 2) {
			System.out.println("��ǻ�Ͱ� �����ϴ�.");
		} else if(this.rsp == 1 && player.rsp == 3) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else if(this.rsp == 2 && player.rsp == 3) {
			System.out.println("��ǻ�Ͱ� �����ϴ�.");
		} else if(this.rsp == 2 && player.rsp == 1) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else if(this.rsp == 3 && player.rsp == 2) {
			System.out.println("��ǻ�Ͱ� �����ϴ�.");
		} else if(this.rsp == 3 && player.rsp == 1) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		
	}
}

public class KawiBawiBo {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("���� ���� ���� �Է��ϼ���.");
    	String rsp = sc.next();
    	
    	Player user = new Player(rsp);
    	Player computer = new Player();
    	
    	computer.getResult(user);
    	
    	
    	
    
    
    }
}
	
//    	@SuppressWarnings("resource")
//		Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        String[] choice = {"����", "����", "��"}; //choice[0] ="����", choice[1] ="����", choice[2] ="��"
//        int[] result = {0, 0, 0};
//        int userChoice, comChoice, results;
//
//        while (true) {
//            System.out.println("����(1), ����(2), ��(3) �߿� �ϳ��� �����ϼ���.(0=����)");
//            userChoice = scanner.nextInt(); 	//0=����, 1=����, 2=��
//            comChoice = random.nextInt(3);     // 0=����, 1=����, 2=��
//            
////			System.out.println("userChoice = " + userChoice);	//Ȯ�ο�
//
//            if (userChoice < 1 || userChoice > 3) {
//            	if (userChoice == 0) {
//    	            System.out.println("���� ����: " + result[0] + "�� " + result[1] + "�� " + result[2] + "��");
//            		break;
//            	}
//            	System.out.println("�ٽ� �ϼ���...");
//            } else {
//            	userChoice = userChoice - 1;
//	            results = (userChoice - comChoice + 3) % 3;
//	            System.out.println("����� " + choice[userChoice] + "�� �½��ϴ�.");
//	            System.out.println("��ǻ�ʹ� " + choice[comChoice] + "�� �½��ϴ�.");
//	
//	            if (results == 0) {
//	                System.out.println("�����ϴ�.");
//	                result[2]++;
//	            } else if (results == 1) {
//	                System.out.println("����� �̰���ϴ�!");
//	                result[0]++;
//	            } else if (results == 2){
//	                System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
//	                result[1]++;
//	            }
//	            System.out.println("���� ����: " + result[0] + "�� " + result[1] + "�� " + result[2] + "��");
//            }
//        }
//        scanner.close();

//	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("����, ����, �� - �ϳ��� �Է� �ϼ���. >> ");
//		int math = sc.nextInt();
//
//		Grade me = new Grade(math, science, english);
//		System.out.println("����� "+me.average()); // average()�� ����� ����Ͽ� ����
//		
//		sc.close();

		
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 1. ������ � Ÿ���� ���� �Է¹ޱ�
//        System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
//        String userInput = br.readLine();
//
//        // 2. ��ǻ�Ͱ� �� Ÿ���� �����ϱ�
//        String[] rspList = new String[]{"����", "����", "��"};
//
//        Random random = new Random();
//
//        int randomIndex = random.nextInt(3); //�������� �ε����� ������
//        String cpuInput = rspList[randomIndex]; //�ε����� �ش��ϴ� ���� ���
//
//        System.out.println(cpuInput);	//��ǻ��
//
//        // 3. ����� ����ϱ�
//        String result = getResult(userInput, cpuInput);
//        System.out.println(result);
//	}
//
//	static String getResult(String userInput, String cpuInput) {
//        String userWin = "����ڰ� �¸��Ͽ����ϴ�";
//        String cpuWin = "��ǻ�Ͱ� �¸��Ͽ����ϴ�";
//        String draw = "�����ϴ�";
//
//        String result = draw;
//
//        switch (userInput) {
//            case "����":
//                if(cpuInput == "����") {
//                    result = cpuWin;
//                }
//                else if(cpuInput == "��") {
//                    result = userWin;
//                }
//                break;
//            case "����":
//                if(cpuInput == "��") {
//                    result = cpuWin;
//                }
//                else if(cpuInput == "����") {
//                    result = userWin;
//                }
//                break;
//            case "��":
//                if(cpuInput == "����") {
//                    result = cpuWin;
//                }
//                else if(cpuInput == "����") {
//                    result = userWin;
//                }
//                break;
//            default:
//                result = "�ùٸ� ���� �Է��ϼ���";
//        }
//        return result;
//    }
//}
