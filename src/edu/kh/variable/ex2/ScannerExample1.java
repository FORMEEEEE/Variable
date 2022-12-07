package edu.kh.variable.ex2;
						//패키지 바로 아래에 import
import java.util.Scanner; //자바 유틸에 있는 스캐너 기능을 가져옴

public class ScannerExample1 {

	public static void main(String[] args) {
		// import == 가져오다	
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역활
		// '콘솔창에 숫자 치면 됨'
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만든 것
		Scanner sc = new Scanner(System.in);
		// import를 안해와서
		// Scanner를 만들어서 쓰고싶은데 설계도가 없음
		// import 해오라는 에러 발생 ==> import 해오면 오류 해결
		//System.out.print("값을 입력하시오: ");
		//int input1 = sc.nextInt();
		// 입력 받은 정수를 input1에 대입
		// nextint() : 다음 입력된 정수를 일어옴(키보드로 입력된 정수를 읽어옴)
		//System.out.println(input1);
		
		//System.out.print("실수만 입력");
		//double input2 = sc.nextDouble();
		//System.out.println(input2);
		
		// 안녕? 반가워! 밥먹을래?
		System.out.print("입력1: ");
		String input3 = sc.next(); //sc.nextLine(); : 글자 전부를 읽어옴
		// next() : 다음 입력된 한 단어를 읽어옴(한 글자아님)
		System.out.println(input3);
		
		System.out.print("입력2: ");
		String input4 = sc.next(); //string input4 = input3 + sc.next();
		System.out.println(input4);//(input3 + input4)
		
		
		
		
	}

}
