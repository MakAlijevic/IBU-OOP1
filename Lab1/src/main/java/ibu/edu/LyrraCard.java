package ibu.edu;

public class LyrraCard {
    double balance;

    public LyrraCard(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return ("The card has " + balance + " Euros.");
    }

    public void payEconomical(){
        if(this.balance >= 2.50){
            this.balance = this.balance - 2.50;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void payGourmet(){
        if(this.balance >= 4.00){
            this.balance = this.balance - 4.00;
        }else{
            System.out.println("Invalid balance");
        }
    }

    public void loadMoney(double amount){
        double var = this.balance + amount;
        if(amount > 0) {
            if (var > 150) {
                this.balance = 150;
            } else {
                this.balance = this.balance + amount;
            }
        }
    }
}
