package project.gestioncomptabilitedetablissement.service.facade;

import project.gestioncomptabilitedetablissement.bean.Budget;
import project.gestioncomptabilitedetablissement.bean.Departement;

import java.util.List;

public interface DepartementService {
    int save(Departement departement);
    int update(Departement departement);
    int deleteBudget(String code);
    Departement findByCode(String code);
    List<Departement> findAll(String libelle);
}
