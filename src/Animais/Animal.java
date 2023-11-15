package Animais;

public abstract class Animal {
    private String nome;
    private String raca;
    private double peso;

    public Animal(String nome, String raca, double peso){
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public Animal() {

    }

    public abstract String soar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
