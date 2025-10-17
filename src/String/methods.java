package String;

public class methods {
    public static void main(String[] args) {
        String name = "김지유";
        int int1Lng = "".length();
        int int2Lng = "hello".length();
        int int3Lng = name.length();

        boolean nameIsEmpty = name.isEmpty();
        boolean emptyStrIsEmpty = "".isEmpty();
        boolean spaceStrIsEmpty = " ".isEmpty();

        // 📃 isBlank: 공백을 제외한 문자열길이가 0인지
        boolean blankStrCheck = "".isBlank();
        boolean blankSpaceStrCheck = " ".isBlank();

        // 📃 trim: 문자열 앞 뒤 공백제거
        String energy = " 에 네 르 기 파 ";
        String trimEnery = energy.trim();
        
        // 📃 charAt: n번째 문자 반환
        String rainbow = "빨주노초파남보";
        char ch0 = rainbow.charAt(2);
        char rainbowLng = rainbow.charAt(rainbow.length() - 1);

        // 📃 indexOf/lastIndexOf: 일치하는 첫/마지막 문자열 위치
        String akumu = "ashita mata oki tara nanika hajimete miyo ashitamo nemurenakute";
        int mata = akumu.indexOf("mata");
        int shita = akumu.indexOf("shita");
        int ashita1st = akumu.indexOf("ashita");
        int ashita2nd = akumu.lastIndexOf("ashita");

        // 📃equals: 대소문자 구분 비교 / equalsIgnoreCase: 대소문자 구분안하고 비교
        String helloWorld = "Hello World";
        String newStringHelloWorld = new String(helloWorld);
        String helloWorldUpperCase = "HELLO WORLD";
        boolean equals1 = helloWorld.equals(newStringHelloWorld);
        boolean equals2 = helloWorld.equals(helloWorldUpperCase);
        boolean equalsIgnoreCase1 = helloWorld.equalsIgnoreCase(newStringHelloWorld);
        boolean equalsIgnoreCase2 = helloWorld.equalsIgnoreCase(helloWorldUpperCase);

        String fightMusic = "sousa itsumo bokurawa issyouni";
        boolean contains = fightMusic.contains("itsu");
        boolean notContains = fightMusic.contains("mama");
        // 📃startsWith: (주어진 위치에서) 해당 문자열로 시작 여부
        boolean startsWith = fightMusic.startsWith("sousa");
        boolean notStartWith = fightMusic.startsWith("bokura");
        int indexItsumo = fightMusic.indexOf("itsumo");
        boolean startIndexWith = fightMusic.startsWith("itsumo",indexItsumo);
        // 📃endsWith: 해당 문자열로 끝남 여부
        boolean endsWith = fightMusic.endsWith("issyouni");
        boolean endsWithAbt = fightMusic.endsWith("i");
        boolean endsWithStr = fightMusic.endsWith("ssyouni");
        boolean notEndsWith = fightMusic.endsWith("itsumo");

        // 📃 matches: 정규표현식 일치 여부
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String validEmail = "kjiyu@test.co.kr";
        String invalidEmail1 = "kjiyu@kr";
        String invalidEmail2 = "kjiyu.co.kr";
        boolean matchesValid = validEmail.matches(emailRegex);
        boolean matchesInvalid1 = invalidEmail1.matches(emailRegex);
        boolean matchesInvalid2 = invalidEmail2.matches(emailRegex);

        // 📃 compareTo: 사전순 비교하여 0,양수,음수 반환
        String ABCD = "ABCD";
        String ABCDE = "ABCDE";
        String ABCDEFG = "ABCDEFG";
        String ZYX = "ZYX";
        int sameCompareTo = ABCD.compareTo(ABCD);
        int sameStartCompareTo1 = ABCD.compareTo(ABCDE);
        int sameStartCompareTo2 = ABCD.compareTo(ABCDEFG);
        int sameStartCompareTo3 = ABCD.compareTo(ABCDE);
        int diffStartCompareTo = ABCD.compareTo(ZYX);
        
        // 📃 toUpperCase / toLowerCase : 대/소문자 변환

        // 📃 substring: n번째 문자부터 (n번째 문자까지) 잘라서 반환
        String maboroshi = "april san our child became the fantom.";
        String san = maboroshi.substring(6);
        String ourChild = maboroshi.substring(10,19);
    }
}
