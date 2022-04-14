package com.br.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta{
    private static final int AGENCIA_GERAL = 1;
    private static int NUMERACAO_CONTA = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_GERAL;
        this.numeroConta = NUMERACAO_CONTA++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("=================== Castle Bank ============================");
        System.out.println(" Titular da conta: " + this.cliente.getNome());
        System.out.println(" Agência: " + this.agencia);
        System.out.println(" Conta: " + this.numeroConta);
        System.out.println(" Saldo: R$ " + this.saldo);
    }


}
