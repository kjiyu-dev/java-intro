package Object.Example.ex03;

public class Main {
    static void main() {
        NotCloneable notCloneable = new NotCloneable(
                "클릭들 1", 1, new int[] {1,2,3}, new Click(12,34),
                new Click[] { new Click(12,34), new Click(56,78)}
        );

        NotCloneable clone1 = null;

        try {
            System.out.println("타나요?");
            clone1 = (NotCloneable) notCloneable.clone();
        } catch (CloneNotSupportedException e) {
            System.out.printf("복제 중 오류가 발생했어요 .%s%n", notCloneable);
        }
    }


}
