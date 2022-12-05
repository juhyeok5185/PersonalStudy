
public class Data {

	public static void main(String[] args) {
	
		char var1 = 'X'; //char는 ''로 오직 한글자만 가능하다.
		String var2 = "d"; //String은 ""로 여러글자가 가능 대부분 이걸사
		
		byte var3 = 126; //-128 ~ 127까지 숫자가 가능하다.
		short var4 = -32768; //-32768 ~ 32767까지 숫자가 가능하다.
		int var5 = 210000000; //-21억 ~ 21억까지 숫자가 가능하다.
		long var6 =22999993; // 여러숫자의 입력가

		float var7 = 0.5f; //float는 소숫점 선언후 f를 붙여줘야한다.
		double var8 = 0.00005; //더 많은 소수점을 선언 할수있다.
		
		boolean isStart = false; // true or flase 를 입력하여 조건식에서 많이 사용한다.
		
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);
	System.out.println(var4);
	System.out.println(var5);
	System.out.println(var6);
	System.out.println(var7);
	System.out.println(var8);
	System.out.println(isStart);
	}

}
