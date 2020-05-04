package p0429;

import java.util.Scanner;

public class E17 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n1;
		System.out.print("정숫값 : ");
		n1=s.nextInt();
		
		
		if(n1<0){
			System.out.print("음의 정숫값을 입력했습니다.");
		}
		else if(n1%10==0){
			System.out.print("이 값은 10의 배수입니다.");
		}
		
		else if(n1%10!=0){
			System.out.print("이 값은 10의 배수가 아닙니다.");
		}
		
		s.close();

	}

}
