package Capitulo13;

import org.junit.jupiter.api.Test;

public class testCapitulo13 {

    @Test
    public void exercicio5(){
        Opcionais op = new Opcionais();
        op.exe5("Joaquim");
    }

    @Test
    public void exercicio7(){
        Opcionais op = new Opcionais();
        op.inverteComStringBuilder("Socorram");
    }

    @Test
    public void exercicio8(){
        Opcionais op = new Opcionais();
        op.desafio13("123");
    }

}
