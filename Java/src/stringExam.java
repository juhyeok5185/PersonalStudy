
public class stringExam {

	public static void main(String[] args) {

		String str1 = "hello"; //상수
		String str2 = "hello";
		String str3 = new String ("hello");
		String str4 = new String ("hello");
		
		if (str1 == str2) {
			System.out.println("1,2 같습니다");
		}
		
		if (str1 == str3) {
			System.out.println("1,3 같습니다");
		}
		if (str3 == str4) {
			System.out.println("3,4 같습니다");
		}
		
		System.out.println(str1.substring(3)); //3번째부터 출력

	}

}
