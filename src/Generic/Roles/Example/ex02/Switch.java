package Generic.Roles.Example.ex02;

public class Switch extends FormElement implements Clickable{
    private boolean isOn;

    public Switch(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void onClick() { func(); }

    @Override
    void func() {
        isOn = !isOn;
        System.out.printf("스위치 %s상태로 전환하였습니다.%n",isOn ? "ON" : "OFF");
    }
}
