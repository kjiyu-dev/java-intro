package Singleton.Example.singletonEx;

public class Main {
    public static void main(String[] args) {
        Tab tab1 = new Tab();
        Tab tab2 = new Tab();
        Tab tab3 = new Tab();

        System.out.println(tab1.getSetting().getVol());
        System.out.println(tab2.getSetting().getVol());
        System.out.println(tab3.getSetting().getVol());

        System.out.println("\n- - - - -\n");

        tab1.getSetting().increaseVol();
        tab1.getSetting().increaseVol();

        System.out.println(tab1.getSetting().getVol());
        System.out.println(tab2.getSetting().getVol());
        System.out.println(tab3.getSetting().getVol());
        // 7,7,7
    }
}
