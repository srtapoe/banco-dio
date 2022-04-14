package com.br.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta{

    private String agencia;
    private String numeroConta;
    private double saldo;
    private String nomeCliente;

    @Override
    public void sacar() {

    }

    @Override
    public void depositar() {

    }

    @Override
    public void transferir() {

    }

    @Override
    public void mostrarSaldo() {

    }


}
