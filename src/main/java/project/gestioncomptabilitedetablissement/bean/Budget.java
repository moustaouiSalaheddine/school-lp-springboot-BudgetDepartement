package project.gestioncomptabilitedetablissement.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String referenceBudget;
    private int annee;
    @OneToMany
    private List<BudgetDepartement> budgetDepartements;

    public String getRef() {
        return referenceBudget;
    }

    public void setRef(String ref) {
        this.referenceBudget = ref;
    }

    private double montantInvistessement;
    private double montantFonctionement;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getMontantInvistessement() {
        return montantInvistessement;
    }

    public void setMontantInvistessement(double montantInvistessement) {
        this.montantInvistessement = montantInvistessement;
    }

    public double getMontantFonctionement() {
        return montantFonctionement;
    }

    public void setMontantFonctionement(double montantFonctionement) {
        this.montantFonctionement = montantFonctionement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
