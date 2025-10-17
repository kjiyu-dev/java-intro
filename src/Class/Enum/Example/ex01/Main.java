package Class.Enum.Example.ex01;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();
        
        button1.setButtonMode(ButtonMode.DARK);
        button1.setButtonSpace(ButtonSpace.TRIPLE);
        
         // ⏭️아래와 같은 오용 방지
        // button1.setButtonMode(ButtonSpace.DOUBLE);
        
    }
}
