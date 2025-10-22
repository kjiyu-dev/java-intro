package Framework;

import Generic.WildCard.Example.Knight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 💡 ArrayList: 가장 많이 사용되는 컬렉션 클래스
// 요소들을 들어오는 순서대로 저장한다
public class arrayList {
    public static void main(String[] args) {
        // ⏭️ 제네릭을 사용하여 타입 지정
        // 붙이지 않을 시 <Object>와 동일
        ArrayList<Integer> int1 = new ArrayList<>();
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<Number> nbr1 = new ArrayList<>();
        ArrayList<Knight> knights1 = new ArrayList<>();

        // ⏭️ add메소드로 요소 추가
        int1.add(11);
        int1.add(22);
        int1.add(33);
        // [11,22,33]

        // ⏭️ 요소 중복 허용
        for (String str : "바니 바니 바니 바니 당근 당근".split(" ")) {
            str1.add(str);
        }

        // 📃 (ArrayList).size: 요소 개수
        int int1Size = int1.size();
        // 📃 (ArrayList).get: 인덱스로 요소 접근
        int findInt1Sec = int1.get(1);
        // 📃 (ArrayList).contains: 포함 여부
        boolean isContain33inInt1 = int1.contains(33);
        boolean isContain99inInt1 = int1.contains(99);

        // 📃 (ArrayList).set: 위치의 요소 수정
        int1.set(0, 100);
        // 📃 (ArrayList).add: 위치에 요소 추가 (다음요소를 밀어냄)
        int1.add(0, 0);

        // ⏭️ 간단한 생성 및 초기화 방법들
        // 💡 Arrays 클래스: 배열 관련 각종 기능 제공, null 가능, 원본배열 변경시 리스트도 변경
        // 📃 Arrays.asList: 배열로 제공
        ArrayList<Integer> asList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
        // 💡 List 클래스: (java 9+) Arrays와 동일하지만 null이 불가능하며, 원본배열 연결과 별개로 동작한다
        // 📃 List.of
        ArrayList<Integer> of = new ArrayList<>(
                List.of(4,5)
        );
        // 💡 Collection 클래스: 기존 컬렉션에 여러 요소 효율적으로 추가
        // 📃 Collection.of
        ArrayList<Integer> addAll = new ArrayList<>();
        Collections.addAll(addAll,6,7,8,9);

        ArrayList<Integer> newInt1 = new ArrayList<>(int1);
        // 📃 얕은 복사: 스스로를 복제하여 반환 (ArrayList<Integer>) (array).clone
        ArrayList<Integer> cloneInt1 = (ArrayList<Integer>) int1.clone();

        Collections.addAll(int1,88,77);
        System.out.println(int1.toString());
        // 📃 (Array).remove(..): 인덱스로 지우기
        int1.remove(4);
        // 📃 (Array).remove((..) ..): 요소로 지우기
        int1.remove((Integer) 100);
        System.out.println(int1.toString());

        // 📃 (Array).removeAll(array): 주어진 콜렉션에 있는 요소들 지우기
        asList.removeAll(of);
        System.out.println(asList.toString());

        // 📃 (Array).addAll(array): 이어붙이기
        asList.addAll(addAll);
        System.out.println(asList);
    }

}
