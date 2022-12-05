
public class intExam {

	public static void main(String[] args) {
		
		//상수는 변경이 안되는 값으로, 대문자로 선언하는것이 관례
		//3.14 ,
		final int J;
		J = 10;
		
		//작은 타입에서 큰타입으로 변경 할 때에는 성공
		int x = 50000;
		long y = x;
		
		//큰타입에서 작은타입으로 할때는 강제형변환을 해야한다.
		long x2 = 5;
		int y2 = (int) x2;
		
		//!=는 다르다
	}

}
