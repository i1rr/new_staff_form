package au.com.recruit.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {
    private int id;
    private String tfn;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String address;
    private String suburb;
    private String state;
    private String postcode;
    private String phone;
    private String email;
    private String emergencyContact;
    private String emergencyPhone;
    private String emergencyEmail;
    private double salary;
    private String position;
    private String department;
    private LocalDate startDate;
    private LocalDate endDate;
    private String notes;

    private String bankAccountName;
    private String bankBsb;
    private String bankAccount;
    private String superFund;
    private String superFundNumber;

    private double annualTax;
    private double annualSuper;
    private double annualNetIncome;
}
