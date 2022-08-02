package Capitulo3;

import Capitulo3.Capitulo3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCapitulo3 {

    Capitulo3 cap3;
    @BeforeEach
    void inicializacao(){
        cap3 = new Capitulo3();
    }

    @Test
    public void exercicio1(){
        cap3.exe1();
    }

    @Test
    public void exercicios234(){
        cap3.exe2();
        cap3.exe3();
        cap3.exe4();
    }
    @Test
    public void exercicio6(){
        cap3.exe6();
    }
    @Test
    public void exercicio7(){
        cap3.exe7();
    }
    @Test
    public void exercicio8(){
        cap3.exe8();
    }
}
