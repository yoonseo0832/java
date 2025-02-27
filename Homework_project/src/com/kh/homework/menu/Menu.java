package com.kh.homework.menu;

import java.util.List;
import java.util.Scanner;
import com.kh.homework.model.vo.MenuModel;

public class Menu {
	private Scanner sc = new Scanner(System.in);
    MenuModel mm =new MenuModel();

    public int FirstMenuChoice() {
        System.out.println("======KH카페입니다!=======");
    	System.out.println("음료를 주문하시겠습니까? 손님!");
        System.out.println("1. 주문하기");
        System.out.println("2. 취소하기");
        System.out.println("=========================");
        System.out.print("번호를 선택해주세요: ");
        int menu = sc.nextInt();
        sc.nextLine(); 
        return menu;
    }

    public void categories(List<String> categories) {
        System.out.println("\n======= 카테고리 ======");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println("    "+(i+1)+". "+categories.get(i));
        }
        System.out.println("==================");
    }

    public int categoryChoice() {
        System.out.print("카테고리를 선택하세요: ");
        int choice = sc.nextInt() - 1;
        sc.nextLine(); 
        return choice;
    }

    public void menuItems(String category, List<String> items) {
        System.out.println("\n=== " + category + " 메뉴 ===");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1)+". "+items.get(i)); // i가 0이라서 +1을 해야함
        }
        System.out.println("==================");
    }

    public int getMenuChoice() {
        System.out.print("메뉴를 선택하세요: ");
        int choice = sc.nextInt() - 1;
        sc.nextLine(); 
        return choice;
    }

    public boolean shot() {
    	System.out.print("샷 추가를 원하시나요? (y/n): ");
        char shotAdd = sc.nextLine().charAt(0);
        return shotAdd == 'y' || shotAdd == 'Y';
    }

    public String iceOrNot() {
        System.out.print("아이스/핫을 선택하세요 (ice/hot): ");
        return sc.nextLine();
    }
    // 주문 내역
    public void orderCheck(String item, boolean shot, String iceOrNot, int price) {
        System.out.println("\n== 주문 내역 ==");
        
        if (shot) {
            System.out.println("샷 추가: +500원");
            System.out.println("메뉴: " + item + ", 가격: "+(price-500));// 샷추가했지만 가격은 추가전 가격으로 출력되게
        }else{
            System.out.println("메뉴: " + item + ", 가격: "+price); // 가격 그대로
        }
        if (!iceOrNot.isEmpty()) {
            System.out.println("아이스/핫: " + (iceOrNot.equalsIgnoreCase("ice") ? "아이스" : "핫"));
        }
        System.out.println("==================");
    }
    
    public void orderCheck(String item, int price) {
    	System.out.println(item + "  " + price + "원");
    }

    public void orderDoneMsg(String item, int makingTime) {
        System.out.println("주문하신 " + item + " 나왔습니다. [ " + makingTime + "초 걸렸습니다. ]");

    }

    public boolean askMoreFood() {
        System.out.print("다른 메뉴를 더 주문하시겠습니까? (y/n): ");
        String yesorno = sc.nextLine().toLowerCase();
        return yesorno.equals("y");
    }
}
