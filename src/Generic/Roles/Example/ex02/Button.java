package Generic.Roles.Example.ex02;

public class Button extends FormElement implements Clickable{
    @Override
    public void onClick() { func(); }

    @Override
    void func() {
        System.out.println("버튼을 클릭했습니다.");
    }
}
