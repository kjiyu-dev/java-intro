package Class.Libraries;

public class math {
    public static void main(String[] args) {
//       Math mathInst = new Math(); ⏩ 불가!

        // 💡 정적 메소드들

        // 자연로그의 밑
        double e = Math.E;
        double pi = Math.PI;

        // 숫자 자료형 마다 오버로드
        double absInt = Math.abs(-5);
        double absDbl = Math.abs(-3.14);

        // 올림, 내림, 반올림
        double ceil = Math.ceil(2.34);
        double floor = Math.floor(4.56);
        double round1 = Math.round(2.34);
        double round2 = Math.round(4.56);

        // 큰 수 또는 작은 수 반환, 자료형 마다 오버로드
        int largerInt = Math.max(2,3);
        float smallerFlt = Math.min(1.2f,3.4f);

        // 제곱
        double pow1 = Math.pow(4,3);
        double pow2 = Math.pow(4, 0.5);

        // 0.0 이상 1.0 미만 무작위 수
        double rand1 = Math.random();
        double rand2 = Math.random();
        double rand3 = Math.random();
    }
}
