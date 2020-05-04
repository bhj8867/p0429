package p0429;

import java.util.Scanner;

public class E12 {//절대값(Math.abs(-33));

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n1;
		System.out.print("정숫값 : ");
		n1=s.nextInt();
		if (n1<0){
		System.out.printf("절대값은 %d입니다.",-n1);
		}
		
		else{
		System.out.printf("절대값은 %d입니다.",n1);
		}
		
		s.close();

	}

}
