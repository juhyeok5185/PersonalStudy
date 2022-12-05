import java.util.ArrayList;
import java.util.Scanner;

public class q1_main {
    public static void main(String[] args) {
        q1_Student student = new q1_Student("박주혁", "9092");
        q1_Student student2 = new q1_Student("김중엽", "9093");
        q1_Student student3 = new q1_Student("전상현", "9094");

        ArrayList <q1_Student>list = new ArrayList<q1_Student>();

        list.add(student);
        list.add(student2);
        list.add(student3);

//        for (q1_Student stu : list) {
//            System.out.println(stu.getName());
//            System.out.println(stu.getNo());
//        }

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("계속 검색을 하고싶으면 y 종료하고 싶은면 n");
            String input = scan.next();

            if(input.equals("y")){
                System.out.println("검색시작");
                String name = scan.next();
                boolean flag = false;

                for (q1_Student stu : list){
                    if(stu.getName().equals(name)){
                        System.out.println("해당하는 학생의 학번은:" + stu.getNo());
                        flag = true;
                    }
                }
                if (!flag){
                    System.out.println("학생이 없습니다.");
                }
            }
            else if (input.equals("n")){

                break;
            }
        }

        System.out.println("프로그램이 종료되었습니다.");
    }
}
