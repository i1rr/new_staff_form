package au.com.recruit.service;

import java.math.BigDecimal;

public class SimpleTaxService implements TaxService {
    @Override
    public double getAnnualTax(double annualSalary) {
        double tax;

        if (annualSalary <= 18200) {
            tax = 0;
        } else if (annualSalary <= 37000) {
            tax = (annualSalary - 18200) * 0.19;
        } else if (annualSalary <= 90000) {
            tax = 3572 + (annualSalary - 37000) * 0.325;
        } else if (annualSalary <= 180000) {
            tax = 20797 + (annualSalary - 90000) * 0.37;
        } else {
            tax = 54097 + (annualSalary - 180000) * 0.45;
        }
        return tax;
    }

    @Override
    public double getAnnualSuper(double annualSalary, double superRateInPercentage) {
        superRateInPercentage = superRateInPercentage == 0 ? 10.5 : superRateInPercentage;
        return annualSalary * superRateInPercentage / 100;
    }

    @Override
    public double getNetSalary(double annualSalary) {
        return annualSalary - getAnnualTax(annualSalary);
    }
}
