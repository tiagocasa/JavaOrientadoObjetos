package Capitulo10;

import org.junit.jupiter.api.Test;

public class TestCapitulo10 {

    @Test
    public void exercicio1(){
        Conta c1 = new ContaCorrente();
        System.out.print(c1.getTipo());
    }

    @Test //Exercicio 7
    public void exe7(){
        Conta c2 = new ContaCorrente();
        System.out.print(c2.recuperaDadosParaImpressao());
    }
}
