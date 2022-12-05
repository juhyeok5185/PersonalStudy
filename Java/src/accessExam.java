public class accessExam {
    public int i = 0; //전체공개
    protected int p = 0; //같은 패키지와 다른패키지 상속받은경우 사용가능
    private int a = 0; //자기 자신만 접근가능
    int b = 0; //default는 자기 자신과 같은 패키지에서만 접근가능
    
}
