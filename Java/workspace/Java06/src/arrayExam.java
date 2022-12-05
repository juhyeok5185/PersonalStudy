
public class arrayExam {

	public static void main(String[] args) {
		//배열은 집합이라고 생각하면 편하다.
		String a = "a";
		int b = 1;
		
		int arrayInt[] = new int[10]; // 이 가로안에 0 ~ 9 까지의 숫자를 담고있다.
		for (int i = 0; i<arrayInt.length; i++) { //10번의 포문을 돌려
		System.out.println(i);
		}
		
		int arrayInt2[] = {1,3,5,7,9};
		for (int i = 0; i<arrayInt2.length; i++) { //5번의 포문을 돌려
		System.out.println(i);
		}
		
		int arrayInt3[] = {1,3,5,7,9};
		for(int i = 0; i<arrayInt2.length; i++) {
			System.out.println(arrayInt3[3]); // 배열상 4번째 자료를 가져와라(0이 있기때문 4번째)
			System.out.println(arrayInt3[i]); // i가 올라갈수록 해당 숫자의 자리의 배열을 가져와라
		}
		String arrayStr[]= {"a","b","c","d"};
		for(int i = 0; i<arrayStr.length; i++) {
			System.out.println(arrayStr[3]); // 배열상 4번째 자료를 가져와라(0이 있기때문 4번째)
			System.out.println(arrayStr[i]); // i가 올라갈수록 해당 숫자의 자리의 배열을 가져와라
		}
		}
	}


