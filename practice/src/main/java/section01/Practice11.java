package section01;
// 특정 문자열 제거하기
public class Practice11 {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter,"");
        return answer;
    }
}
