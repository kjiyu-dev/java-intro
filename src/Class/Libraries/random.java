package Class.Libraries;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

//        random.setSeed(1234); // ⏩ 요거 활성화하면 고정값이 나옴

        int randInt1 = random.nextInt();
        int randInt2 = random.nextInt();
        int randInt3 = random.nextInt();

        // 범위 지정 (이상, 미만) - int
        int randInt4 = random.nextInt(0,10);
        int randInt5 = random.nextInt(0,10);
        int randInt6 = random.nextInt(0,10);

        double randDbl1 = random.nextDouble();
        double randDbl2 = random.nextDouble();
        double randDbl3 = random.nextDouble(3.14, 5.67);
        double randDbl4 = random.nextDouble(3.14, 5.67);

        boolean randBln1 = random.nextBoolean();
        boolean randBln2 = random.nextBoolean();
    }
}
