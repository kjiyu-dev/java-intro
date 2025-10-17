package Class.Libraries;

import java.util.StringJoiner;

// 💡 StringJoiner : 받은 문자열들을 모아서 열고 닫는 문자열과 함께 조인
// 배열로만 받는 .join보다 더 동적이고 강력함
public class stringJoiner {
    public static void main(String[] args) {
        String[] vegetables = {"감자", "당근", "오이", "양파"};
        StringJoiner strJnr1 = new StringJoiner(",","<",">");
        StringJoiner strJnr2 = new StringJoiner(" / ","{{ "," }}");

        for (String vegetable : vegetables) {
            strJnr1.add(vegetable);
            strJnr2.add(vegetable);
        }

        System.out.println(strJnr1);
        System.out.println(strJnr2);

    }
}
