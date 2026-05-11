package net.ln.exambackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    List<ContratAssurance> contratAssuranceList;
}
