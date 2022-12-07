package edu.kh.variable.ex2;

import java.util.Scanner; //자바 유틸에서 스캐너 기능을 가져옴

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// (system.in) : 명령어인데 스캐너 생성된데에다가 기능을 집어넣음
		
		System.out.print("말해 : ");           
		String talk = sc.nextLine();
		System.out.println(talk);
		
		System.out.print("말해: ");
		String talk2 = sc.nextLine();
		System.out.println(talk + talk2);
		
		
		
		
		
		
		
		
		
		
	}
}
