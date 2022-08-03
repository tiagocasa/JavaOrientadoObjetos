package Capitulo9;

import Capitulo4.Conta;

public class ContaCorrente extends Conta {
    public String getTipo(){
        return super.getTipo() + " Corrente";
    }
}
