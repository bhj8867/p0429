package p0429;

import java.util.Scanner;

public class E27 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n1,i=0;
		
		System.out.print("몇개의 *를 표현할까요? : ");
		n1=s.nextInt();

		if(n1>=1){
		do{
			System.out.print("*");
			i++;
		}while(i<n1);
		System.out.print("*");
		
		System.out.print("\n");
		System.out.print("안녕");
		}
		s.close();
	}

}
