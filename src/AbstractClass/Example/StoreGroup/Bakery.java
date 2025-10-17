package AbstractClass.Example.StoreGroup;

public class Bakery extends StoreGroup {
    public static String getSausage() {
        return ADS.formatted("피자빵은");
    }
    protected static int lastNo = 0;

    private boolean isTakeOut;

    public Bakery(String name, boolean isTakeOut) {
        super(++lastNo, name);
        this.isTakeOut = isTakeOut;
    }

    @Override
    public void takeOrder() {
        System.out.printf("지유카페 %s 음료를 주문해주세요", super.intro());
        if (!isTakeOut) System.out.println("매장에서 드시겠나요?");
    }

}
