package net.ln.exambackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ln.exambackend.enumeration.Typelogement;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("CAhabitation")
public class ContratAssuranceHabitation extends ContratAssurance {
    private Typelogement typelogement;
    private int addresslogement;
    private String supperficie;
}
