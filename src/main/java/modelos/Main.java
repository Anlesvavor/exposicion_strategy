package modelos;

public class Main {
    public static void main(String[] args) {
        Tirador malcom = new Tirador(new Escopeta(), new Daga());
        Tirador khada = new Tirador(new Revolver(), new Sable());

        System.out.println("Malcom avista a Khada y decide enfrentarle");
        malcom.atacarADistancia();
        System.out.println("El segundo se percata");
        khada.atacarADistancia();
        System.out.println("malcom rapidamente se acerca y usa su daga");
        malcom.atacarACuerpoACuerpo();
        System.out.println("Pos 0obvio reponde khada");
        khada.atacarACuerpoACuerpo();
        malcom.setEstrategiaMelee(new Sable());
        System.out.println("Malcom empuna su sable y se corta el cuello a khada");
        malcom.atacarACuerpoACuerpo();


    }
}
