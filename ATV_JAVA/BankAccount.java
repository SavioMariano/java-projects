package ATV_JAVA;

public class BankAccount {
    private int numberAccount;
    private String cardholderName;
    private double balanceInitial;
    
    public BankAccount(int numberAccount,String cardholderName,double balanceInitial){
        this.numberAccount = numberAccount;
        this.cardholderName = cardholderName;
        this.balanceInitial = balanceInitial;
    }

    public static void main(String[] args) {
        BankAccount Account = new BankAccount(12456, "João da Silva", 10000);
        System.out.println(Account.information());

        System.out.println(Account.deposit(-5));

        System.out.println(Account.withdraw(3000));
    }


    public String information(){
        return "Seu numéro da conta é " + this.numberAccount + " e possui R$" + balanceInitial + " depositado."  ;
    }


    public String deposit(double balance){
        if (balance > 0) {
        balanceInitial += balance;
        return "O senhor(a) "+ this.cardholderName+" depositou o valor de R$" + balance;
        }else{
            return "Não é possivel efetuar o deposito";
        }
    }

    public String withdraw(double withdrawMoney){
        if (withdrawMoney < balanceInitial) {
            balanceInitial -= withdrawMoney;
            return "O senhor(a)" + this.cardholderName + " sacou o valor de R$" + withdrawMoney;
        }
        return "Não é posssivel efetuar o saque";
    } 
}
