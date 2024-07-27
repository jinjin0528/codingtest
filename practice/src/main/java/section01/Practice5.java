public class Practice5 {
    public double solution(int[] numbers) {
        if (numbers.length == 0){
            return 0;
        }
        double answer = 0;
        for(int i =0; i<numbers.length;i++) {
            answer += numbers[i];
        }
        return answer/numbers.length;
    }
}
