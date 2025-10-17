package Singleton.Example.ex02;

public class Main {
    public static void main(String[] args) {
        // 공유시킬 인스턴스
        Setting setting = new Setting();

        // ⏭️ 방법1: 생성자로 주입
        Tab tab1 = new Tab(setting);
        Tab tab2 = new Tab(setting);

        // ⏭️ 방법2: 세터로 주입
        Tab tab3 = new Tab();
        tab3.setSetting(setting);

        System.out.println(tab1.getSetting().getVolume());
        System.out.println(tab2.getSetting().getVolume());
        System.out.println(tab3.getSetting().getVolume());

        System.out.println(". . . .");

        tab1.getSetting().increaseVol();
        tab1.getSetting().increaseVol();

        System.out.println(tab1.getSetting().getVolume());
        System.out.println(tab2.getSetting().getVolume());
        System.out.println(tab3.getSetting().getVolume());
    }
}
