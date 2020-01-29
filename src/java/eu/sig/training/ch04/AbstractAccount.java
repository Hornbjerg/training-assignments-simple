package eu.sig.training.ch04;

public abstract class AbstractAccount {
	private Money balance = new Money();

	protected abstract float getInterestPct();

	public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
		return validateCounterAccount(counterAccount, amount);
	}

	protected Transfer validateCounterAccount(String counterAccount, Money amount) throws BusinessException {
        if (isValidAccount(counterAccount)) {
            return createTransfer(counterAccount, amount);
        }
        throw new BusinessException("Invalid account number!");
	}

	protected Transfer createTransfer(String counterAccount, Money amount) throws BusinessException {
		CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
		Transfer result = new Transfer(this, acct, amount);
		return result;
	}

	protected boolean isValidAccount(String counterAccount) {
		int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
		return sum % 11 == 0;
	}

	public void addInterest() {
        Money interest = balance.multiply(getInterestPct());
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }

}
