package Class.Example;

public class slimeInstance {
    public static void main(String[] args) {
        Slime slime1 = new Slime();
        Slime slime2 = new Slime();

        slime1.setAttack(slime2);
        System.out.println(slime2);
    }
}
