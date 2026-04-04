// Last updated: 04/04/2026, 23:30:37
class Bank {
    private long[] accountsBalance;
    int n;
    public Bank(long[] balance) {
        accountsBalance = balance;
        this.n = balance.length;
    }
    public boolean isValidAcnt(int accNo) {
        return (accNo>=1 && accNo<=n);
    }
    public boolean transfer(int account1, int account2, long money) {
        if(!(isValidAcnt(account1)) || !(isValidAcnt(account2))) return false;
        if (accountsBalance[account1-1] < money) {
            return false;
        }
        accountsBalance[account1-1] -= money;
        accountsBalance[account2-1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if(!isValidAcnt(account)) return false;
        accountsBalance[account-1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if(!isValidAcnt(account)) return false;
        if (accountsBalance[account-1] < money) {
            return false;
        }
        accountsBalance[account-1] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */