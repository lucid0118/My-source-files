import java.util.Scanner;

public class FruitMarketLauncher {
	FruitManager fruitManager;
	Scanner scan = new Scanner(System.in);
	
	public FruitMarketLauncher() {
		fruitManager = new FruitManager();
		Menu();
	}
	
	public void Menu(){
		while(true) {
			System.out.println("메뉴 입력");
			System.out.println("1. 과일 선택하기");
			System.out.println("2. 선택한 과일 보기");
			System.out.println("3. 과일 결제보기");
			System.out.println("입력하세요 : ");
		
			int selectMenu;
			selectMenu= scan.nextInt();
		
			fruitManager.selectMenu(selectMenu);
			
			if(selectMenu == 3)
				break;
		}
	}

}
