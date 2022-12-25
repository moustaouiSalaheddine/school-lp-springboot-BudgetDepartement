package project.gestioncomptabilitedetablissement.process.budget;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.gestioncomptabilitedetablissement.service.facade.BudgetDepartementService;
import project.gestioncomptabilitedetablissement.service.facade.BudgetService;
import project.gestioncomptabilitedetablissement.service.facade.DepartementService;

@Configuration
public class BudgetInjector { //DDD :: Domain Driven Design :: process (frameword + conception metier plutot que conception BD/OO)
    @Bean
    public BudgetSaveProcess budgetSaveProcess(BudgetService budgetService, BudgetDepartementService budgetDepartementService, DepartementService departementService) {
        return new BudgetSaveProcessImpl(budgetService, budgetDepartementService, departementService);
    }
}
