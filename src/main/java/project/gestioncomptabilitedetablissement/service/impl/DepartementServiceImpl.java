package project.gestioncomptabilitedetablissement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.gestioncomptabilitedetablissement.bean.Budget;
import project.gestioncomptabilitedetablissement.bean.Departement;
import project.gestioncomptabilitedetablissement.dao.BudgetDao;
import project.gestioncomptabilitedetablissement.dao.DepartmentDao;
import project.gestioncomptabilitedetablissement.service.facade.BudgetService;
import project.gestioncomptabilitedetablissement.service.facade.DepartementService;

import java.util.List;

@Service
public class DepartementServiceImpl implements DepartementService {
    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public int save(Departement departement) {
        Departement check=findByCode(departement.getCode());
        if(check!=null)
        {
            return -1;
        }
        else{
            Departement newDepartement=new Departement();
            newDepartement.setCode(departement.getCode());
            newDepartement.setLibelle(departement.getLibelle());
            departmentDao.save(newDepartement);
            return 1;
        }
    }

    @Override
    public int update(Departement departement) {
        Departement check=findByCode(departement.getCode());
        if(check==null)
        {
            return -1;
        }
        else{
            check.setCode(check.getCode());
            check.setLibelle(check.getLibelle());
            departmentDao.save(check);
            return 1;
        }
    }

    @Override
    public int deleteBudget(String code) {
        Departement check = findByCode(code);
        if(check==null)
        {
            return -1;
        }
        else{
            departmentDao.deleteById(check.getId());
            return 1;
        }
    }

    @Override
    public Departement findByCode(String code) {
        return departmentDao.findByCode(code);
    }

    @Override
    public List<Departement> findAll(String libelle) {
        return departmentDao.findByLibelle(libelle);
    }
}
