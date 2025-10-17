package Singleton.Example.singletonEx;
// 💡Singleton: 프로그램상에서 특정 인스턴스가 딱 하나만 있어야 할 때
// 멀티쓰레딩 환경에서 공유되는 리소스, 기타전역으로 공유되는 리소스가 필요한 경우
// ⏭️ 여기가 싱글톤
public class Setting {
    // 클래스(정적)필드
    // 프로그램에서 메모리에 하나만 존재
    private static Setting setting;

    // ⏭️ 생성자를 private로: 외부에서 생성자로 생성 못하게
    private Setting() {}

    // 공유되는 인스턴스를 받아가는 public 클래스 메소드
    public static Setting getInstance() {
        // ⏭️ 아직 인스턴스가 만들어지지 않았다면 생성
        // 프로그램 처음 호출시 실행된다
        if (setting == null) {
            setting = new Setting();
        }
        return setting;
    }

    private int vol = 5;

    public int getVol() {
        return vol;
    }

    public void increaseVol() { vol++ ;}
    public void decreaseVol() { vol-- ;}
}
