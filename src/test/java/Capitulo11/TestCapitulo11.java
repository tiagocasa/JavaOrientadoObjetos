package Capitulo11;

import org.junit.jupiter.api.Test;

public class TestCapitulo11 {
    @Test
    public void testeAutentica(){
        Gerente g1 = new Gerente();
        SistemaInterno s = new SistemaInterno();
        g1.setSenha(12345);
        s.login(g1,12345);
        System.out.print(s.isLogged);
    }
}
