package p0429;

import java.util.Scanner;

public class E30 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=146542,n1;//i에는 어떤 값을 주어도 상관없다 뒤 에서 다시 값을 지정하니까
		System.out.print("카운트다운 합니다.");
		System.out.print("양의 정숫값 : ");
		n1=s.nextInt();
		
		for(i=n1;i>=0;i--){
			System.out.printf("%d\n",i);
		}
		
		s.close();
	}

}
