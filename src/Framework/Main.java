package Framework;

import java.util.ArrayList;
import Generic.WildCard.Example.Knight;

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 제네릭을 사용하여 타입 지정
        //  - 붙이지 않을 시 <Object>와 동일
        ArrayList<Integer> ints1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<Knight> knights = new ArrayList<>();
    }
}
