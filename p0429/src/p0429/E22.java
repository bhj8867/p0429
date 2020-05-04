package p0429;

import java.util.Scanner;

public class E22 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("정수 a : ");
		n1=s.nextInt();
		System.out.print("정수 b : ");
		n2=s.nextInt();
		System.out.print("정수 c : ");
		n3=s.nextInt();
		
		if(n1<n2 || n1<n3){
			System.out.printf("최솟값은 %d입니다.",n1);
		}
		else if(n2<n1 || n2<n3){
			System.out.printf("최솟값은 %d입니다.",n2);
		}
		else if(n3<n1 || n3<n1){
			System.out.printf("최솟값은 %d입니다.",n3);
		}
		s.close();
	}

}
