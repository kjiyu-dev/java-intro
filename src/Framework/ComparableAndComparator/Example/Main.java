package Framework.ComparableAndComparator.Example;

import Example.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

// Comparable & Comparator 둘 다 인터페이스
// 💡 Comparable: (비교의 대상) 자신과 다른 객체 비교, 숫자클래스&불리언,문자열
// 💡 Comparator: (비교의 주체) 주어진 두 객체를 비교, 정렬의 기준으로 많이 사용
public class Main {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf(1);
        Integer int2 = Integer.valueOf(2);
        Integer int3 = Integer.valueOf(3);

        // 📃compareTo: 대상보다 작을때 -1, 같을때 0, 클때 1 return
        int _1_comp_3 = int1.compareTo(3); // -1
        int _2_comp_2 = int2.compareTo(2); // 0
        int _3_comp_1 = int3.compareTo(1); // 1
        int _abc_comp_def = "abc".compareTo("def"); // -3;

        Integer[] nums = {3,8,1,7,4,9,2,6,5};
        String[] strs = { "Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice" };

        // 📃sort (compareTo에 의거하여 정렬)
        Arrays.sort(nums);
        Arrays.sort(strs);

        Arrays.sort(nums, new IntDescComp()); // [9, 8, 7, 6, 5, 4, 3, 2, 1]
        Arrays.sort(nums, new CloseToInt(5)); // [5, 6, 4, 7, 3, 8, 2, 9, 1]

        // 💡 익명클래스, ..람다 배우면 더 간편하게 가능
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        
        //  💡ArrayList도 sort메소드 사용 가느
        ArrayList<Integer> numsAry = new ArrayList<>(Arrays.asList(nums));
        numsAry.sort(new IntDescComp()); // [9, 8, 7, 6, 5, 4, 3, 2, 1]

        TreeSet<Unit> unitTreeSet = new TreeSet<>(new UnitSorter());
        for (Unit u : new Unit[] {
                new Knight(Side.BLUE),
                new Knight(Side.BLUE), // 중복
                new Swordman(Side.RED),
                new Swordman(Side.RED), // 중복
                new MagicKnight(Side.BLUE),
                new Swordman(Side.BLUE),
                new MagicKnight(Side.RED),
                new Knight(Side.RED)
        }) {
            unitTreeSet.add(u);
        }
        System.out.println(unitTreeSet.toString());
    }
}
