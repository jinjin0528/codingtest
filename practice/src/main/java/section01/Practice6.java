package section01;
// 양꼬치 구하기. 양꼬치 1인분은 12000원, 10인분에 2000원짜리 음료수 하나 공짜일 때 가격 구하기
public class Practice6 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (n*12000)+((k-(n/10))*2000);
        return answer;
    }
}
