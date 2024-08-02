package section01;
// 배열 안에 짝수, 홀수 세기
public class Practice4 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];  // 먼저 배열 안에 크기 지정
        int left = 0;
        int right = 0;
        for(int i = 0;i<num_list.length;i++){
            if(num_list[i]%2 == 0){
                left++; // 짝수 개수는 왼쪽 배열 값에 들어감
            } else {
                right++;    // 홀수 개수는 오른쪽 배열 값에 들어감
            }
        }
        answer[0] = left;   // 인덱스 0번은 왼쪽
        answer[1] = right;  // 인덱스 1번은 오른쪽
        return answer;
    }
}
