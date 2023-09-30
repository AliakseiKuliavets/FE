package casino._21;

import java.util.Map;
public class Bankir {
    private double moneyAccount;
    private String nameBankir;
    private Map<String, Integer> cardsBankir;
    private int number;

    public Bankir(double moneyAccount, String nameBankir) {
        this.moneyAccount = moneyAccount;
        this.nameBankir = nameBankir;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public String getNameBankir() {
        return nameBankir;
    }

    public Map<String, Integer> getCardsBankir() {
        return cardsBankir;
    }

    public int getNumber() {
        return number;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public void setNameBankir(String nameBankir) {
        this.nameBankir = nameBankir;
    }

    public void setCardsBankir(Map<String, Integer> cardsBankir) {
        this.cardsBankir = cardsBankir;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
