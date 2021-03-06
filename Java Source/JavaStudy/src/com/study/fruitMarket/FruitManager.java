package com.study.fruitMarket;

import java.util.Scanner;

public class FruitManager {
	String apple = "사과";
	int applePrice = 2000;
	int appleCount;
	
	String pear = "배";
	int pearPrice = 1500;
	int pearCount;
	
	String orange = "오렌지";
	int orangePrice = 1700;
	int orangeCount;
	
	public void selectMenu(int selectMenu) {
		switch(selectMenu) {
		case 1:
			chooseFruit();
			break;
		case 2:
			displayFruit();
			break;
		case 3:
			payFruit();
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	private void payFruit() {
		// TODO Auto-generated method stub
		
	}

	private void displayFruit() {
		showFruit(apple, appleCount);
		showFruit(pear, pearCount);
		showFruit(orange, orangeCount);
	}
	
	private void showFruit(String fruit, int count) {
		System.out.println(fruit + " : " + count + "개");
	}
	
	private void showFruitPrice(String fruit, int price) {
		System.out.println(fruit + " : " + price + "원");
	}

	private void chooseFruit() {
		Scanner selectFruit = new Scanner(System.in);
		
		showFruitPrice(apple, applePrice);
		showFruitPrice(pear, pearPrice);
		showFruitPrice(orange, orangePrice);
		
		String fruit;
		int fruitCount;
		
		while(true) {
			System.out.print("과일 고르기 : ");
			
			fruit = selectFruit.next();
			fruitCount = selectFruit.nextInt();
			
			if(fruitCount < 0) {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			if(fruit.equals(apple)) {
				appleCount += fruitCount;
				break;
			}
			else if(fruit.equals(pear)) {
				pearCount += fruitCount;
				break;
			}
			else if(fruit.equals(orange)) {
				orangeCount += fruitCount;
				break;
			}			
			else
				System.out.println("다시 입력하세요");
		}
		
		selectFruit.close();
	}
}
