package test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("가로는?");
		int A=sc.nextInt();
		System.out.println("세로는?");
		int B=sc.nextInt();
		System.out.println("높이는?");
		int C=sc.nextInt();
		
		System.out.println("직사각형의 부피는 " + A*B*C+"입니다.");
	}

}
