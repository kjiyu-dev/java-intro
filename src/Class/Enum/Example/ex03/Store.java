package Class.Enum.Example.ex03;

public class Store {
    // static 제거 - 매번 최신 상태의 메뉴들을 가져옴
    public ChickenMenu[] menus = ChickenMenu.values();

    public void takeOrder (String menuName) {
        ChickenMenu ordered = null;


        for (ChickenMenu menu : menus) {
            if (menu.getName().equals(menuName)) {
                ordered = menu;
                break;  // 찾았으면 반복문 종료!
            }
        }

        if (ordered == null) {
            System.out.println("해당 메뉴가 없습니다");
            return;
        }

        System.out.println(
                ordered.getPrice() + "원입니다"
        );
    }
}
