package Animais;

public class Cachorro extends Animal {
    private String estadoDeEspirito;

    public Cachorro(String nome, String raca, double peso) {
        super(nome, raca, peso);
    }

    public String estadoEspirito(String acao){
        switch (acao.toLowerCase()){
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "briga":
                this.estadoDeEspirito = "Bravo";
                break;
            case "pisa":
                this.estadoDeEspirito = "Triste";
                break;
            default:
                this.estadoDeEspirito = "Neutro";
        }
        return estadoDeEspirito;
    }
    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    @Override
    public String soar() {
        return "Ua ua";
    }
}