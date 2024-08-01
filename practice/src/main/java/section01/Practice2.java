package section01;
// 중복된 수 개수 세기
public class Practice2 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}
