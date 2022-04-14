package com.br.entidades;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    protected static double CHEQUE_ESPECIAL = 300;


    @Override
    public void sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
        }else if(valor > saldo || saldo <=1.0 || CHEQUE_ESPECIAL != 0){
            CHEQUE_ESPECIAL -= valor;
        }
    }


    @Override
    public void mostrarSaldo(){
        System.out.println("\\uD83E\\uDDFE\\uD83E\\uDDFE CONTA CORRENTE \\uD83E\\uDDFE\\uD83E\\uDDFE");
        mostrarSaldo();
    }

}
