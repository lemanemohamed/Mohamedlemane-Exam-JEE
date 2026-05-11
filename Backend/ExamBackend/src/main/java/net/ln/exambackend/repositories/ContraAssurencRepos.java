package net.ln.exambackend.repositories;

import net.ln.exambackend.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepos extends JpaRepository<Client,long> {
}
