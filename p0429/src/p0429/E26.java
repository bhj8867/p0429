package p0429;

import java.util.Scanner;

public class E26 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n1;
		System.out.print("몇개의 *를 입력할까요?");
		n1=s.nextInt();
		
		if(n1>=1){//n1이 1이상일때만 줄바꿈을 한다		

		int i=1;
		while(i<=n1){
			System.out.print("*");
		i++;
		}
		System.out.print("\n");
		
		}
		System.out.print("안녕");
		s.close();
	}

}
