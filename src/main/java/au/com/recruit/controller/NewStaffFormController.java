package au.com.recruit.controller;

import au.com.recruit.model.Employee;
import au.com.recruit.service.SimpleTaxService;
import au.com.recruit.service.TaxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewStaffFormController {
    @GetMapping({"/", "/index"})
    public String getIndex() {
        return "index";
    }

    @PostMapping("/summary")
    public String getSummary(@ModelAttribute Employee employee, Model model) {
        TaxService taxService = new SimpleTaxService();
        employee.setAnnualTax(taxService.getAnnualTax(employee.getSalary()));
        employee.setAnnualNetIncome(taxService.getNetSalary(employee.getSalary()));
        employee.setAnnualSuper(taxService.getAnnualSuper(employee.getSalary(), 0));

        model.addAttribute("employee", employee);
        return "result";
    }
}
