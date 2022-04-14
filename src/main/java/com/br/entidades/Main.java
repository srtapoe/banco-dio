package com.br.entidades;

public class Main {
    public static void main(String[] args) {
        Cliente ted = new Cliente();
        ted.setNome("Ted Mosby");

        ContaCorrente cc = new ContaCorrente(ted);
        ContaPoupanca cp = new ContaPoupanca(ted);

        cc.depositar(800);
        cc.sacar(800);
        cc.mostrarSaldo();

        cc.sacar(300);
        System.out.println("sacouuuuuuu tudooooooooooo");
        cc.mostrarSaldo();

    }
}
