package project.gestioncomptabilitedetablissement.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.gestioncomptabilitedetablissement.bean.Budget;
import project.gestioncomptabilitedetablissement.dao.BudgetDao;
import project.gestioncomptabilitedetablissement.service.facade.BudgetService;

import java.util.List;
import java.util.Optional;

@Service
public class BudgetServiceImpl implements BudgetService {
    @Autowired
    private BudgetDao budgetDao;

    @Override
    public int save(Budget budget) {
        Budget check=findByRef(budget.getRef());
        if(check!=null)
        {
            return -1;
        }
        else{
            Budget newBudget=new Budget();
            newBudget.setRef(budget.getRef());
            newBudget.setAnnee(budget.getAnnee());
            newBudget.setDescription(budget.getDescription());
            newBudget.setMontantFonctionement(budget.getMontantFonctionement());
            newBudget.setMontantInvistessement(budget.getMontantInvistessement());
            budgetDao.save(newBudget);
            return 1;
        }

    }

    @Override
    public int update(Budget budget) {
        Budget check=findByRef(budget.getRef());
        if(check==null)
        {
            return -1;
        }
        else{
            budgetDao.save(check);
            return 1;
        }
    }

    @Override
    public int deleteBudget(String ref) {
        Budget check = findByRef(ref);
        if(check==null)
        {
            return -1;
        }
        else{
            budgetDao.deleteById(check.getId());
            return 1;
        }
    }
    @Override
    public Budget findByRef(String ref) {
        return budgetDao.findByReferenceBudget(ref);
    }
    @Override
    public List<Budget> findAll(int annee) {
        return budgetDao.findAllByAnnee(annee);
    }
}
