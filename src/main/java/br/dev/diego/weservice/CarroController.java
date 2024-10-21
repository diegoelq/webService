package br.dev.diego.weservice;

/*import br.dev.diego.weservice.Carro;*/
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private List<Carro> carros = new ArrayList<>();

    @GetMapping
    public List<Carro> getCarros() {
        return carros;
    }

    /*@PostMapping
    public Carro addCarro(@RequestBody Carro carro) {
        carros.add(carro);
        return carro;
    }*/
}