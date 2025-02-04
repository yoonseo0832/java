package com.kh.practice.array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;;
public class ArrayPractice {
 
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
		//practice9();
		//practice10();
		//practice11();
		//practice12();
		//practice13();
		//practice14();
		//practice15();
		practice16();
	}
	public static void practice16() {
		Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[n]; 

        for (int i = 0; i < n; i++) {
            System.out.printf("%d번째 문자열 : ", i + 1);
            arr[i] = sc.nextLine();
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            String answer = sc.next().trim().toLowerCase();
            sc.nextLine(); 

            if (answer.equals("n")) {
                break;
            } else if (answer.equals("y")) {
                System.out.print("더 입력하고 싶은 개수 : ");
                int addCount = sc.nextInt();
                sc.nextLine();

                String[] newArr = new String[arr.length + addCount];

                System.arraycopy(arr, 0, newArr, 0, arr.length);

                for (int i = arr.length; i < newArr.length; i++) {
                    System.out.printf("%d번째 문자열 : ", i + 1);
                    newArr[i] = sc.nextLine();
                }

                arr = newArr;
            } else {
                System.out.println("잘못된 입력입니다. 'Y' 또는 'N'을 입력하세요.");
            }
        }

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
	}
	public static void practice15(){
		Scanner sc = new Scanner(System.in);
        System.out.print("문자열: ");
        String str = sc.next(); 

        // 문자열 길이 => 문자열.length , 특정 위치의 문자 추출 => 문자열.charAt(인덱스)
        
        // 문자형 배열 선언 및 할당
        int strLen = str.length();
        char[] chArr = new char[str.length()];
        int idx = 0; // 배열에서 사용할 인덱스;
        
        System.out.print("문자열에 있는 문자: ");
        for(int i=0; i<str.length(); i++) {
        	// 중복된 문자가 있는지 체크
        	boolean isDup = false;
        	for(int j=0; j<i; j++) {
        		// 문자열의 i번째 위치의 문자와, 배열의 j번째 위치의 문자와 비교
        		if(str.charAt(i) == chArr[j]) {
        			isDup = true;
        			break;
        		}
        	}
        	//if(isDup == false) {
        	if(!isDup) {	//위의 코드와 동일함
        		chArr[idx++] = str.charAt(i);
        		//idx++; 위의 후위 연산자 특징으로 한줄 작성 가능
        	}
        }
        
        //출력
        for(int i=0; i<idx; i++) {
        	System.out.print(chArr[i]);
        	if(i<idx-1) {
        		System.out.print(", ");
        	}
        }
        System.out.println("\n문자 개수: "+ idx);
	}
	public static void practice14() {
		int[] lotto = new int[6]; 
		// lotto => 참조변수, 값 자체가 저장된 것 실제 데이터 저장된 위치(주소값)을 가지고 있음
		
		// 랜덤값 대입
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			// 자동 형변환은 작은 것에서 큰것 int->double 가능,반대는 강제형변환
			
			// 중복 제거 => 현재 위치 (i) 기준으로 이전 위치까지의 데이터와 비교
			for(int j =0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					// 중복되는 값이 있는 경우
					i--;
					break;
				}
			}
		}
		
		// 배열을 오름차순으로 정렬 Array.sort(배열명)
		// => import java.util.Arrays; 필요
		Arrays.sort(lotto);
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	public static void practice13(){
		int[] num = new int[10]; 
		Random random = new Random();

		for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10) + 1; 
        }
		System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
	}
	public static void practice12(){
		int[] num = new int[10]; 
		Random random = new Random();

		for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10) + 1; 
        }
		System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
		int max = num[0]; 
        int min = num[0]; 

		for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("\n최대값: " + max);
        System.out.println("최소값: " + min);
	}
	public static void practice11(){
		int[] num = new int[10]; 
		Random random = new Random();

		for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10) + 1; 
        }
		System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
	}
	public static void practice10(){
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함): ");
		String idNum = sc.next();

		int dash = idNum.indexOf('-');

        String birth = idNum.substring(0, dash);
        String personal = idNum.substring(dash + 1);

		String personalId = personal.charAt(0) + "******";
		System.out.println(birth + "-" + personalId);
	}
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chicken = new String[] {"양념", "후라이드", "파닭", "뿌링클", "자메이카"};
		System.out.print("치킨 이름을 입력하세요: ");
		String order = sc.next();

		boolean found = false;
		for(int i=0; i<chicken.length; i++) {
			if (order.equals(chicken[i])) {
                System.out.println(order + "치킨 배달 가능");
                found = true;
                break;
            }
		}
		if (!found) {
            System.out.println(order + "치킨은 없는 메뉴입니다.");
        }

	}
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("정수: ");
			num = sc.nextInt();
			
			if(num%2!=0 && num>=3) {
				break;
			}
			System.out.println("다시 입력하세요.");
			
		}
		int[] arr = new int[num];
		int mid = num/2;
		for(int i=0; i< arr.length; i++) {
			arr[i] = i <= mid ? i+1 : num-i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		/*
		 for(int i=0; i<=mid; i++) {
			arr[i] = i + 1; // 0~중간
		}
		for(int i = mid + 1; i < n; i++) {
            arr[i] = arr[i - 1] - 1;   // 중간 다음부터 ~0까지
        }
		 */

	}
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int n = sc.nextInt();
		int[] str = new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			str[i] = sc.nextInt();
		}
		for(int i=0;i<n; i++ ) {
			System.out.print(str[i]+ " ");
		}
		System.out.println();
		int sum = 0;
		for(int i=0;i<str.length; i++ ) {
			sum+=str[i];
		}
		System.out.print("총합: "+ sum);
	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] day = new String[] {"월", "화", "수", "목", "금", "토", "일"};
		System.out.print("0 ~ 6 사이 숫자 입력: ");
		int num = sc.nextInt();
		if (num >= 0 && num <= 6) {
            System.out.printf("%s요일", day[num]);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String str = sc.next();
		
		System.out.print("문자: ");
		char ch = sc.next().charAt(0);
		int len = str.length();
		char[] chArr = new char[len];
		// 입력받은 문자열 배열에 저장
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		int count = 0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스): ",str, ch);
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i]==ch) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.printf("%c 개수: %d", ch, count);
	}
	public static void practice4() {
		String[] arr = new String[]{"사과", "귤", "포도", "복숭아", "참외"};
		// 초기화할 때 배열의 길이를 지정하지 않음
		System.out.print(arr[1]);
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 :");
		int n = sc.nextInt();
		int[] n1 = new int[n];
		
		for(int i=0; i<n; i++) {
			n1[i]=i+1;
			System.out.print(n1[i] +" ");
		}
	}
	public static void practice2() {
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = num.length-i;//10-i;
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] +" ");
		}
	}
	//출력 결과: 10 9 8 7 6 5 4 3 2 1
	public static void practice1() {
		int[] num = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i]=i+1;
			System.out.print(num[i] +" ");
		}
	}
	//출력 결과: 1 2 3 4 5 6 7 8 9 10 
}
