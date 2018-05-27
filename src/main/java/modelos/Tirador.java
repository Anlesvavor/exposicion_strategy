package modelos;

import Interfaces.EstrategiaDisparar;
import Interfaces.EstrategiaMelee;

public class Tirador {

    private EstrategiaDisparar estrategiaDisparar;
    private EstrategiaMelee estrategiaMelee;



    public Tirador() {
        setEstrategiaMelee(new Daga());
    }

    public Tirador(EstrategiaDisparar estrategiaDisparar, EstrategiaMelee estrategiaMelee) {
        this.estrategiaDisparar = estrategiaDisparar;
        this.estrategiaMelee = estrategiaMelee;
    }

    public void atacarADistancia(){
        getEstrategiaDisparar().Disparar();
    }

    public void atacarACuerpoACuerpo(){
        getEstrategiaMelee().atacar();
    }

    public EstrategiaDisparar getEstrategiaDisparar() {
        return estrategiaDisparar;
    }

    public void setEstrategiaDisparar(EstrategiaDisparar estrategiaDisparar) {
        this.estrategiaDisparar = estrategiaDisparar;
    }

    public EstrategiaMelee getEstrategiaMelee() {
        return estrategiaMelee;
    }

    public void setEstrategiaMelee(EstrategiaMelee estrategiaMelee) {
        this.estrategiaMelee = estrategiaMelee;
    }

}
