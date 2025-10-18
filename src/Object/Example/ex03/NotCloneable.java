package Object.Example.ex03;

public class NotCloneable {
    // 원시타입 필드
    String title;
    int no;

    // 참조타입 필드
    int[] numbers;
    Click click;
    Click[] clicks;

    public NotCloneable(String title, int no, int[] numbers, Click click, Click[] clicks) {
        this.title = title;
        this.no = no;
        this.numbers = numbers;
        this.click = click;
        this.clicks = clicks;
    }

    @Override
    // 📃 throw: 예외를 던지는 키워드 (이 메소드는 문제생길 수 있어요~하는 경고키워드)
    // 📃 CloneNotSupportedException: 복제 불가능한 예외 표시  (CloneNotSupportedException: 복사가 안 될 수도 있어요!"
    protected Object clone() throws CloneNotSupportedException {
        // super.clone: 얕은복사해주는 메소드
        return super.clone();
    }
    // 즉 얘는 throw하여 catch 타게 함

}
