package p0429;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		float n1,n2;
		System.out.print("실수 a : ");
		n1=s.nextFloat();
		System.out.print("실수 b : ");
		n2=s.nextFloat();
		
		if(n1>n2){
		System.out.printf("큰 쪽의 값은 %.1f입니다.",n1);
		}
		else if(n2>n1){
			System.out.printf("큰 쪽의 값은 %.1f입니다.",n2);
			}
		else{
		System.out.println("두 수는 같습니다.");
		}
		s.close();
	}

}
