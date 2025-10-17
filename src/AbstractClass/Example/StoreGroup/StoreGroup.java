package AbstractClass.Example.StoreGroup;

// 💡(abstract) 추상클래스: 스스로 인스턴스를 만들 수 없다 (포유류 라고 불리는 동물자체는없다)
// 자식 클래스로 파생되기 위한 클래스 (개,고양이,말 등의 클래스로서 인스턴스생성)
// 스스로 선언만 하고 구현하지 않음
public abstract class StoreGroup {
    protected static final String ADS = "우리의 %s 너무너무 맛있다";

    // 추상 클래스 메소드는 불가능
    // abstract static String getCreed();

    protected final int no;
    protected final String name;

    // 생성자
    public StoreGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro() {
        return "%d호 %s점입니다.".formatted(no,name);
    }

    public abstract void takeOrder();

    public String toString() {
        return intro(); // 또는 원하는 형태로 포맷팅
    }
}
