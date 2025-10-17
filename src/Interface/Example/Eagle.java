package Interface.Example;

import Interface.Example.Abstract.Bird;
import Interface.Example.Interface.Flyer;
import Interface.Example.Interface.Hunter;

public class Eagle extends Bird implements Flyer, Hunter {
    @Override
    public void fly() {
        System.out.println("날개로 비행");
    }

    @Override
    public void hunt() {
        System.out.println(position + ": 토끼 사냥");
    }
}
