package net.ln.exambackend.repositories;

import net.ln.exambackend.entities.Client;
import net.ln.exambackend.entities.ContratAssurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContraAssurencRepos extends JpaRepository<ContratAssurance,Long> {
}
