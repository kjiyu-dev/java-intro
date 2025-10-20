package Generic.Roles.Example.ex02;

public class Main {
    public static void main(String[] args) {
        FormClicker<Button> btn1 = new FormClicker<>(new Button());
        FormClicker<Switch> switch1 = new FormClicker<>(new Switch(true));

        btn1.printElemMode();
        switch1.clickElem();

        // FormClicker<TextInput> input1 = ⏭️ extends해주지않아서 불가
    }
}
