package project.gestioncomptabilitedetablissement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.gestioncomptabilitedetablissement.bean.BudgetDepartement;

import java.util.List;

@Repository
public interface BudgetDepartementDao extends JpaRepository<BudgetDepartement,Long> {
    BudgetDepartement findByReferenceBudget(String ref);
    int deleteByReferenceBudget(String ref);
    List<BudgetDepartement> findAllByReferenceBudget(String ref);
}
