package p0429;

import java.util.Scanner;

public class E25 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n1,i;
		System.out.print("몇 개의 *를 표시할까요? : ");
		n1=s.nextInt();
		
		if(n1>0){
			
		for(i=1;i<=n1;i++){
			System.out.print("*");
		}
		System.out.print("\n");
		}
	
		/*System.out.print("안녕");*/
		s.close();
	}

}
