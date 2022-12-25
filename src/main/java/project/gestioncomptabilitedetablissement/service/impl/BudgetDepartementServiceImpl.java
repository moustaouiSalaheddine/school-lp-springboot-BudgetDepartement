package project.gestioncomptabilitedetablissement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.gestioncomptabilitedetablissement.bean.Budget;
import project.gestioncomptabilitedetablissement.bean.BudgetDepartement;
import project.gestioncomptabilitedetablissement.bean.Departement;
import project.gestioncomptabilitedetablissement.dao.BudgetDepartementDao;
import project.gestioncomptabilitedetablissement.process.budget.BudgetSaveRequest;
import project.gestioncomptabilitedetablissement.service.facade.BudgetDepartementService;
import project.gestioncomptabilitedetablissement.service.facade.BudgetService;
import project.gestioncomptabilitedetablissement.service.facade.DepartementService;

import java.util.List;

@Service
public class BudgetDepartementServiceImpl implements BudgetDepartementService {
    @Autowired
    private BudgetService budgetService;
    @Autowired
    private BudgetDepartementDao budgetDepartementDao;

    @Autowired
    private DepartementService departementService;


    @Override
    public List<BudgetDepartement> findAll(String ref) {
        return null;
    }

    @Override
    public BudgetDepartement findByRef(String ref) {
        return budgetDepartementDao.findByReferenceBudget(ref);
    }

    @Override
    public int deleteByRef(String ref) {
        return 0;
    }

    @Override
    public int update(BudgetDepartement budgetDepartement) {
        return 0;
    }
}
