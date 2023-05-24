package Praticando.ContaBanco;

public class Someone {
    public static void main(String[] args){

        Account acc = new Account(1001, "Alex", 0.0 );
        BusinessAccount bacc = new BusinessAccount(1002, "Alex", 0.0, 500.0);

        // Upcasting
        Account acc1 = bacc;
        if(acc1 instanceof BusinessAccount || acc instanceof Account){
            System.out.println("BusinessAccount!");
        }
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1003, "Bob", 0.0, 0.08);

        // downcasting
        BusinessAccount bacc1 = (BusinessAccount)acc2;
        bacc1.loan(200);

        if(acc3 instanceof BusinessAccount){
            BusinessAccount bacc2 = (BusinessAccount)acc3;
            bacc2.loan(200);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount sacc = (SavingsAccount)acc3;
            sacc.updateBalance();
            System.out.println("Update!");
        }
    }
}
