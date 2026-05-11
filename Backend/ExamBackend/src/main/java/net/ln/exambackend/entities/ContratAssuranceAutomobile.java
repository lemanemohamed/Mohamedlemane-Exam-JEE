package net.ln.exambackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ln.exambackend.enumeration.StatusContrat;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("CAautou")
public class ContratAssuranceAutomobile extends ContratAssurance {
    private int numéroImmatriculation;
    private  String marqueVéhicule;
    private String modèleVéhicule;
}
