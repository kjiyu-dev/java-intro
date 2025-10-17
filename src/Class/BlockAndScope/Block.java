package Class.BlockAndScope;

public class Block {
    // ⏭️ { } 로 블록 생성
    // 💡 Block: 0개 이상의 statement를 묶은 단위, 제어문, 함수, 클래스에 사용, 새로운 스코프 생성
    {
        int x = 1;
        System.out.println(x);
    }

    {
        int intNum = 123;
        String str = "블록 밖은 위험해";
    }
    
     // ⏭️ 블록 안에서 선언된 것은 밖에서 사용 불가
     // intNum = 234;

    String x = "엑스";
    {
        String y = "와이";
        // ⏭️ 블록 밖에서 선언된것 안에서 사용 가능
        System.out.println(x);
        System.out.println(y);
    }


}
