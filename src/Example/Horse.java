package Example;

public class Horse <R extends Unit>{
    private int extraHp;
    private R rider;

    public Horse(int extraHp) {
        this.extraHp = extraHp;
    }

    public void setRider(R rider) {
        this.rider = rider;
        rider.hp += extraHp;
    }

    @Override
    public String toString() {
        return "말 (추가체력: %d)".formatted(extraHp);
    }
}
