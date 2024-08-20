package section01;
// 배열 원소 길이 구하기
public class Practice12 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
