package modelos;

import Interfaces.EstrategiaDisparar;
import Interfaces.EstrategiaMelee;

public class Sable implements EstrategiaMelee {
    public void atacar() {
        System.out.println("wusssh");
    }
}
