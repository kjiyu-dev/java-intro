package Class.AccessModifier.Example;

public class galaxyInstance {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();

        String pb = samsung.powerButton;
        String ss = samsung.sdCardSlot;
        // String cu = samsung.cpu; // ⏭️ 불가능!
    }
}
