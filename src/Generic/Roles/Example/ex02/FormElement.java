package Generic.Roles.Example.ex02;

public abstract class FormElement {
    public enum MODE {LIGHT, DARK};

    private static MODE mode = MODE.LIGHT;

    public void printMode() {
        System.out.println(mode);
    }

    abstract void func();
}
