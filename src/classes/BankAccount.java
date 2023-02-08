package classes;

/**
 * La clase BankAccount representa una cuenta bancaria.
 */
public class BankAccount {
    /**
     * Número de cuenta.
     */
    private int accountNumber;

    /**
     * Activación de la cuenta.
     */
    protected boolean activated;

    /**
     * Constructor que inicializa el número de cuenta y la activación de la cuenta.
     *
     * @param accountNumber Número de cuenta
     * @param activated Activación de la cuenta
     */
    public BankAccount(int accountNumber, boolean activated){
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param accountNumber Número de cuenta
     */
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     * Devuelve el número de cuenta.
     *
     * @return Número de cuenta
     */
    public int getAccountNumber(){
        return accountNumber;
    }

    /**
     * Establece la activación de la cuenta.
     *
     * @param activated Activación de la cuenta
     */
    public void setActivated(boolean activated){
        this.activated = activated;
    }

    /**
     * Devuelve la activación de la cuenta.
     *
     * @return Activación de la cuenta
     */
    public boolean getActivated(){
        return activated;
    }
}
