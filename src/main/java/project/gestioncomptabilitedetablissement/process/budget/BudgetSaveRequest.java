package project.gestioncomptabilitedetablissement.process.budget;

import project.gestioncomptabilitedetablissement.bean.Budget;
import project.gestioncomptabilitedetablissement.bean.Departement;

public class BudgetSaveRequest {
    public Long id;
    public String codeDepartement;
    public String referenceBudget;
    public double montantInvistessement;
    public double montantFonctionement;

    public Departement departement;
    private Budget budget;

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

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

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getReferenceBudget() {
        return referenceBudget;
    }

    public void setReferenceBudget(String referenceBudget) {
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

    public String description;
}
