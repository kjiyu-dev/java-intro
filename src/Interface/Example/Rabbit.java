package Interface.Example;

import Interface.Example.Abstract.Mammal;
import Interface.Example.Interface.Prey;

public class Rabbit extends Mammal implements Prey {
    public Rabbit() {
        super(true);
    }

    @Override
    public void run() {
        System.out.println("튀튀");
    }
}
