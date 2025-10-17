package Interface.Example;

import Interface.Example.Abstract.Mammal;
import Interface.Example.Interface.Hunter;
import Interface.Example.Interface.Swimmer;

public class PolarBear extends Mammal implements Hunter, Swimmer {
    public PolarBear() {
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position + " : 물범사냥");
    }
    
    @Override
    public void swim() {
        System.out.printf("앞발로 수영");
    }

}
