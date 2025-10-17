package Class.AccessModifier.Example;

public class SmartPhone {
    String powerButton = "OnOff";

    // 접근제어자 종류
    // 📃 public, default, protected, private
    // * protected: 상속을 고려한 접근 제어자로, 다른 패키지여도 상속받은 자식 클래스에서 접근 가능
    // * private: 같은 클래스 안에서만 접근 가능
    public String sdCardSlot = "SD Card";
    protected String cpu = "intel-core";
}
