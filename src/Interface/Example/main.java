package Interface.Example;

import Interface.Example.Abstract.Mammal;
import Interface.Example.Interface.Hunter;
import Interface.Example.Interface.Swimmer;

public class main {
    public static void main(String[] args) {
        PolarBear polarBear = new PolarBear();
        Mammal mammal = polarBear;
        Swimmer swimmer = polarBear;

        Lizard lizard = new Lizard();
        Eagle eagle = new Eagle();

        Rabbit rabbit = new Rabbit();

        Hunter[] hunters = {
          polarBear, lizard, eagle
        };

        for (Hunter hunter : hunters) {
            hunter.hunt();
        }

        rabbit.run();
    }
}
