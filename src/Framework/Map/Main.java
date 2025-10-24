package Framework.Map;

import Example.*;

import java.util.*;

// 💡 맵: key 와 value의 쌍
// 키와 값의 자료형은 다양하게 가능
// 키값 중복 불가. 같은 키에 다시 값을 넣으면 기존의 값 대체
public class Main {
    public static void main(String[] args) {
        // 💡 HashMap: Map 인터페이스 클래스 중 가장 일반적으로 사용
        // 순서를 보장하지 않고, null키와 값을 허용한다.
        Map<Integer, String> numNameHmap = new HashMap<>();
        // 📃 put 매소드: 키와 값 삽입
        numNameHmap.put(1, "신짱구");
        numNameHmap.put(2, "신짱아");
        numNameHmap.put(3, "신형만");

        Map<String, Integer> nameAgeHmap = new HashMap<>();
        nameAgeHmap.put("피터팬",18);
        nameAgeHmap.put("엘사",22);
        nameAgeHmap.put("콩쥐",16);

        Map<Side, ArrayList<Unit>> sideUnitsHmap = new HashMap<>();
        sideUnitsHmap.put(
                Side.BLUE,
                new ArrayList<>(
                        Arrays.asList(
                                new Swordman(Side.BLUE),
                                new Knight(Side.BLUE),
                                new MagicKnight(Side.BLUE)
                        )
                )
        );
        sideUnitsHmap.put(
                Side.RED,
                new ArrayList<>(
                        Arrays.asList(
                                new Knight(Side.RED),
                                new Knight(Side.RED),
                                new Knight(Side.RED)
                        )
                )
        );

        // 📃 putAll: 대상 맵으로부터 전부 가져옴
        Map<Integer, String> numNameHmapClone = new HashMap<>();
        numNameHmapClone.putAll(numNameHmap);

        // 📃 get: 메소드에 "키"를 넣어 값 접근
        String getNo2 = numNameHmap.get(2); // 신짱아
        Integer getElsaAge = nameAgeHmap.get("엘사"); //22
        // ⏩ 잘못된 키 입력시 null반환
        String getNo0 = numNameHmap.get(0); // null

       // 📃 keySet: 키들이 Set(인터페이스) 반환
        Set<Integer> numKset = numNameHmap.keySet(); // [1,2,3]
        Set<Integer> numHset = new HashSet<>();
        numHset.addAll(numKset);
        System.out.println(numHset.toString()); // [1,2,3]

        // 📃 containsKey / containsValue: 키/값 포함 된 쌍이 있는지
        boolean isContainElsa = nameAgeHmap.containsKey("엘사");
        boolean isContain18years = nameAgeHmap.containsValue(18);

        System.out.println(". . . . .");

        Map<Attacker, Horse> atkrHrsHmap = new HashMap<>();

        Swordman genji = new Swordman(Side.RED);
        Knight hux = new Knight(Side.BLUE);

        atkrHrsHmap.put(genji, new Horse(40));
        atkrHrsHmap.put(hux, new Horse(50));
        atkrHrsHmap.put(new MagicKnight(Side.BLUE), new Horse(60));

        // ⏩ 키의 값이 참조형일 경우 변수 등 저장되어 있어야한다.
        Horse genjiHorse = atkrHrsHmap.get(genji);
        Horse huxHorse = atkrHrsHmap.get(hux);
        // ⏩ (아래방법) 일반적인 방법으론 꺼낼 수 없다
        // Horse worngHorse = atkrHrsHmap.get(new MagicKnight(Side.BLUE));

        // 📃 getDefault : 키에 해당하는 쌍이 없을 시 지정한 디폴트 "값" 반환
        String defName = numNameHmap.getOrDefault(10, "김대타"); // 김대타
        Horse defHorse = atkrHrsHmap.getOrDefault(genji, new Horse(100)); // 있음, genji의 말 return
        
        // 📃 remove: 주어진 키(+쌍)가 있다면 삭제
        numNameHmapClone.remove(1); // [1=신짱구, 2=신짱아, 3=신형만] -> [신짱아, 신형만]
        numNameHmapClone.remove(100); // [신짱아, 신형만]
        numNameHmapClone.remove(2, "봉미선"); // [신짱아, 신형만]
        numNameHmapClone.remove(3, "신형만"); // [신짱아]
        
        // 💡 해시맵: 키의 해시코드/키
        // 💡 트리맵: 키를 트리 형태로 저장
        // ⏭️ 정렬 무관 빠른접근시에는 해시맵, 키순정렬 필요시 트리맵
        TreeMap<Integer, String[]> classKidsTmap = new TreeMap<>();
        classKidsTmap.put(3, new String[] {"서아", "이준", "아린"});
        classKidsTmap.put(9, new String[] {"하윤", "서준", "지호"});
        classKidsTmap.put(1, new String[] {"이서", "하준", "아윤"});
        classKidsTmap.put(7, new String[] {"지안", "은우", "예준"});
        classKidsTmap.put(5, new String[] {"서윤", "시우", "하은"});
        System.out.println(classKidsTmap.toString());
    }
}
