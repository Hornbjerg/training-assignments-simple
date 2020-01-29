package eu.sig.training.ch04;

public class Transfer {
    CheckingAccount counterAccount;

    public Transfer(AbstractAccount acct1, CheckingAccount acct2, Money m) {}

    public CheckingAccount getCounterAccount() {
        return this.counterAccount;
    }
}
