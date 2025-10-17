package String;

public class formatting {
    public static void main(String[] args) {
        // 📃 %b: 불리언 | %d: 정수 | %f: 실수 | %c: 문자 | %s: 문자열(및 모든 자료형) | %n: 포맷 문자열 내 바꿈
        // 📃 formatted(파라미터값) , String.format(셋팅문자열, 파라미터값)
        String jikoSyoukai = "안녕하세요, 저는 %s입니다. %d살입니다.";
        String inputJikoSyoukai = jikoSyoukai.formatted("김지유",29);
        String inputJikoSyoukaiMukasi = String.format(jikoSyoukai,"김지유",29);
    }
}
