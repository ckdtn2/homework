package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하라");
		int jumsu = sc.nextInt();
		if(jumsu >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			
		}
	}

}
