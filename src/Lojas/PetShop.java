package Lojas;

import Animais.Animal;

public class PetShop {
    public String banhar(Animal animal){
        return animal.getNome() + " banhou!";
    }

    public String tosar(Animal animal){
        return animal.getNome() + " tosado!";
    }

    public String consultar(Animal animal){
        return animal.getNome() + " consultado!";
    }
}
