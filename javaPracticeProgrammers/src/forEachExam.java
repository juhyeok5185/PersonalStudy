
public class forEachExam {

	public static void main(String[] args) {

		int[] iarr = {10,20,30,40,50};
		
		for(int i=0; i<iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		
		// for문을 foreach로 변경해본다.
		
		for(int value:iarr) {
			System.out.println(value);
			
		}
	}

}
