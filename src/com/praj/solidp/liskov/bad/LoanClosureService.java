package com.praj.solidp.liskov.bad;

public class LoanClosureService {
    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment= loanPayment;
    }
    public void foreCloseLoan() {
        loanPayment.foreCloseLoan();
    }
}
