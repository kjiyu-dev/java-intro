package Example;

public class MagicKnight extends Knight{
    public int mana = 60;
    public final int MANA_USAGE = 4;
    public MagicKnight(Side side) {
        super(side);
    }

    public void lighteningAttack (Unit[] targets) {
        for (Unit target : targets) {
            // 💡 instanceof: obj가 해당(MagicKnight) 타입인지 확인
            if (target instanceof MagicKnight) continue;
            if (mana < MANA_USAGE) break;
            System.out.printf("⚡💀⚡ %s%n",target);
            target.hp -= 8;
            mana -= MANA_USAGE;
        }
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 마법기사";
    }
}
