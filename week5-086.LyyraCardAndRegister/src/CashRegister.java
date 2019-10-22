
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        double eco = 2.50;

        if (cashGiven >= eco) {
            cashInRegister += eco;
            this.economicalSold++;
            return cashGiven - eco;
        }

        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens


        double gourmet = 4.00;
        if (cashGiven >= gourmet) {
            cashInRegister += gourmet;
            this.gourmetSold++;
            return cashGiven - gourmet;
        }

        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false

        double balance = card.balance();
        double eco = 2.50;

        if (balance >= eco) {
            economicalSold++;
            card.pay(eco);
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false

        double gourmet = 4.00;

        double balance = card.balance();

        if (balance >= gourmet) {
            gourmetSold++;
            card.pay(gourmet);
            return true;
        }
        return false;

    }

    public void loadMoneyToCard(LyyraCard card, double sum) {

        if(sum <= 0){

        }else {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }

    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
