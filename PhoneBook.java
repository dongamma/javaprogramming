import java.util.Scanner;

class Phone {
	String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}


public class PhoneBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
        int size = scanner.nextInt();
        Phone [] phone = new Phone[size];
		
		for(int i=0; i<phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		scanner.nextLine();
		
		while(true) {
			System.out.print("검색할 이름>>");
			String search = scanner.nextLine();
			if (search.equals("그만")) {
				break;
			}
			
			boolean found = false;
			for (int i =0; i<phone.length; i++) {
				if(search.equals(phone[i].name)) {
					System.out.println(phone[i].name + "의 번호는 " + phone[i].tel + "입니다.");
					found = true;
		            break;
				}
			}
			if (!found) {
                System.out.println(search + "이 없습니다.");
            }
		}
		 scanner.close();
	}
	
}

