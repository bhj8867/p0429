package p0429;
import java.util.Scanner;
public class E08 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float n1,n2;
		System.out.println("삼각현의 넓이를 구합니다.");
		System.out.print("밑면 : ");
		n1=s.nextFloat();
		
		System.out.print("높이 : ");
		n2=s.nextFloat();
		
		System.out.printf("넓이는 %.3f입니다.",n1*n2/2);
		s.close();
	
	}

}
