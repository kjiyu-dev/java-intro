package Class.StaticFieldAndMethod.Example;

public class Button {
    static String mode = "LIGHT";
    static void setMode () {
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    }

    char print;
    int space;

    Button (char print, int space) {
        this.print = print;
        this.space= space;
    }

    void place () {
        // 📃 printf: print+formatted (문자열,변수1,변수2 ...)
        System.out.printf(
                "표시: %c, 공간:%d, 모드:%s",
                print,space,mode
        );
    }
}
