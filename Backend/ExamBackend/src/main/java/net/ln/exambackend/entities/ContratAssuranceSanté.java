package net.ln.exambackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ln.exambackend.enumeration.Niveaucouverture;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("CAsante")
public class ContratAssuranceSanté extends ContratAssurance{
    private Niveaucouverture niveaucouverture;
    private int nbrPersonnesCouvertes;
}
