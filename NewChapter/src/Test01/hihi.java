package Test01;
import java.util.Scanner;

public class hihi {
	
		public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	// 수 정 쓰 
	int b =0;
	int money =0;
	int temp=1;
	int studentNum = 0;
int arr[]=new int[studentNum];
int score[] = new int[studentNum];
int arr1[]=new int[studentNum];
	
	boolean run=true;
	
	while(run) {
			// 1. 예금 2. 출금  3. 잔고  4.종료
			System.out.println("--------------------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택>");
			int input=sc.nextInt();
			
			
			switch(input) {
			case 1:
				System.out.println("학생수 :");
//				for(int i=0;i<arr.length;i++) {
				
				studentNum=sc.nextInt();
				
//				studentNum++;
//			
			break;
			
			case 2:
				
				// 위에 들갔나 확인.
				arr1 =new int[studentNum];
				for(int i=0;i<arr1.length;i++) {
//					System.out.println((arr[i]+1)+"");
					
				System.out.println((i+1) +"번 째 학생점수 : "); // arr[0]이 없어
				arr1[i]=sc.nextInt();
				
			
//				System.out.println(arr.length);
			}break;
			
			
			case 3:
//				 
				System.out.println("점수리스트");
//				
				for(int i=0;i<arr1.length;i++) {
				System.out.println(arr1[i]);
//				
				}
				break;
			
			case 4:
				System.out.println("종료...");
				return ;
			
			default :
				System.out.println("범위 ㄴㄴ다시 선택");
			}
			
			
			
			
			}
		}

	}
