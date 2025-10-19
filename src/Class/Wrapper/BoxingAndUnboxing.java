package Class.Wrapper;

public class BoxingAndUnboxing {
    // 💡 박싱: 원시값을 Wrapper클래스 인스턴스로
    int intPrim1 = 123;
    Integer intInst1 = Integer.valueOf(intPrim1);

    char chrPrim1 ='A';
    Character chrInst1 = Character.valueOf(chrPrim1);

    //  💡 언박싱: Wrapper클래스의 인스턴스를 원시값으로
    Double dblInst1 = Double.valueOf(3.14);
    double dblPrim1 = dblInst1.doubleValue();

    Boolean blnInst1 = Boolean.valueOf(true);
    boolean blnPrim1 = blnInst1.booleanValue();

    Character chrInst2 = Character.valueOf('B');
    char chrPrim2 = chrInst2.charValue();
}
