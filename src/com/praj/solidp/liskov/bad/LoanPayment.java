package com.praj.solidp.liskov.bad;


 /*This is loan interface responsible for payment related on a loan account
 * LoanPayment implemented by actual loans like Home loan, Credit card loan etc...
 * For credit card/personal loan which is unsecured foreclosure and repayment are not allowed.
 * */
public interface LoanPayment {
    public void doPayment(int amount);
    public void foreCloseLoan();
    public void doRepayment(int amount);

}
