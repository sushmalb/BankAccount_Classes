public class Main{
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();

        bA.depositMoney(500);
        bA.withdrawMoney(100.0);
        bA.withdrawMoney(500);


            //System.out.println(bA.getCustomerName()+" "+" deposited "+bA.depositMoney(100)+" Rs "+bA.getAccountNumber());

    }
}