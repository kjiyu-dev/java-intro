package Object.Example.ex01;

public class Button {
    public enum Mode {
        LIGHT("라이트"), DARK("다크");
        Mode(String indicator) { this.indicator = indicator; }
        String indicator;
    }

    private String name;
    private Mode mode;
    private int spaces;

    public Button(String name, Mode mode, int spaces) {
        this.name = name;
        this.mode = mode;
        this.spaces = spaces;
    }

    // 주석걸고 Main에서 그냥 Button만 부르면 요거 toString동작안함
    @Override
    public String toString() {
              return "%s %s버튼 (%d칸 차지)"
                      .formatted(mode.indicator, name, spaces);
    }
}
