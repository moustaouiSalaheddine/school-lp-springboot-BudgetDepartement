package project.gestioncomptabilitedetablissement.process.budget;

import project.gestioncomptabilitedetablissement.bean.Budget;
import project.gestioncomptabilitedetablissement.bean.BudgetDepartement;
import project.gestioncomptabilitedetablissement.bean.Departement;
import project.gestioncomptabilitedetablissement.service.facade.BudgetDepartementService;
import project.gestioncomptabilitedetablissement.service.facade.BudgetService;
import project.gestioncomptabilitedetablissement.service.facade.DepartementService;

public class BudgetSaveProcessImpl implements  BudgetSaveProcess{

    private BudgetService budgetService;
    private BudgetDepartementService budgetDepartementService;
    private DepartementService departementService;

    public int handel(BudgetSaveRequest budgetSaveRequest) {
        Budget budget = budgetService.findByRef(budgetSaveRequest.getReferenceBudget());
        budgetSaveRequest.setBudget(budget);

        Departement departement = departementService.findByCode(budgetSaveRequest.getCodeDepartement());
        budgetSaveRequest.setDepartement(departement);

        int res = validate(budgetSaveRequest);
        if (res > 0) {
            BudgetDepartement budgetDepartement = new BudgetDepartement();
            budgetDepartement.setDepartement(budgetSaveRequest.getDepartement());
            budgetDepartement.setReferenceBudget(budgetSaveRequest.getBudget());
            budgetDepartement.setDescription(budgetSaveRequest.getDescription());
            budgetDepartement.setMontantInvistessement(budgetSaveRequest.getMontantInvistessement());
            budgetDepartement.setMontantFonctionement(budgetSaveRequest.getMontantFonctionement());
            budgetDepartementService.save(budgetDepartement);
            return 1;
        }
        return res;
    }

    public int validate(BudgetSaveRequest budgetSaveRequest) {
        if (budgetSaveRequest.getBudget() == null) {
            return -1;
        } else if (budgetSaveRequest.getDepartement() == null) {
            return -2;
        } else {
            return 1;
        }
    }

    public BudgetSaveProcessImpl(BudgetService budgetService, BudgetDepartementService budgetDepartementService, DepartementService departementService) {
        this.budgetService = budgetService;
        this.budgetDepartementService = budgetDepartementService;
        this.departementService = departementService;
    }
}
