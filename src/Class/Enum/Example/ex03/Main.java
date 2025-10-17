package Class.Enum.Example.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChickenMenu menu1 = ChickenMenu.FR;
        ChickenMenu menu2 = ChickenMenu.YN;
        ChickenMenu menu3 = ChickenMenu.RS;

        String menu1Name = menu1.getName();
        String menu2Desc = menu2.getDesc();

        menu2.setPrice(13500);
        int menu2Price = menu2.getPrice();
        System.out.println(menu2Price);
        System.out.println(menu2Desc);

        ChickenMenu[] byNames = new ChickenMenu[] {
//                ChickenMenu.valueOf("VV"), ⏭️ 없어서 런타임에러
                ChickenMenu.valueOf("FR"),
                ChickenMenu.valueOf("PP"),
                ChickenMenu.valueOf("GJ"),
        };

        String[] names = new String[] {
                menu1.name(), menu2.name(), menu3.name()
        };

        // ⏭️ ordinal 메소드 : 순번 반환
        int[] orders = new int[] {
                menu1.ordinal(), menu2.ordinal(), menu3.ordinal()
        }; // [0, 1, 3]


        System.out.println(" . . . . ");

        Scanner scanner = new Scanner(System.in);
        Store stores = new Store();

        System.out.println("드시고 싶은 메뉴를 골라주세요");
        System.out.println(" --- 메뉴 목록 ---");
        for (ChickenMenu menu : stores.menus) {
            System.out.println(menu.getDesc());
        }

        String orderMenu = scanner.nextLine();
        stores.takeOrder(orderMenu);
    }
}
