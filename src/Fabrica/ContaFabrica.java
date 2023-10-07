package Fabrica;

import Entidades.Conta;
import Entidades.ContaCorrente;
import Entidades.ContaInvestimento;
import Entidades.ContaPoupanca;

public class ContaFabrica {

    public static Conta ContaCorrentePadrao (String titular,String numeroConta){
        return new ContaCorrente(titular,numeroConta,"1",0,"positivo",1.0f);
    }
    public static Conta ContaInvestimentoPadrao (String titular,String numeroConta){
        return new ContaInvestimento(titular,numeroConta,"1",0,"positivo",1.01f);
    }
    public static Conta ContaPoupancaPadrao (String titular,String numeroConta){
        return new ContaPoupanca(titular,numeroConta,"1",0,"positivo",1.005f);
    }
}
