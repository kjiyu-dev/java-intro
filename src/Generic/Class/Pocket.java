package Generic.Class;

public class Pocket<F1, F2, F3> {
    private F1 fieldA;
    private F2 fieldB;
    private F3 fieldC;

    public Pocket(F1 fieldA, F2 fieldB, F3 fieldC) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }

    public F1 getFieldA() {
        return fieldA;
    }

    public F2 getFieldB() {
        return fieldB;
    }

    public F3 getFieldC() {
        return fieldC;
    }
}

