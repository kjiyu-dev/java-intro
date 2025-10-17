package Class.Enum.Example.ex02;

public class Button {
    // ⏭️ enum을 클래스 내부에 사용하여 오용여지를 제거하기
    enum Mode {LIGHT, DARK};
    enum Space {SINGLE, DOUBLE, TRIPLE};

    private Mode mode = Mode.LIGHT;
    private Space space = Space.SINGLE;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public Mode getMode() {
        return mode;
    }

    public Space getSpace() {
        return space;
    }
}
