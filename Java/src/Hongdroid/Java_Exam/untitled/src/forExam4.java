public class forExam4 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                if(i==2 & j==3){
                    System.out.printf("o");
                } else if (i==3 & j==4) {
                    System.out.printf("o");
                } else {
                    System.out.printf("+");
                }
            }
            System.out.println();
        }
    }
}
