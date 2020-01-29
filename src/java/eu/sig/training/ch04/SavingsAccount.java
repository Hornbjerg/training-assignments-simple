package eu.sig.training.ch04;

public class SavingsAccount extends AbstractAccount {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private CheckingAccount registeredCounterAccount;

    @Override
    protected float getInterestPct() {
    	return INTEREST_PERCENTAGE;
    }

    @Override
    protected Transfer createTransfer(String counterAccount, Money amount) throws BusinessException {
        Transfer result = super.createTransfer(counterAccount, amount);
        if (result.getCounterAccount().equals(this.registeredCounterAccount)) {
            return result;
        }
        throw new BusinessException("Counter-account not registered!");
    }
}
