package Singleton.Example.ex02;

public class Setting {
    private int volume = 5;

    public int getVolume() {
        return volume;
    }

    public void increaseVol() { volume++; }
    public void decreaseVol() { volume--; }
}
