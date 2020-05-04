package p0429;

import java.util.Scanner;

public class E23 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n1,n2;
		System.out.print("정수 a : ");
		n1=s.nextInt();
		System.out.print("정수 b : ");
		n2=s.nextInt();
		
		if(n1==n2){
			System.out.print("두 수는 같습니다.");
		}
		else if(n1<n2){
			System.out.printf("작은 값은 %d입니다.",n1);
			System.out.printf("큰 값은 %d입니다.",n2);
		}
		else if(n2<n1){
			System.out.printf("작은 값은 %d입니다.\n",n2);
			System.out.printf("큰 값은 %d입니다.",n1);
		}
	
		s.close();
		
	}

}
