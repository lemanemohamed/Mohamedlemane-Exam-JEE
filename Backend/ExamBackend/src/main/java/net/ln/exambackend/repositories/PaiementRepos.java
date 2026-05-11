package net.ln.exambackend.repositories;

import net.ln.exambackend.entities.Client;
import net.ln.exambackend.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepos extends JpaRepository<Paiement,Long> {
}
