package project.gestioncomptabilitedetablissement.service.facade;

import project.gestioncomptabilitedetablissement.bean.BudgetDepartement;
import project.gestioncomptabilitedetablissement.process.budget.BudgetSaveRequest;

import java.util.List;

public interface BudgetDepartementService {
    int save(BudgetSaveRequest budgetSaveRequest);
    List<BudgetDepartement> findAll(String ref);
    BudgetDepartement findByRef(String ref);
    int deleteByRef (String ref);
    int update(BudgetDepartement budgetDepartement);
}
