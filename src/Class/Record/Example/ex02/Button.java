package Class.Record.Example.ex02;

public class Button {
    public enum ClickedBy {
        LEFT('좌'), RIGHT('우');
        private char indicator;
        ClickedBy(char indicator) {this.indicator = indicator;}
        public char getIndicator() { return indicator; }
    }

    // ⏭️ 다른 클래스 내부로 포함
    // ⏭️ 인터페이스 구현 가능 (클래스 상속 불가)️
    public record ClickInfo(
        int x, int y, ClickedBy clickedBy
    ) implements InfoPrinter {
        // ⏭️ 클래스 필드 가질 수 있다
        static String desc = "버튼 클릭 정보";
        @Override
        public void printInfo() {
            System.out.printf("%c클릭 (%d, %d)%n",clickedBy.indicator, x, y);
        }
    }

    public ClickInfo func (int x, int y, ClickedBy clickedBy) {
        System.out.println("버튼 동작");
        return new ClickInfo(x, y, clickedBy);
    }

}

