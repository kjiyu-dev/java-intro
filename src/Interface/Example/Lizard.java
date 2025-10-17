package Interface.Example;

import Interface.Example.Abstract.Reptile;
import Interface.Example.Interface.Flyer;
import Interface.Example.Interface.Hunter;
import Interface.Example.Interface.Swimmer;

public class Lizard extends Reptile implements Hunter, Swimmer, Flyer {
    @Override
    public void fly() {
        System.out.println("날개막으로 활강");
    }
    
    @Override
    public void hunt() {
        System.out.println(position + ": 벌레 사냥");
    }
    
    @Override
    public void swim() {
        System.out.println("꼬리로 수영");
    }
}
