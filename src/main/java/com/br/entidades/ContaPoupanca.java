package com.br.entidades;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void mostrarSaldo(){
        System.out.println("================== CONTA POUPANÇA ==================");
        super.mostrarSaldo();
    }
}
