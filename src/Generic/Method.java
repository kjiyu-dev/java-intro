package Generic;

// 💡 제네릭: 자료형을 필요에 따라 동적으로 정할 수 있도록 해줌
// 즉, 자료형을 변수로 갖는다.
// 메소드 또는 클래스에 사용 됨
public class Method {
    //  📃 <N>: 타입변수. 원하는 어떤 이름으로든 명명가능
    public static <P> P pickRandom (P a, P b) {
        return Math.random() > 0.5 ? a : b;
    }

    static void main() {
        int randNum = pickRandom(777,444);
        boolean randBool = pickRandom(true, false);
        String randStr = pickRandom("승리", "패배");
    }
}
