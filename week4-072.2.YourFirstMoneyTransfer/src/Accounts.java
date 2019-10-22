
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account Matt = new Account("Matt's account", 1000);
        Account myAcount = new Account("My account", 0);

        Matt.withdrawal(100);
        myAcount.deposit(100);

        System.out.println(Matt.toString());
        System.out.println(myAcount.toString());


    }

}
