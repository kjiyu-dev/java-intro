package Generic.Roles.Example.ex02;

public class FormClicker <T extends FormElement & Clickable> {
    private T formElem;

    public FormClicker(T formElem) {
        formElem.printMode();
    }

    public void printElemMode() {
        formElem.printMode();
    }

    public void clickElem() {
        formElem.onClick(); // 이 부분이 Clickable의 메서드
    }

}
