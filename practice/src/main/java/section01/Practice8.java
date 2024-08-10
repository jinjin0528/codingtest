package section01;

public class Practice8 {
    public int solution(int[] dot) {

        int x = dot[0] > 0 ? 1:0;
        int y = dot[1] > 0 ? 1:0;

        int answer = 0;

        if (x == 1 && y == 1) {
            answer = 1;
        } else if(x == 0 && y == 1) {
            answer = 2;
        } else if (x == 0 && y == 0) {
            answer = 3;
        } else {
            answer = 4;
        }   return answer;
    }
}
