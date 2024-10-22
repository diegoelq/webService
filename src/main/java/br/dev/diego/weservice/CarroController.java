package br.dev.diego.weservice;

/*import br.dev.diego.weservice.Carro;*/
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@RestController
@RequestMapping("/api")
public class CarroController {

    private final CarrosManager carrosManager = new CarrosManager();

    @GetMapping("/carros")
    public List<Carro> all() {
        return carrosManager.getCarros();
    }

    @PostMapping
    Carro newCarro(@RequestBody Carro newCarro) {
        return carrosManager.save(newCarro);
    }
}