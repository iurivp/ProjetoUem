package Entidades;
import java.util.Scanner;
public abstract class Conta {

    private String titular;
    private String numeroConta;
    private String numeroAgencia;
    private float saldo;
    private String status;
    private float percentual = 1;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }




    public Conta(){

    }

    public Conta(String titular, String numeroConta, String numeroAgencia, float saldo, String status, float percentual) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
        this.status = status;
        this.percentual = percentual;
    }

    public float saque(float valor){
        return this.saldo = this.saldo-valor;
    }

    public void alteraStatus(){
        if(saldo < 0 ){
            setStatus("negativo");
        }
        if(saldo >= 0){
            setStatus("positivo");
        }
    }

    public void atualizar(){
        this.saldo = this.saldo*percentual;
    }

    @Override
    public String toString() {
        return "{\n" +
                "    titular = '" + titular + '\'' +
                ",\n    numeroConta = '" + numeroConta + '\'' +
                ",\n    numeroAgencia = '" + numeroAgencia + '\'' +
                ",\n    saldo = " + saldo +
                ",\n    status = '" + status + '\'' +
                ",\n    percentual = " + percentual +
                "\n}";
    }

    public float deposito(float valor){
        return this.saldo = this.saldo+valor;
    }

    public void transferePara(Conta destinatario, float valor){
        this.saldo = this.saldo-valor;
        destinatario.saldo = destinatario.saldo+valor;

    }
}
