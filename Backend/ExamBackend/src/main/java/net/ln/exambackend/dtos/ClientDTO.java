package net.ln.exambackend.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ln.exambackend.entities.ContratAssurance;

import java.util.List;

@Data
public class ClientDTO {
    private long id;
    private String nom;
    private String email;

}
