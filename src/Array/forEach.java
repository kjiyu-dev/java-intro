package Array;

public class forEach {
    public static void main(String[] args) {
        //  2의 배수 차례로 10개 배열에 담기
        int count = 10;
        int[] multiOf2 = new int[count];

        for (int i = 1, c = 0; c < count; i++) {
            if (i % 2 == 0) {
                multiOf2[c++] = i;
            }
        }

        //  💡 배열 순환 (기본적인 방법)
        for (int i = 0; i < multiOf2.length; i++) {
            System.out.println(multiOf2[i]);
        }
        //  💡 for each 문법 - 배열이나 이후 배울 콜랙션 등에 사용
        for (int num : multiOf2) {
            System.out.println(num);
        }
        // 📃 배열의 특정 개수만 사용할 때는 for 문, 전부 사용할 때는 foreach 문
        int multi0f2Sum = 0;
        for (int num : multiOf2) {
            multi0f2Sum += num;
        }
    }
}