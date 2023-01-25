package au.com.recruit.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTaxServiceTest {


    TaxService ts = new SimpleTaxService();

    @Test
    void getAnnualTaxWhenSalaryIsLessThan18200() {
        double annualSalary = 18199;
        double expectedTax = 0;
        double actualTax = ts.getAnnualTax(annualSalary);
        assertEquals(expectedTax, actualTax);
    }

    @Test
    void getAnnualTaxWhenSalaryIsBetween18200And37000() {
        double annualSalary = 18201;
        double expectedTax = (18201 - 18200) * 0.19;
        double actualTax = ts.getAnnualTax(annualSalary);
        assertEquals(expectedTax, actualTax);
    }

    @Test
    void getAnnualTaxWhenSalaryIsBetween37000And90000() {
        double annualSalary = 90000;
        double expectedTax = 3572 + (90000 - 37000) * 0.325;
        double actualTax = ts.getAnnualTax(annualSalary);
        assertEquals(expectedTax, actualTax);
    }

    @Test
    void getAnnualTaxWhenSalaryIsBetween90000And180000() {
        double annualSalary = 123456;
        double expectedTax = 20797 + (123456 - 90000) * 0.37;
        double actualTax = ts.getAnnualTax(annualSalary);
        assertEquals(expectedTax, actualTax);
    }

    @Test
    void getAnnualTaxWhenSalaryIsGreaterThan180000() {
        double annualSalary = 1234567;
        double expectedTax = 54097 + (1234567 - 180000) * 0.45;
        double actualTax = ts.getAnnualTax(annualSalary);
        assertEquals(expectedTax, actualTax);
    }

    @Test
    void getAnnualSuper() {
        double annualSalary = 1234567;
        double superRateInPercentage = 10.5;
        double expectedSuper = annualSalary * superRateInPercentage / 100;
        double actualSuper = ts.getAnnualSuper(annualSalary, superRateInPercentage);
        assertEquals(expectedSuper, actualSuper);
    }

    @Test
    void getNetSalary() {
        double annualSalary = 1234567;
        double expectedNetSalary = annualSalary - ts.getAnnualTax(annualSalary);
        double actualNetSalary = ts.getNetSalary(annualSalary);
        assertEquals(expectedNetSalary, actualNetSalary);
    }
}