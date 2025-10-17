package Singleton.Example.singletonEx;

public class Tab {
    // ⏭️ 공유되는 유일한 인스턴스 받아옴
    private Setting setting = Setting.getInstance();

    public Setting getSetting() {
        return setting;
    }
}
