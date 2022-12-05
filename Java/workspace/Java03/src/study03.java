
public class study03 {
//main 함수는 실행하는 함수 
	public static void main(String[] args) {

	String Danny = "잘생겼다";
	int a = 1;

	if(Danny == "못생겼다.") {
		System.out.println("정답입니다.");
	} 
	else { //if문에서 제외된 모든 상황을 가져옴 
		System.out.println("아닙니다 잘생겼습니다.");
	}
	
	if (a==0) {
		System.out.println("0입니다.");
	}
	else if (a==1) {
		System.out.println("1입니다.");
	}
	
	// and연산자 & , or연산자 ||
	if (a==0 && a==1) { //and 연산자는 모든 조건을 만족해야 실행이 가능하다.
		System.out.println("Test");
	}
	
	if (a==1 || a==1) { //or 연산자는 둘중에 한개라도 맞으면 실행한다.
		System.out.println("Test2");
	}
	
	}

}
