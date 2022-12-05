public class q5_main {
    public static void main(String[] args) {

        class Solution {
            public int solution(int angle) {
                int answer = 0;
                if ( angle < 90){
                    answer = 1;
                }else if ( angle == 90){
                    answer = 2;
                }else if ( angle < 180){
                    answer = 3;
                }else{
                    answer = 4;
                }
                return answer;
            }
        }
    }
}
//예각 : 0 < angle < 90 1
//        직각 : angle = 90 2
//        둔각 : 90 < angle < 180 3
//        평각 : angle = 180 4