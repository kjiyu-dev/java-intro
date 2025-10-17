package AbstractClass.Example.StoreGroup;


public class storeMain {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("명동");
        Pizza pizza2 = new Pizza("왕십리");

        Bakery bakery1 = new Bakery("천호",true);
        Bakery bakery2 = new Bakery("성수", false);

        StoreGroup[] stores = {
                pizza1, pizza2,
                bakery1, bakery2
        };

        for (StoreGroup store : stores) {
            store.takeOrder();
        }

        System.out.println(Pizza.getSausage());
        System.out.println(Bakery.getSausage());
    }
}
