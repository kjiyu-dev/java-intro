package AbstractClass.Example.FormElement;

public abstract class FormElement {
    protected int space;
    public FormElement(int space) {
        this.space = space;
    }
    abstract void func();
}