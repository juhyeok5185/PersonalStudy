
public class arrayUseExam {

	public static void main(String[] args) {
		
		int[] iarray = new int[100];
		
		for(int i=0; i<iarray.length; i++){
			iarray[i] = i+1;
			System.out.println(i);
		}
		int sum = 0;
		for(int i=0; i<iarray.length; i++) {
			sum = sum + iarray[i];
		}
		
		System.out.println(sum);
	}

}
