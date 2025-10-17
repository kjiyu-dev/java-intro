package Class.Libraries;

//  💡 StringBuffer : 자주 변경해야하는 문자열이 있을 때 적합 (문자열 여러차례 이어붙일 때)
public class stringBuffer {
    public static void main(String[] args) {
        String basicString = new String("베이직");
        // ⏩ 기본적으로 16개의 문자를 저장할 수 있는 공간을 가짐
        StringBuffer strBuffer1 = new StringBuffer();
        StringBuffer strBuffer2 = new StringBuffer(2);
        StringBuffer strBuffer3 = new StringBuffer("Hello"); // ⏩ 문자열 길이 + 16

        // 💡 capacity메소드: 인스턴스 문자 저장공간 확인
        int[] capacities1 = {
                strBuffer1.capacity(), strBuffer2.capacity(), strBuffer3.capacity()
        };

        strBuffer1.append("하이요~1");
        strBuffer2.append("하이요~2");
        strBuffer3.append("하이요~3");
//        basicString.append("하이요?"); ⏩안됨 삐비빅

        int[] capacities2 = {
                strBuffer1.capacity(), strBuffer2.capacity(), strBuffer3.capacity()
        };

        String strBffr3Out = strBuffer3.toString();

        // 💡StringBuilder도 동일한 기능
        StringBuilder strBuilder1 = new StringBuilder("한놈");
        strBuilder1.append("두시기");
//        basicString.append("두시기"); ⏩안됨 삐빅
    }
}
