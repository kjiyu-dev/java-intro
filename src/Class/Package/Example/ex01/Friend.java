package Class.Package.Example.ex01;

public class Friend {
    public static void main(String[] args) {
        Parent parent = new Parent();

        String friend1 = parent.parent1;
        String friend2 = parent.parent2;
        String friend3 = parent.parent3;
//        String friend4 = parent.parent4; // ⏭️불가
    }
}
