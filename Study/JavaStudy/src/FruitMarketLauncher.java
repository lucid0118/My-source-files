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
			System.out.println("�޴� �Է�");
			System.out.println("1. ���� �����ϱ�");
			System.out.println("2. ������ ���� ����");
			System.out.println("3. ���� ��������");
			System.out.println("�Է��ϼ��� : ");
		
			int selectMenu;
			selectMenu= scan.nextInt();
		
			fruitManager.selectMenu(selectMenu);
			
			if(selectMenu == 3)
				break;
		}
	}

}