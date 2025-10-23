package Framework;

import java.util.*;

// 💡 LinkedList: 각 요소들이 메모리 이곳저곳에 산재함
// 요소의 추가,제거가 빠른 장점
// 요소 접근이 느림
// 요소 추가/제거가 잦은 곳에 적합
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> intNums = new LinkedList<>();
        for (int intNum : new int[] {2,3,4}) { intNums.add(intNum); }

        System.out.println(intNums.toString());

        intNums.addFirst(1);
        intNums.addFirst(0);
        intNums.addLast(5);
        intNums.addLast(6);

        System.out.println(intNums.toString());

        // 📃 .peek~/.get~: 꺼내지않고 반환
        // .peek: 비어있을 경우 null 반환
        // .get: 비어있을 경우 인셉션(예외처리)
        int peekedFirst = intNums.peekFirst();
        int gottenFirst = intNums.getFirst();
        int peekedLast = intNums.peekLast();
        int gottenLast = intNums.getLast();
        
        LinkedList<Integer> emptyArr = new LinkedList<>();
        Integer peekNon = emptyArr.peekFirst();
        // Integer getNon = emptyArr.getFirst(); ⏭️인셉션 반환

        LinkedList<Character> charList = new LinkedList<>();
        charList.push('A');
        charList.push('B');
        charList.push('C');
        charList.push('D');
        charList.push('E');
        System.out.println(charList.toString()); // [E,D,C,B,A]

        char pop1 = charList.pop();
        char pop2 = charList.pop();
        char pop3 = charList.pop();
        System.out.println(charList.toString()); // [B, A]

        // ⏭️ 실무에서는 컬렉션 자료형을 인터페이스로
        List<Integer> intList = new ArrayList<>();
        intList = new LinkedList<>();

        Set<String> strSet = new HashSet<>();
        strSet = new TreeSet<>();

        Map<Integer, String> intStrMap = new HashMap<>();
        intStrMap = new TreeMap<>();

    }
}
