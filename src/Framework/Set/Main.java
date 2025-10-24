package Framework.Set;

import Example.Side;
import Example.Swordman;

import java.util.*;

// 💡 Set: 중복되지 않는 요소의 집합
// - 💡 HashSet: 성능이 빠르고 메모리 적게 사용, 순서관련 기능이 없음
// - 💡 LinkedHashSet: 요소들을 입력 순서대로 정렬(내부적 링크), HashSet보다는 성능 떨어짐
// - 💡 TreeSet: 요소들을 특정 순서대로 정렬(기본값 오름차순), 데이터 추가/삭제에 시간 더 소모
public class Main {
    public static void main(String[] args) {
        Set<Integer> intHset1 = new HashSet<>();
        intHset1.add(1);
        intHset1.add(1);
        intHset1.add(2);
        intHset1.add(3);
        // [1,2,3] ⏭️ 중복허용안함

        List<Integer> ints1 = new ArrayList<>(
                Arrays.asList(1,1,2,2,3,3,4,4,5,6,7)
        ); // [1,1,2,2,3,3,4,4,5,6,7]
        Set<Integer> intHset2 = new HashSet<>(ints1); // [1,2,3,4,5,6,7]

        // 중복을 제거한 ArrayList
        // (아래와 같이 응용가능)
        ints1.clear();
        ints1.addAll(intHset2);

        // 💡 해시 - 해시셋이 사용하는 방식
        // 동일한 입력값->언제나 동일한 출력값
        // 값마다 고유한 정수값을 해시값으로 저장
        // 일정개수까지는 정렬된형태, 이를 넘어서면 재조정
        // = 정렬 목적으로는 사용X
        // 📃 contains: 포함여부
        boolean contain2 = intHset1.contains(2); // true
        boolean contain10 = intHset1.contains(10); // false

        // 📃 remove: 요소 삭제 + 있엇는지 여부 반환
        boolean remove3 = intHset1.remove(3); // true
        boolean remove99 = intHset1.remove(99); // false

        // 📃 removeAll: 다른 콜렉션 기준으로 내용 삭제
        intHset2.removeAll(intHset1);

        System.out.println(" . . . . ");

        Set<Swordman> swordmanSet = new HashSet<>();
        Swordman swordman = new Swordman(Side.RED);

        swordmanSet.add(swordman);
        swordmanSet.add(swordman); // ⏭️ 중복이불가능한 HashSet으로 쌓여있기때문에 여전히 [RED 진영검사]
        swordmanSet.add(new Swordman(Side.RED)); // [RED 진영검사,RED 진영검사]
        swordmanSet.add(new Swordman(Side.RED)); // [RED 진영검사,RED 진영검사,RED 진영검사]
        swordmanSet.remove(swordman); // [RED 진영검사,RED 진영검사]

        // 💡 LinkedHashSet: 입력된 순서대로
        // 💡 TreeSet: 오름차순
        HashSet<Integer> intHset = new HashSet<>();
        LinkedHashSet<Integer> linkHset = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i : new int[] {3,1,8,5,4,7,2,9,6}) {
            intHset.add(i);
            linkHset.add(i);
            treeSet.add(i);
        }
        System.out.println(intHset.toString()); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(linkHset.toString()); // [3, 1, 8, 5, 4, 7, 2, 9, 6]
        System.out.println(treeSet.toString()); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
