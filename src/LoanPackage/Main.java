package LoanPackage;

import LoanPackage.model.Applicant;
import LoanPackage.model.LoanApplication;

public class Main {
    private static void applyForLoan() {
        Applicant applicant = new Applicant(
                "Andrzej",
                "Kowalski",
                "92071186978",
                "5833135057",
                "PL82132000193762539463124645",
                "1992-07-11"
        );
        LoanApplication application = new LoanApplication(applicant);
        application.setConfirmed(true);
        if (application.isConfirmed() && application.isPassedBackgroundCheck()) {
            System.out.println("Przeszedł");
        } else {
            System.out.println("No niestety");
        }
    }

    public static void main(String[] args) {
        applyForLoan();
    }
}
