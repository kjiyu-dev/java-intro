package Generic.Roles.Example;

import Interface.Example.Abstract.Mammal;
import Interface.Example.Eagle;
import Interface.Example.Interface.Flyer;
import Interface.Example.Interface.Hunter;
import Interface.Example.Interface.Swimmer;
import Interface.Example.Lizard;
import Interface.Example.PolarBear;

public class ex01 {
    // ⏩ N은 Number를 상속한 클래스여야 한다는 조건을 추가
    public static <N extends Number> double add2Num(N a, N b) {
        return a.doubleValue() + b.doubleValue();
    }

    // 💡 상속받는 클래스와 구현하는 인터페이스(들)을 함께 조건으로
    // 여기서는 클래스와 인터페이스 모두 extends 뒤에 & 로 나열
    public static <Relation extends Mammal & Hunter & Swimmer>
    void descHuntingMammal (Relation mammalAnimal) {
        System.out.printf("겨울잠 %s%n", mammalAnimal.hibernation ? "잠" : "안잠");
        mammalAnimal.hunt();
    }

    public static <Animal extends Flyer & Hunter>
    void descFlyingHunter (Animal flyerHunterAnimal) {
        flyerHunterAnimal.fly();
        flyerHunterAnimal.hunt();
    }

    static void main() {
        double sum1 = add2Num(1,2);
        // double sum2 = add2Num("1",2); ⏩ 불가능

        descHuntingMammal(new PolarBear());
        // descFlyingHunter(new PolarBear()); ⏩ 불가능
        descFlyingHunter(new Eagle());
    }


}
