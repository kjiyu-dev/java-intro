package AbstractClass.Example.StoreGroup;

public class Pizza extends StoreGroup{
    public static String getSausage() {
        return ADS.formatted("소세지는");
    }
    protected static int lastNo = 0;

    public Pizza(String name) {
        super(++lastNo, name);
    }

    @Override
    public void takeOrder() {
        System.out.printf("지유식당 %s 피자를 주문해주세요", super.intro());
    }
}
