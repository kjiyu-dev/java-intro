package Class.Wrapper;

public class WrapperClass {
    // 원시 자료형
    int int1 = 123;
    double dbl1 = 3.14;
    char chr1 = 'A';
    boolean bln1 = true;

    // 💡 wrapper 클래스의 인스터스
    // 기존의 생성자 방식 - 성능이 좋지 않음
    Integer int2 = new Integer(int1);
    Double dbl2 = new Double(dbl1);
    Character chr2 = new Character(chr1);
    Boolean bln2 = new Boolean(bln1);

    // 💡 현재 권장되는 방식들
    // 📃 Wrapper Class: 기본 타입을 객체로 포장(wrap)
    Integer int3 = Integer.valueOf(int1);
    Double dbl3 = Double.valueOf(dbl1);
    Character chr3 = Character.valueOf(chr1);
    Boolean bln3 = Boolean.valueOf(bln1);

}
