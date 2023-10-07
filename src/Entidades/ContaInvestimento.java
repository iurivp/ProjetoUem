package Entidades;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(String titular, String numeroConta, String numeroAgencia, float saldo, String status, float percentual){
        super(titular,numeroConta,numeroAgencia,saldo,status,percentual);
    }
}
