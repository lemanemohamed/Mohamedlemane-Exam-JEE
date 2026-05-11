package net.ln.exambackend.entities;

import net.ln.exambackend.enumeration.StatusContrat;

import java.util.Date;

public class ContratAssuranceAutomobile {
    private Long id;
    private Date dateSouscription;
    private StatusContrat statut;
    private Date dateValidation;
    private double montantcotisation;
    private int dureeContrat;
    private double tauxCouverture;
}
