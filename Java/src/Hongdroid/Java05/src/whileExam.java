import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); //숫자나 문자를 입력받는 시스템 import를 눌러야한다.
		
		//While(~~하는동안)문안에 조건이 부합하면 계속 반복
		int i = sc.nextInt(); //하기 콘솔창에 숫자를 적으면 반복문을 테스트 할 수 있다.
		while(i<10) { //i는 10보다 작은동안은 반복문.
			System.out.println(i);
			i++; //여기를 지나가면서 1씩 증가 9에서 반복문 종료.
		}

	}

}
