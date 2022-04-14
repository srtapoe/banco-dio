package com.br.entidades;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void mostrarSaldo(){
        System.out.println("\\uD83E\\uDDFE\\uD83E\\uDDFE CONTA POUPANÇA \\uD83E\\uDDFE\\uD83E\\uDDFE");
        mostrarSaldo();
    }



}
