package Capitulo12;

import org.junit.jupiter.api.Test;

public class TestCapitulo12 {

    @Test
    public void saldoInsuficiente() {
        Conta c1 = new Conta();
        c1.saldo = 1000;
        c1.sacar(1500);
    }
}


