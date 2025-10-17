package Class.StaticFieldAndMethod.Example;

public class Store {
    static String staticName = "올리브영";
    static int staticLastNo = 0;

    static String contact() {
        return "%s입니다. 무엇을 도와드릴까요?".formatted(staticName);
    }

    int no;
    String name;

    Store( String name) {
        no = ++staticLastNo;
        this.name = name;
    }

    String intro() {
        return "하이, %s %d호 %s점 입니다.".formatted(staticName, no, name);
    }

}
