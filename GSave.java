public class GSave implements BankAccountDecorator {
    private BankAccountDecorator account;

    public GSave(BankAccountDecorator account) {
        this.account = account;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 2.5;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + " + GSave Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate() / 100);
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }
}
