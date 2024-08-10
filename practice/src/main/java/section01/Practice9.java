package section01;
// 문자열 stringBuffer를 이용해 뒤집기
public class Practice9 {
    public String solution(String my_string) {

        StringBuffer sb = new StringBuffer(my_string);

        return sb.reverse().toString();
    }
}
