package Generic.WildCard.Example;

public class Main {
    public static void main(String[] args) {
        // 아무 유닛이나 태우는 말
        Horse<Unit> horseLv1 = new Horse<>();
        horseLv1.setRider(new Unit());
        horseLv1.setRider(new Knight());
        horseLv1.setRider(new MagicKnight());

        // 기사 계급 이상 태우는 말
        Horse<Knight> horseLv2 = new Horse<>();
        // horseLv2.setRider(new Unit()); ⏭️ 불가
        horseLv2.setRider(new Knight());
        horseLv2.setRider(new MagicKnight());

        // 마법기사만 태우는 말
        Horse<MagicKnight> horseLv3 = new Horse<>();
        horseLv3.setRider(new MagicKnight());

        // ⏭️자료형과 제네릭 타입이 일치하지않으면 대입불가
        // 제네릭 타입이 상속관계에 있어도 마찬가지
        // Horse<Unit> wrongHorse1 = new Horse<Knight>();

        // 💡와일드카드<? ....>: 제네릭 타입의 다형성을 위함
        // Knight과 그 자식 클래스만 받을 수 있음 (MagicKnight참조)
        Horse<? extends Knight> knightHorse;
        // knightHorse = new Horse<Unit>();; ⏭️불가
        knightHorse = new Horse<Knight>();
        knightHorse = new Horse<MagicKnight>();
        // knightHorse = horseLv1; ⏭️ 불가
        knightHorse = horseLv2;
        knightHorse = horseLv3;

        // ⏭️제한 없음 <?>
        Horse<?> anyHorse;
        anyHorse = horseLv1;
        anyHorse = horseLv2;
        anyHorse = horseLv3;

    }
}
