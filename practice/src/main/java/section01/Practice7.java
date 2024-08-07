package section01;

import java.util.Arrays;

class Practice7 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length / 2];

        return answer;
    }
}