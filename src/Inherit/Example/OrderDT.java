package Inherit.Example;

public class OrderDT extends Order {
    private boolean dtOpen = true;

    public OrderDT(int storeNo, String storeName) {
        //  📃 super: 부모 클래스(상위 클래스)를 참조하는 키워드. 자식 클래스에서 부모의 멤버에 접근할 때 사용함
        super(storeNo, storeName);
    }

    public void setDtOpen(boolean dtOpen) {
        this.dtOpen = dtOpen;
    }

    public void takeDtOrder () {
        System.out.printf("%d호 %s점 드라이브스루 주문 %s%n",storeNo, storeName, (dtOpen ? "가능" : "불가"));
    }

}

