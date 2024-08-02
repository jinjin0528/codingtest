package section01;
// 옷 가격 할인 받기. 10만원 이상 5% 할인. 30만원 이상 10% 할인. 50만원 이상 20% 할인.
public class Practice3 {
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000 && price <300000) {
            answer = (int)(price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            answer = (int)(price * 0.9);
        } else if (price >= 500000) {
            answer = (int)(price * 0.8);

        } else {
            answer = price;
        }
        return answer;
    }
}
