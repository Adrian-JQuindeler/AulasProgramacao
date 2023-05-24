package Praticando.ContaBanco;

public class PersonalAccount extends Account{
    private Double loanLimit;

    public PersonalAccount(){
        super();
    }

    public PersonalAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void withDraw2(double amount) throws AccExceptions{
        if (balance <= 0){
            throw new AccExceptions("A conta esta zerada");
        }
        else if (amount > balance){
            throw new AccExceptions("O valor retirado deve ser menor que o saldo!");
        }
        else if (amount > this.loanLimit){
            throw new AccExceptions("O valor retirado deve ser menor que o limite!");
        }
        else{
            balance -= amount+5;
        }
        super.withDraw(amount);
    }
}
