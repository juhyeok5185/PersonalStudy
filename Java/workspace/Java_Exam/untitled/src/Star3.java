import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Star3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            for (int j=0; j<i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
