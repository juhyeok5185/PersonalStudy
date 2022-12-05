public class enumExam {
//    public static final string MALE="MALE";
//    public static final string FEMALE="FEMALE";

    public static void main(String[] args) {
//        string gender1;
//        gender1 = enumExam.MALE;
//        gender1 = enumExam.FEMALE;

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.MALE;
    }
}
enum Gender { //꼭 정해진 값으로만 받아야할때 열거형을 사용해야한다.
    MALE, FEMALE;
}
