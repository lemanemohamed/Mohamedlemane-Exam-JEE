package net.ln.exambackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ln.exambackend.enumeration.StatusContrat;
import org.hibernate.Length;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = "typeContrat",length = 100)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ContratAssurance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateSouscription;
    @Enumerated(EnumType.STRING)
    private StatusContrat statut;
    private Date dateValidation;
    private double montantcotisation;
    private int dureeContrat;
    private double tauxCouverture;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "contratAssurance")
    private List<Paiement> paiementList;
}
