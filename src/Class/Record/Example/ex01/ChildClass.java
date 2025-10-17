package Class.Record.Example.ex01;

// ⏭️ 기존형식 (클래스만 사용)
public class ChildClass {
    private final String name;
    private final int birthYear;
    private final Gender gender;

    public ChildClass(String name, int birthYear, Gender gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public String getName() { return name; }
    public int getBirthYear() { return birthYear; }
}
