package com.kh.homework.controller;

import java.util.List;
import java.util.ArrayList;
import com.kh.homework.menu.Menu;
import com.kh.homework.model.vo.MenuModel;
import java.util.Scanner;

public class Controller {
	 private Menu vm = new Menu();
	    private MenuModel mm = new MenuModel();

	    Scanner sc = new Scanner(System.in);
	    private int totalPrice = 0; 
	    private List<String> orderedList = new ArrayList<>();

	    public void CafeOrder() {
	        int choice = vm.FirstMenuChoice();
	        
	            switch (choice) {
	                case 1:
	                    processOrder();
	                    break;
	                case 2:
	                    System.out.println("주문이 취소되었습니다. 안녕히가십시오.");
	                    return;
	                default:
	                    System.out.println("잘못된 번호입니다.");
	            }
	        sc.close();
	    }

	    private void processOrder() {
	        boolean orderMore = true;
	        while (orderMore) {
	            vm.categories(mm.getCategories());
	            int cc = vm.categoryChoice();

	            if (cc > 0 || cc < mm.getCategories().size()) {
	                
	            }

	            String selectedCategory = mm.getCategories().get(cc);
	            List<String> menuItems = mm.getMenuItems(cc);
	           
	            vm.menuItems(selectedCategory, menuItems);

	            int menuChoice = vm.getMenuChoice();
	            if (menuChoice < 0 || menuChoice >= menuItems.size()) {
	                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
	                continue;
	            }

	            String selectedItem = menuItems.get(menuChoice);
	            int itemPrice = mm.getPrice(cc, menuChoice);

	            boolean shot = false;
	            String iceorhot = "";

	            if (mm.customize(cc)) {
	                shot = vm.shot();
	                iceorhot = vm.iceOrNot();
	            } else if (cc == 2 || cc == 3) { // 에이드랑 스무디는 아이스만 가능 // 핫 선택 불가
	                iceorhot = "ice";
	            }

	            if (shot) { // 샷 추가 시 500원 추가 
	                itemPrice += 500;
	            }

	            totalPrice += itemPrice; // 총 가격
	            
	            orderedList.add(selectedItem + " " + itemPrice + "원");

	            vm.orderCheck(selectedItem, shot, iceorhot, itemPrice);
	            
	            System.out.println("\n== 현재까지의 주문 내역 ==");
	            for (String order : orderedList) {
	                System.out.println(order);
	            }
	            System.out.println("현재까지 총 결제 금액: " + totalPrice + "원\n");

	            int makingTime = 0;
	            switch (cc) {
	                // 메뉴 나오는 시간
	                case 0: makingTime = 5; break; // 5초
	                case 1: makingTime = 8; break; // 8초
	                case 2: makingTime = 7; break; // 7초
	                case 3: makingTime = 7; break; // 7초
	                case 4: makingTime = 1; break; // 1초
	            }

	            try {
	                Thread.sleep(makingTime * 1000); // 시간을 1초* 만드는 시간을 곱해서 시간을 버는중 => 만드는 시간 생각해서
	            } catch (InterruptedException e) { 
	                e.printStackTrace();
	            }

	            vm.orderDoneMsg(selectedItem, makingTime);
	            orderMore = vm.askMoreFood();
	        }
	        
	        System.out.println("총 "+totalPrice+"원 나왔습니다. 손님 감사합니다, 안녕히가세요!"); 
	    }
}
//카드 결제 현금 결제 메뉴 만들려다 못했고, 주문을 하면 주문번호를 배부해서 실제처럼 하고 싶었으나 구현 실패
