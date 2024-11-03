public class Account {

    private String id;
    private String name;
    private int balance = 0 ;
//    private int amount = 0;



    // Constructors
    Account(){

    }

    Account(String id , String name){
        this.id=id;
        this.name=name;
    }

    Account(String id , String name , int balance){
        this.name=name;
        this.id=id;
        this.balance= balance;
    }


    // setting the setter and getter for the Account Class varibels:

    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance() {
        return balance;
    }

    // Methods :
    public int credit(int amount){
       if(amount > 0){
           balance +=amount;
       }
       return balance;
    }

    public int debit(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        return balance;
    }

    public boolean transferTo(Account another , int amount ){
        if(amount > 0 && amount <= balance){
            debit(amount);
            another.credit(amount);
          return true; //  System.out.println("Transfer successful!");
        }
        return false; //System.out.println("Transfer failed. Please Check amount and balance.");
    }


    public void disPlayAccountInfo(String name , String id , int balance){
        System.out.println("Account Information : " + getName() + getId() + getBalance());
    }

@Override
public String toString() {
    return "Account ID: " + id + ", Name: " + name + ", Current Balance: " + balance + " SAR";
}





}
