package Example;

public abstract class Unit {
    // ❗ 편의를 위해 일부필드를 public으로
    // 실무에서는 private로 만듦
    public Side side;
    public int hp;

    public Unit(Side side, int hp) {
        this.side = side;
        this.hp = hp;
    }

    public Side getSide() {
        return side;
    }
}
