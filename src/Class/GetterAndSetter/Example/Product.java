package Class.GetterAndSetter.Example;

public class Product {
    private static double discount = 0.2;
    private static double increaseLimit = 1.2;

    private String name;
    private int price;

    // 생성자
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 💡 window: alt+insert -> getter/setter

    public String getName() {
        return name;
    }
    public int getPrice() {
        return (int) (price * (1 - discount));
    }

    public void setName(String name) {
        if (name.isBlank()) return;
        this.name = name;
    }
    public void setPrice(int price) {
        int max = (int) (this.price * increaseLimit);
        this.price = price < max ? price : max;
    }
}
