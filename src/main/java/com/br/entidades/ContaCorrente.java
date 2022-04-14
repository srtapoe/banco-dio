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
        }else if(saldo == 0 && CHEQUE_ESPECIAL != 0){
            CHEQUE_ESPECIAL -= valor;
            saldo -= CHEQUE_ESPECIAL;
        }
    }


    @Override
    public void mostrarSaldo(){
        System.out.println("================== CONTA CORRENTE ==================");
        super.mostrarSaldo();
    }

}
