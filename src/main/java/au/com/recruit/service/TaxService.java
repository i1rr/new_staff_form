package au.com.recruit.service;

public interface TaxService {
    double getAnnualTax(double annualSalary);
    double getAnnualSuper(double annualSalary, double superRateInPercentage);
    double getNetSalary(double annualSalary);
}
