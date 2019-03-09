package LoanPackage.model;

import java.util.Date;

import LoanPackage.service.NipValidator;
import LoanPackage.service.PeselValidator;

public class Applicant {
    private String firstName;
    private String lastName;
    private String pesel;
    private String employerNip;
    private String bankAccount;
    private Date dateOfBirth;
    private boolean valid;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public String getEmployerNip() {
        return employerNip;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isValid() {
        return this.valid;
    }

    public Applicant(
            String firstName,
            String lastName,
            String pesel,
            String nip,
            String bankAccount,
            Date dateOfBirth
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.employerNip = nip;
        this.bankAccount = bankAccount;
        this.dateOfBirth = dateOfBirth;
        this.valid = this.validateFields();
    }

    private boolean validateFirstName() {
        return this.lastName.length() > 2;
    }

    private boolean validateLastName() {
        return this.lastName.length() > 2;
    }

    private boolean validatePesel() {
        PeselValidator peselValidator = new PeselValidator(this.pesel);
        return peselValidator.isValid();
    }

    private boolean validateEmployerNip() {
        NipValidator nipValidator = new NipValidator(this.employerNip);
        return nipValidator.isValid();
    }

    private boolean validateBankAccount() {
        return true;
    }

    private boolean validateFields() {
        boolean areAllValid = true;
        if (!this.validateFirstName()) {
            areAllValid = false;
        }
        if (!this.validateLastName()) {
            areAllValid = false;
        }
        if (!this.validatePesel()) {
            areAllValid = false;
        }
        if (!this.validateEmployerNip()) {
            areAllValid = false;
        }
        if (!this.validateBankAccount()) {
            areAllValid = false;
        }
        return areAllValid;
    }
}
