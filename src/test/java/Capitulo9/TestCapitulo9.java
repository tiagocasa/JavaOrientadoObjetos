package Capitulo9;

import org.junit.jupiter.api.Test;

public class TestCapitulo9 {

    @Test
    public void testeGerente(){
        Gerente	gerente	=	new	Gerente();
        gerente.setSalario(5000.0);
        System.out.println(gerente.getBonificacao());
    }
}
