package step1_05.controlStatement;

/*
 * 
 *  # 조건문 if 
 * 
 *  조건식이 true이면 실행되는 구문 ( false면 실행 x )
 *  
 *  [ 형식 ]
 *  
 *  if (조건식) {
 *  
 *  	조건식이 true일때 실행할 명령어;
 *  
 *  }
 * 
 * 
 * */

public class IfEx01 {

	public static void main(String[] args) {

		if (true) {
			System.out.println("실행 O"); // if안에 종속된 명령어는 tab으로 들여쓰기 한다.
		}
		
		if (false) {
			System.out.println("실행 X");
		}
		
		int number = 7;
		
		if (number % 2 == 0) {
			System.out.println("짝수");
		}
		
		if (number % 2 == 1) {
			System.out.println("홀수");
		}
		
		// if문 안의 명령어가 1줄이면 {}를 생략할 수 있다.
		if (number % 2 == 0)	System.out.println("짝수");
		if (number % 2 == 1)	System.out.println("홀수");
		
		
	}

}
