
public class switchExam {

	public static void main(String[] args) {
		int value = 2;
		
		switch(value) { 
		case 1: 
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default : //else와 똑같은 역할을 한다.
			System.out.println("그외 다른 숫자");	
		}
		
		String str = "a";
		switch(str) {
		case "a" :
			System.out.println("a");
			break;
		case "b" :
			System.out.println("b");
			break;
		case "c" :
			System.out.println("c");
			break;
		default :
			System.out.println("그외 다른 것");
		}
		
	}

}
