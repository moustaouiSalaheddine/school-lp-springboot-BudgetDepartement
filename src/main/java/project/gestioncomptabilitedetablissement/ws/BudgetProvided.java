package project.gestioncomptabilitedetablissement.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.gestioncomptabilitedetablissement.bean.Budget;
import project.gestioncomptabilitedetablissement.process.budget.BudgetSaveProcess;
import project.gestioncomptabilitedetablissement.service.facade.BudgetService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/budget")
public class BudgetProvided {
    @Autowired
    private BudgetService budgetService;
    @Autowired
    private BudgetSaveProcess budgetSaveProcess;
    @PostMapping("/")
    public int save(@RequestBody Budget data)
    {
        return budgetService.save(data);
    }
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Long id)
    {
        return budgetService.deleteBudget(id);
    }
    @GetMapping("/{id}")
    public Optional<Budget> findById(@PathVariable Long id)
    {
        return budgetService.findById(id);
    }
    @GetMapping("/findAll/{annee}")
    public List<Budget> findAllByAnne(@PathVariable int annee)
    {
        return budgetService.findAll(annee);
    }

    @PutMapping("/")
    public int update(@RequestBody Budget data)
    {
        return budgetService.update(data);
    }
}
