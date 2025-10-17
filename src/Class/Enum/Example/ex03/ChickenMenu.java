package Class.Enum.Example.ex03;

public enum ChickenMenu {
    // ⏭️ 클래스처럼 필드,생성자,메소드를 가질 수 있다
    FR("후라이드", 10000, 0),
    YN("양념치킨", 12000, 1),
    GJ("간장치킨", 12000, 0),
    RS("로제치킨", 14000, 0),
    PP("땡초치킨", 13000, 2),
    XX("폭렬치킨", 13000, 3);

    private String name;
    private int price;
    private int spicyLevel;

    ChickenMenu(String name, int price, int spicyLevel) {
        this.name = name;
        this.price = price;
        this.spicyLevel = spicyLevel;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        String pepper = "";
        if (spicyLevel > 0) {
            pepper = "🔥".repeat(spicyLevel);
        }

        return "%s (%d원) %s".formatted(name,price,(pepper.trim().isBlank() ? "" : "맵기 : " + pepper));
    }
}
