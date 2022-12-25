package project.gestioncomptabilitedetablissement.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BudgetDepartement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @ManyToOne
    public Departement departement;
    @ManyToOne
    public Budget referenceBudget;
    public double montantInvistessement;
    public double montantFonctionement;
    public String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Budget getReferenceBudget() {
        return referenceBudget;
    }

    public void setReferenceBudget(Budget referenceBudget) {
        this.referenceBudget = referenceBudget;
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
