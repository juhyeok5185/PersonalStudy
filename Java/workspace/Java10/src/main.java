public class main {
    public static void main(String[] args) {
        //생성자 파라미터(매개변수)에 맞게 인자를 삽입해주낟.
//        userExam user = new userExam("이홍철", 10 , "달리기" );
        userExam user = new userExam();
        user.setName("박주혁");
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.hobby);
    }
}
