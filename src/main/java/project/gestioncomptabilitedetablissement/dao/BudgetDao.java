package project.gestioncomptabilitedetablissement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.gestioncomptabilitedetablissement.bean.Budget;

import java.util.List;
import java.util.Optional;

@Repository
public interface BudgetDao extends JpaRepository<Budget,Long> {
    Budget findByReferenceBudget(String ref);
    void deleteById(Long id);
    List<Budget> findAllByAnnee(int annee);
    Budget findByAnnee(int Id);
}
