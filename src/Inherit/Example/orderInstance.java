package Inherit.Example;

public class orderInstance {
    public static void main(String[] args) {
        OrderDT orderDT = new OrderDT(1, "강남");

        orderDT.takeHallOrder();
        orderDT.takeDtOrder();
        orderDT.setDtOpen(false);
        orderDT.takeDtOrder();
    }
}
