package Animais;

public class Gato extends Animal {

    public Gato(){

    }

    public Gato(String nome, String raca, double peso) {
        super(nome, raca, peso);
    }

    @Override
    public String soar() {
        return "Miau";
    }
}
