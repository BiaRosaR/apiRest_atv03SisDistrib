package sptech.school.formula1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pilotos")
public class PilotoController {

    private final PilotoRepository repository;

    public PilotoController(PilotoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Piloto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Piloto adicionar(@RequestBody Piloto piloto) {
        return repository.save(piloto);
    }

    @GetMapping("/{nome}")
    public Piloto buscarPorNome(@PathVariable String nome) {
        return repository.findByNome(nome).orElseThrow(() -> new RuntimeException("Piloto não encontrado"));
    }
}
