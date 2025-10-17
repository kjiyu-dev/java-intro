package Class.Enum.Example.ex02;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();

        button1.setMode(Button.Mode.DARK);
        button1.setSpace(Button.Space.DOUBLE);

        System.out.println(button1.getMode());
        System.out.println(button1.getSpace());
    }
}
