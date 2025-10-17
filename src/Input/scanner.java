package Input;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // 💡 Scanner: 키보드 입력이나 파일 등으로 부터 텍스트 값을 받아오기 위한 클래스
        // 📃 System.in : inputStream의 인스턴스로, 입력받은 값들의 호출
        Scanner sc = new Scanner(System.in);

        // 📃 next: 스페이스를 단위로 끊어서 문자열 받음
        // 📃 nextLine: 줄바꿈 엔터 단위로 끊어서 문자열 받음
        System.out.println("적고 싶은 문자를 세 번 입력해주세요");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        System.out.println("불린, 인트넘, 더블넘");
        boolean bool = sc.nextBoolean();
        int intNum = sc.nextInt();
        double dblNum = sc.nextDouble();

        System.out.println("bool: " + bool);
        System.out.println("intNum: " + intNum);
        System.out.println("dblNum: " + dblNum);

        sc.close();

    }
}
