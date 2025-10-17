package Class.GetterAndSetter.Example;

public class productInstance {
    public static void main(String[] args) {
        Product pen = new Product("펜",500);

        pen.setName("빨간펜");
        pen.setPrice(5000);

        System.out.println(pen);
    }
}
