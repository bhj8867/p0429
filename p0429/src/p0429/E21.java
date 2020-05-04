package p0429;

import java.util.Scanner;

public class E21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1,n2;
		System.out.print("정수 a : ");
		n1=s.nextInt();
		
		System.out.print("정수 b : ");
		n2=s.nextInt();
		
		if(n1<0 || n2<0){
			System.out.print("양의 값을 입력하시오");
		}
		else if(n1>=n2 ){
			System.out.printf("두 값의 차는 %d입니다.",n1-n2);
		}
		else if(n2>=n1){	
			System.out.printf("두 값의 차는 %d입니다.",n2-n1);
		}
		
		s.close();
	
	}

}
