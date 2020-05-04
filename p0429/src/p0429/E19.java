package p0429;

import java.util.Scanner;

public class E19 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n1;
		System.out.print("점수 : ");
		n1=s.nextInt();
		
		if(n1>100){
		System.out.print("잘못된 점수입니다. ");	
		}
		else{
		switch(n1/10){
		case(10):
		case(9):
		case(8): System.out.print("수");
		break;
		case(7):System.out.print("우");
		break;
		case(6): System.out.print("미");
		break;
		case(5): System.out.print("양");
		break;
		case(4):
		case(3):
		case(2):
		case(1):
		case(0): System.out.print("가");
		break;
		default: System.out.print("잘못된 점수입니다. ");
			
			}
		}
		
		s.close();
	}

}
