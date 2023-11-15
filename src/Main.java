import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.PetShop;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Perit", "Vira-Lata", 13.8);
        Animal gato = new Gato("Churrutis", "Siamês", 5.6);
        Animal passado = new Passaro("Nina", "Calopsita", 0.8);

        System.out.println(cachorro.soar());
        System.out.println(gato.soar());
        System.out.println(passado.soar());

        System.out.println(cachorro.estadoEspirito("carinho"));

        PetShop petShop = new PetShop();
        System.out.println(petShop.banhar(cachorro));
        System.out.println(petShop.consultar(gato));
        System.out.println(petShop.tosar(passado));
    }
}