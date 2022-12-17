import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

public class arrayExamNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        int[] ages = new int[5];

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + 1 + "번쨰 사람 정보 입력");
            System.out.println("이름 : ");
            names[i] = scanner.nextLine();
            System.out.println("나이 : ");
            ages[i] = Integer.parseInt(scanner.nextLine()); // 스트링으로 받은 값을 정수로 변환한다.
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println(i + 1 + "정보");
            System.out.println("이름 : " + names[i] + ", 나이 : " + ages[i]);
        }
        selectSort(names, ages);
    }

    public static void selectSort(String[] na, int[] ag) {
        for (int i = 0; i < na.length; i++) {
            for (int j = 0; j < na.length; j++) {
                if (ag[i] < ag[j]) {
                    int tmp = ag[i];
                    ag[i] = ag[j];
                    ag[j] = tmp;
                    String tmp2 = na[i];
                    na[i] = na[j];
                    na[j] = tmp2;
                }
            }
        }
    }
}
