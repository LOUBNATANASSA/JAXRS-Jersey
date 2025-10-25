package JAXRS.Jersey.repositories;

import JAXRS.Jersey.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
