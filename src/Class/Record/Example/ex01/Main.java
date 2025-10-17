package Class.Record.Example.ex01;

public class Main {
    public static void main(String[] args) {
        ChildRecord child1 = new ChildRecord("홍길동", 2020, Gender.MALE);
        String childStr = child1.toString();

        ChildRecord[] children = new ChildRecord[] {
                new ChildRecord("김순이",2021,Gender.FEMALE),
                new ChildRecord("신짱아",2019,Gender.FEMALE),
        };

        for (ChildRecord child : children) {
            System.out.printf("%s %d년생 %s 어린이%n", child.gender(), child.birthYear(), child.name());
        }
    }
}
