package Object.Example.ex02;

public class Main {
    static void main() {
        Click click1 = new Click(123,456,789101112);
        Click click2 = new Click(456,789,10111243);
        Click click3 = new Click(789,101,2345678);
        Click click4 = new Click(123,456,11223344);

        boolean bool1 = click1 == click1;
        boolean bool2 = click1 == click2;
        boolean bool3 = click1 == click3;
        boolean bool4 = click1 == click4;

        boolean boolA = click1.equals(click1);
        boolean boolB = click1.equals(click2);
        boolean boolC = click1.equals(click3);
        boolean boolD = click1.equals(click4);
    }
}
