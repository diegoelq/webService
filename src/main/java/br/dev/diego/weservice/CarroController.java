package br.dev.diego.weservice;

/*import br.dev.diego.weservice.Carro;*/
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@RestController
@RequestMapping("/api/carros")
public class CarroController {

    private final CarrosManager carrosManager = new CarrosManager();

    @GetMapping
    public List<Carro> all() {
        return carrosManager.getCarros();
    }

    /*@PostMapping
    public Carro addCarro(@RequestBody Carro carro) {
        carros.add(carro);
        return carro;
    }*/
}