package project.gestioncomptabilitedetablissement.service.facade;

import project.gestioncomptabilitedetablissement.bean.Budget;

import java.util.List;
import java.util.Optional;

public interface BudgetService {
    int save(Budget budget);
    int update(Budget budget);
    int deleteBudget(String ref);
    Budget findByRef(String ref);
    List<Budget> findAll(int annee);

}
