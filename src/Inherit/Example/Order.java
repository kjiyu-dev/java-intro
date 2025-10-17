package Inherit.Example;

public class Order {
    protected int storeNo;
    protected String storeName;

    public Order (int storeNo, String storeName) {
        this.storeNo = storeNo;
        this.storeName = storeName;
    }

    public void takeHallOrder () {
        System.out.printf("%d호 %s점 홀 주문 받음%n", storeNo, storeName);
    }
}
