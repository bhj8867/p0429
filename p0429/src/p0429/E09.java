package p0429;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a1,a2;
		System.out.print("성 : ");
		a1=s.next();
		System.out.print("이름 : ");
		a2=s.next();
		System.out.printf("안녕하세요. %s%s씨.",a1,a2);
		s.close();
	}

}
