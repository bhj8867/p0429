package p0429;

import java.util.Scanner;

public class E28 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		int n1;
		
		do{
			System.out.print("세자리 정숫값  : ");
			n1=s.nextInt();
		}
		while(n1<100||n1>=1000);
		//세자리가 안되는 조건을 넣어야 do문이 끝이 난다
		
		System.out.printf("입력한 값은 %d입니다.",n1);
			
		s.close();

	}

}
