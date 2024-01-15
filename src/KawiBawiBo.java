import java.util.Scanner;

public class Player {
	private int rsp;
	
	public Player() {
		rsp = (int)(Math.random() * 3 + 1);
	}
	
	public Player(String str) {
		if (str.equals("가위"))
			rsp = 1;
		else if (str.equals("바위"))
			rsp = 2;
		else
			rsp = 3;
	}
	
	public void getResult(Player player) {
		if(this.rsp = player.rsp) {
			System.out.println("비겼습니다.");
			return;
		}
		
		//1.가위 2.바위 3.보
		if(this.rsp == 1 && player.rsp == 2) {
			System.out.println("컴퓨터가 졌습니다.");
		} else if(this.rsp == 1 && player.rsp == 3) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if(this.rsp == 2 && player.rsp == 3) {
			System.out.println("컴퓨터가 졌습니다.");
		} else if(this.rsp == 2 && player.rsp == 1) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if(this.rsp == 3 && player.rsp == 2) {
			System.out.println("컴퓨터가 졌습니다.");
		} else if(this.rsp == 3 && player.rsp == 1) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
	}
}

public class KawiBawiBo {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("가위 바위 보를 입력하세요.");
    	String rsp = sc.next();
    	
    	Player user = new Player(rsp);
    	Player computer = new Player();
    	
    	computer.getResult(user);
    	
    	
    	
    
    
    }
}
	
//    	@SuppressWarnings("resource")
//		Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        String[] choice = {"가위", "바위", "보"}; //choice[0] ="가위", choice[1] ="바위", choice[2] ="보"
//        int[] result = {0, 0, 0};
//        int userChoice, comChoice, results;
//
//        while (true) {
//            System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 선택하세요.(0=종료)");
//            userChoice = scanner.nextInt(); 	//0=가위, 1=바위, 2=보
//            comChoice = random.nextInt(3);     // 0=가위, 1=바위, 2=보
//            
////			System.out.println("userChoice = " + userChoice);	//확인용
//
//            if (userChoice < 1 || userChoice > 3) {
//            	if (userChoice == 0) {
//    	            System.out.println("현재 전적: " + result[0] + "승 " + result[1] + "패 " + result[2] + "무");
//            		break;
//            	}
//            	System.out.println("다시 하세요...");
//            } else {
//            	userChoice = userChoice - 1;
//	            results = (userChoice - comChoice + 3) % 3;
//	            System.out.println("당신은 " + choice[userChoice] + "를 냈습니다.");
//	            System.out.println("컴퓨터는 " + choice[comChoice] + "를 냈습니다.");
//	
//	            if (results == 0) {
//	                System.out.println("비겼습니다.");
//	                result[2]++;
//	            } else if (results == 1) {
//	                System.out.println("당신이 이겼습니다!");
//	                result[0]++;
//	            } else if (results == 2){
//	                System.out.println("컴퓨터가 이겼습니다.");
//	                result[1]++;
//	            }
//	            System.out.println("현재 전적: " + result[0] + "승 " + result[1] + "패 " + result[2] + "무");
//            }
//        }
//        scanner.close();

//	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("가위, 바위, 보 - 하나를 입력 하세요. >> ");
//		int math = sc.nextInt();
//
//		Grade me = new Grade(math, science, english);
//		System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴
//		
//		sc.close();

		
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 1. 유저가 어떤 타입을 낼지 입력받기
//        System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
//        String userInput = br.readLine();
//
//        // 2. 컴퓨터가 낼 타입을 결정하기
//        String[] rspList = new String[]{"가위", "바위", "보"};
//
//        Random random = new Random();
//
//        int randomIndex = random.nextInt(3); //랜덤으로 인덱스를 가져옴
//        String cpuInput = rspList[randomIndex]; //인덱스에 해당하는 값을 출력
//
//        System.out.println(cpuInput);	//컴퓨터
//
//        // 3. 결과를 출력하기
//        String result = getResult(userInput, cpuInput);
//        System.out.println(result);
//	}
//
//	static String getResult(String userInput, String cpuInput) {
//        String userWin = "사용자가 승리하였습니다";
//        String cpuWin = "컴퓨터가 승리하였습니다";
//        String draw = "비겼습니다";
//
//        String result = draw;
//
//        switch (userInput) {
//            case "가위":
//                if(cpuInput == "바위") {
//                    result = cpuWin;
//                }
//                else if(cpuInput == "보") {
//                    result = userWin;
//                }
//                break;
//            case "바위":
//                if(cpuInput == "보") {
//                    result = cpuWin;
//                }
//                else if(cpuInput == "가위") {
//                    result = userWin;
//                }
//                break;
//            case "보":
//                if(cpuInput == "가위") {
//                    result = cpuWin;
//                }
//                else if(cpuInput == "바위") {
//                    result = userWin;
//                }
//                break;
//            default:
//                result = "올바른 값을 입력하세요";
//        }
//        return result;
//    }
//}
