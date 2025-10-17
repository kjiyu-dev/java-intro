package Method;
// 💡 Method: 반복작업을 최소화 하기 위하여 값을 받고 연산하여 결과값을 반환하는 함수

public class method {
    static int getSum (int num1, int num2) {
        return num1 + num2;
    }

    // 📃 ...연산자: 배열로 묶음
    static double getAverage(int... nums) {
        double result = 0.0;
        for (int num : nums) {
            result += num;
        }
        return result / nums.length;
    }
    // 📃 ... 연산자의 경우 다른 인자들과 사용시 맨 마지막에 위치시켜야한다
    static String getClassShyoukai(int classNo, String teacher, String... kids) {
        return "%d반의 담임은 %s 선생님, 원생들은 %s로 구성되어 있어요.".formatted(classNo,teacher,String.join(",",kids));
    }

    public static void main(String[] args) {
        int int1 = getSum(2,3);
        System.out.println(int1);
        System.out.println(getSum(4,5));
        System.out.println(getSum(getSum(4,5),getSum(5,6)));

        double avg = getAverage(10,2,30,10,50);
        String[] kids = {"짱구","철수","훈이"};
        String classSyoukai  = getClassShyoukai(3,"채송아",kids);
        String classSyoukai1  = getClassShyoukai(3,"채송아","짱구","철수","훈이");
    }

}
