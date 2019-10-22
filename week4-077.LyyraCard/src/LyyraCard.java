public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceatStart) {
        this.balance = balanceatStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {

        if (this.balance - 2.50 < 0) {
            this.balance = this.balance - 0;
        } else {
            this.balance = this.balance - 2.50;
        }
    }


    public void payGourmet() {
        // write code here

        if (this.balance - 4.00 < 0) {
            this.balance = this.balance - 0;
        } else {
            this.balance = this.balance - 4.00;
        }
    }


    public void loadMoney(double amount) {
        // write code here

        if (amount < 0) {
            amount = 0;
        }

        if (this.balance + amount > 150.0) {
            this.balance = 150.0;
        } else {
            this.balance = this.balance + amount;
        }


    }


}

