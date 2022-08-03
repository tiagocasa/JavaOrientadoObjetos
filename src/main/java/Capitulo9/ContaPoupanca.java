package Capitulo9;

import Capitulo4.Conta;

public class ContaPoupanca extends Conta {
    public String getTipo(){
        return super.getTipo() + " Poupança";
    }
}
