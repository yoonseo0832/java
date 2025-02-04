package com.kh.practice.dimension;
import java.util.Random;
import java.util.Scanner;
public class DimensionPractice {

	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice4_1();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
		practice9();
	}
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
			String[] name ={"강건강","남나나","도대담","류라라","문미미","박보배",
							"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
			
			String[][] group1 = new String[3][2];
			String[][] group2 = new String[3][2];
			
			int idx =0;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<2; j++) {
					group1[i][j] = name[idx++];
				}
			}
			for(int i=0; i<3; i++) {
				for(int j=0; j<2; j++) {
					group2[i][j] = name[idx++];
				}
			}
			
			System.out.println("== 1분단 ==");
			for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(group1[i][j] + "  ");
	            }
	            System.out.println();
	        }
			System.out.println("== 2분단 ==");
			for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(group2[i][j] + "  ");
	            }
	            System.out.println();
	        }
			System.out.println("============================");
			System.out.print("검색할 학생의 이름을 입력하세요: ");
			String findName = sc.next();
			for(int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.printf("검색하신 %s 학생은 %d분단 %c번째 줄 %s 쪽에 있습니다.", findName);
	            }
			}
	
	}
	public static void practice8() {
		String[] name ={"강건강","남나나","도대담","류라라","문미미","박보배",
						"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
		
		int idx =0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				group1[i][j] = name[idx++];
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				group2[i][j] = name[idx++];
			}
		}
		
		System.out.println("== 1분단 ==");
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(group1[i][j] + "  ");
            }
            System.out.println();
        }
		System.out.println("== 2분단 ==");
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(group2[i][j] + "  ");
            }
            System.out.println();
        }
	}
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
			System.out.print("행 크기: ");
			int row = sc.nextInt();
			
			char[][] alpa = new char[row][];
			
			for(int i =0; i<row; i++) {
					System.out.print(i+"행의 열 크기: ");
					int column = sc.nextInt();
					alpa[i] = new char[column]; 
			}
			char letter = 'a';
			
			for(int i =0; i<row; i++) {
				for(int j=0; j<alpa[i].length; j++) {
					alpa[i][j] = letter++; 
				}
			}
			for(int i =0; i<row; i++) {
				for(int j=0; j<alpa[i].length; j++) {
					System.out.print(alpa[i][j]+" ");
				}
				System.out.println();
			}
	}
	public static void practice6() {
		String[][] strArr = new String[][] {	{"이", "까", "왔", "앞", "힘"}, 
												{"차", "지", "습", "으", "냅"}, 
												{"원","열", "니", "로", "시"}, 
												{"배", "심", "다", "좀", "다"}, 
												{"열", "히", "! ", "더", "!! "}
											};
       for(int i=0; i<strArr.length; i++) {
    	   for(int j=0; j<strArr[i].length; j++) {
    		   System.out.print(strArr[j][i]+" ");
    	   }
    	   System.out.println();
       }
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("행 크기: ");
			int row = sc.nextInt();
			System.out.print("열 크기: ");
			int column = sc.nextInt();
			char[][] alpa = new char[row][column];
			
			if(row>10||column >10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}else {
				for(int i =0; i<alpa.length; i++) {
					for(int j=0; j<alpa[i].length; j++) {
						alpa[i][j] = (char)((int)(Math.random()*26)+65); 
						//alpa[i][j] = (char)((int)(Math.random()*26)+65); 
						System.out.print(alpa[i][j]+" ");
					}
					System.out.println();
				}
				break;
			}
		}
	}
	public static void practice4_1(){
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				int lastRow = arr.length -1; //3
				int lastCol = arr[i].length -1; //3
				
				if(i<lastRow && j<lastCol) {
					// 0,0 ~ 2,2 위치에 램덤값을 저장
					arr[i][j] = (int)(Math.random()*10+1);
				}
				// 행의 위치가 마지막 행이 아닌 경우 
				// 현재 값을 더해서 마지막 행에 저장 
				if(i<lastRow) {
					arr[lastRow][j] += arr[i][j];
				}
				
				// 마지막 열의 위치에 현재값 저장
				if(j<lastCol) {
					arr[i][lastCol] += arr[i][j];
				}
			}
		}
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void practice4() {
		int[][] str = new int[4][4];
		
		for(int i =0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				str[i][j] =(int)(Math.random()*10+1);
			}
		}
		//가로 + 
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				str[i][3] = str[i][0]+ str[i][1]+str[i][2];
			}
		}
		//세로 +
		for(int j=0; j<str.length; j++) {
			for(int i=0; i<str[j].length; i++) {
				str[3][j] = str[0][j]+ str[1][j]+str[2][j];
			}
		}
		for(int i =0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				System.out.printf("%2d ", str[i][j]);
			}
			System.out.println();
		}
	}
	public static void practice3() {
		int[][] num = new int[4][4];
		int idx = 16;
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] =idx--;
			}
		}
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
	}
	public static void practice2() {
		int[][] num = new int[4][4];
		int idx = 1;
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] =idx++;
			}
		}
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
	}
	public static void practice1() {
		String[][] str= new String[3][3];

		for(int i =0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				str[i][j] = "("+i+", "+ j+ ")";
			}
		}
		for(int i =0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
	}
}
