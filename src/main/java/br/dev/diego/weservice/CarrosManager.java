package br.dev.diego.weservice;
import java.util.*;

public class CarrosManager {
    private List<Carro> carros;
    public CarrosManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Fusca", "Volkswagen"));
        this.carros.add(new Carro("Onix", "Chevrolet"));
    }
    public List<Carro> getCarros(){
        return carros;
    }

    public Carro save(Carro newCarro) {

        carros.add(newCarro);

        return newCarro;

    }
}
