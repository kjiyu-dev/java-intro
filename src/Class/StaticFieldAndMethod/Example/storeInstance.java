package Class.StaticFieldAndMethod.Example;

import java.util.Scanner;

public class storeInstance {
    public static void main(String[] args) {
        String brand = Store.staticName;
        String contact = Store.contact();

        Scanner sc = new Scanner(System.in);
        
        for (var i = 0; i < 3; i++) {
            System.out.print("매장 이름을 입력하세요: ");
            String name = sc.next();
            Store newStore = new Store(name);
            String intro = newStore.intro();
            System.out.println(intro);
        }
    }
}
