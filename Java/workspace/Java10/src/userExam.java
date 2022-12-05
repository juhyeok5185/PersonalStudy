public class userExam {
    String name;
    int age;
    String hobby;
//    public userExam(String _name, int _age , String _hobby){
//        this.name = _name;
//        this.age = _age;
//        this.hobby = _hobby;
//    } //이미 생성자는 생성과 동시에 존재되나 안보인다.
      //Constructor 로 간단하게 가능
      //Getter and Setter 는 자동으로 만들어준다.

    public  String getName(){ //cmd + n
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
