package p0429;

import java.util.Scanner;

public class E31 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n1,sum=0,i=1;
		
		System.out.print("1부터 n까지의 합을 구합니다. n의 값 : ");
		n1=s.nextInt();
		do{
		sum=sum+i;	
		i++;	
		}while(i<=n1);
		System.out.printf("1부터 %d까지의 합은 %d입니다",n1,sum);
		
		s.close();
	}

}
