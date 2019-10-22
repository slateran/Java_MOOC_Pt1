import java.security.PublicKey;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {

        added = new Money(this.euros + added.euros, this.cents + added.cents);

        return added;
    }

    public boolean less(Money compared) {


        if ((this.euros) < (compared.euros)) {
            return true;
        }else if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }

        return false;
    }

    public Money minus(Money decremented) {


        int euro = 0;
        int cents = 0;

        if(this.less(decremented)){
            return new Money(0, 0);
        }else{

            euro = this.euros - decremented.euros;
            cents = this.cents - decremented.cents;

            if(this.cents < decremented.cents){
                euro--;
                cents = 100 - decremented.cents;
            }

            return new Money(euro, cents);

        }


    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
