package sptech.school.formula1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PilotoRepository  extends JpaRepository<Piloto, Long> {
    Optional<Piloto>
    findByNome(String nome);
}
