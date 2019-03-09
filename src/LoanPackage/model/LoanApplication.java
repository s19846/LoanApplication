package LoanPackage.model;

public class LoanApplication {
    private Applicant applicant;
    private boolean confirmed;
    private boolean passedBackgroundCheck;

    public Applicant getApplicant() {
        return applicant;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public boolean isPassedBackgroundCheck() {
        return passedBackgroundCheck;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public void setPassedBackgroundCheck(boolean passedBackgroundCheck) {
        this.passedBackgroundCheck = passedBackgroundCheck;
    }

    public LoanApplication(
            Applicant applicant
    ) {
        this.applicant = applicant;
        this.passedBackgroundCheck = applicant.isValid();
    }
}
