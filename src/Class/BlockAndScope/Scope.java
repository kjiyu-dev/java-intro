package Class.BlockAndScope;

public class Scope {
    public static void main(String[] args) {
//        System.out.println(a);
    }

//    private String y = x;
    private int a = 1;
    private int b = a + 1;
//    private int c = d + 1;

    public void func1() {
        System.out.println(a+b);
        int d = 2;
    }

    public void func2() {
//        System.out.println(d);
    }
    String king = "사자";

    void printKings () {
        String king = "여우"; // 💡 그럼 이건 뭔가요??

        //  ⭐️ 인스턴스의 필드는 다른 영역으로 간주
        System.out.printf(
                "인스턴스의 왕은 %s, 블록의 왕은 %s%n",
                this.king, king
        );
    }
}
