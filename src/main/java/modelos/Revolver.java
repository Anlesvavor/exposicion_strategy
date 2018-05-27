package modelos;

import Interfaces.EstrategiaDisparar;

public class Revolver implements EstrategiaDisparar {

    public void Disparar() {
        System.out.println("bang bang bang bang bang");
    }
}
