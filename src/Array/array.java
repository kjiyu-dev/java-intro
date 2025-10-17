package Array;

public class array {
    public static void main(String[] args) {
        // 블록 선언 및 초기화 두가지 방법 사용 가능
        char[] array1 = {'동','서','남','북'};
        char[] array2 = new char[] {'동','서','남','북'};

        // 📃선언만 먼저 한 상태에 해당 배열 put할 때 재선언 없이 불가능
        char[] justDeclare;
        // justDeclare = {'동','서','남','북'} ⏭️불가능
        justDeclare = new char[] {'동','서','남','북'}; // ⏭️가능

        // 이중 배열
        boolean[][] dbBoolArr = new boolean[2][3];
        // 삼중 배열
        char[][][] trpCharArr = {
                {{'자', '축'}, {'인', '묘'}},
                {{'진', '사'}, {'오', '미'}},
                {{'신', '유'}, {'술', '해'}},
        };

        //  ⭐ 원시 자료형은 값 자체를 복사 - 별개의 값이 됨
        boolean bool1 = true;
        boolean bool2 = false;
        bool2 = bool1; // 🔴
        bool1 = false;

        int int1 = 1;
        int int2 = 2;
        int2 = int1;
        int2 = 3;

        char ch1 = 'A';
        char ch2 = 'B';
        ch2 = ch1;
        ch1 = '가';

        //  ⭐ 참조 자료형은 값 주머니의 주소를 복사
        //  두 변수가 같은 주머니를 가리키게 됨
        boolean[] boolAry1 = { true, true, true };
        boolean[] boolAry2 = { false, false, false };
        boolAry2 = boolAry1; // 🔴
        boolAry1[0] = false;

        int[] intAry1 = { 1, 2, 3 };
        int[] intAry2 = { 4, 5 };
        intAry2 = intAry1;
        intAry2[1] = 100;

        char[] chAry1 = { 'A', 'B', 'C' };
        char[] chAry2 = { 'a', 'b', 'c', 'd', 'e' };
        chAry2 = chAry1;
        chAry1[2] = '다';

        //  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐
        String str1 = "코인 함";
        String str2 = "관심 없음";
        str2 = str1; // 🔴

        str1 = "고점에 익절";



    }
}
