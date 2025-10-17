package AbstractClass.Example.FormElement;

public class elementMain {
    public static void clickFormElement(FormElement fe) {
        fe.func();
    }

    public static void main(String[] args) {
        Button button1 = new Button(2, "Enter");
        Switch swtich1 = new Switch(3, true);
        DropDown dropDown = new DropDown(5, new String[] {
                "이름 오름차순", "이름 내림차순",
                "크기 오름차순", "크기 내림차순",
                "날짜 오름차순", "날짜 내림차순"
        });

        clickFormElement(button1);

    }
}
