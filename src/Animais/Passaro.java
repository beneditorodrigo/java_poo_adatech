package Animais;

public class Passaro extends Animal{

    public Passaro() {

    }

    public Passaro(String nome, String raca, double peso) {
        super(nome, raca, peso);
    }

    @Override
    public String soar() {
        return "Piu Piu";
    }
}
