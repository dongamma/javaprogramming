import java.util.Scanner;

public class 과제2주차 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>>");
		int fst = scanner.nextInt();
		String oper = scanner.next();
		int sec = scanner.nextInt();
		int res = 0;
		
		if (oper.equals("+")) {
			res = fst + sec;
		}
		else if (oper.equals("-")) {
			res = fst - sec;
		}
		else if (oper.equals("*")) {
			res = fst * sec;
		}
		else if (oper.equals("/")) {
			if (sec == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			res = fst / sec;
		}
		else {
			return;
		}
		System.out.println(fst + oper + sec + "의 계산 결과는 " + res);
			

	}

}
