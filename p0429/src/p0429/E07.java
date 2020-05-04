package p0429;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		float x,y;
			System.out.print("x값 : ");
			x=s.nextFloat();
			System.out.print("y값 : ");
			y=s.nextFloat();
		
		float sum=x+y;
			System.out.printf("합계는 %.2f\n",sum);
			System.out.printf("평균은 %.3f\n",sum/2);

		s.close();
	}

}
