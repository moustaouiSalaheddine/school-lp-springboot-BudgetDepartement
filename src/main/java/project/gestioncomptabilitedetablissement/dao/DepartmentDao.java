package project.gestioncomptabilitedetablissement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.gestioncomptabilitedetablissement.bean.Budget;
import project.gestioncomptabilitedetablissement.bean.Departement;

import java.util.List;

@Repository
public interface DepartmentDao extends JpaRepository<Departement,Long> {
    Departement findByCode(String code);
    void deleteById(Long id);
    List<Departement> findByLibelle(String libelle);
    int deleteByCode(String code);
}
