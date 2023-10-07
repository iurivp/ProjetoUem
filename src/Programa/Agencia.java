package Programa;

import Entidades.Conta;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    public ArrayList<Conta> lista = new ArrayList<>();



    public void adicionarConta (Conta conta){
        lista.add(conta);
    }

    public void removerPorNumero (String numeroConta){
        List<Conta> contas = new ArrayList<>();
        for (Conta c : lista){
            if (!numeroConta.equals(c.getNumeroConta())){
                contas.add(c);
            }

        }
        lista.clear();
        lista.addAll(contas);
    }

    public List<Conta> encontrarTodasPorTitular(String titular){
        List<Conta> contas = new ArrayList<>();
        for (Conta c : lista){
            if (c.getTitular().equals(titular)){
                contas.add(c);
            }
        }
        return contas;
    }

    public List<Conta> encontrarTodas() {
        return lista;
    }

    public Conta encontrarPorNumero(String numeroConta){
        Conta conta = null;
        for (Conta c : lista){
            if (c.getNumeroConta() == numeroConta){
                conta = c;
            }
        }
        return conta;
    }
}
