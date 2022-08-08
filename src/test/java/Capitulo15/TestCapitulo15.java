package Capitulo15;

import org.junit.jupiter.api.Test;

public class TestCapitulo15 {

    @Test
    public void exe1(){
    TestPerformance tp = new TestPerformance();
    tp.ListPerformance();
    tp.HashSetPerformance();
    }

    @Test
    public void exe4(){
        TestPerformance tp = new TestPerformance();
        tp.LinkedList();
        tp.ArrayList();
    }

    @Test
    public void desafio1(){
        TestPerformance tp = new TestPerformance();
        tp.TreeSetDecrescente();
    }

    @Test
    public void desafio2(){
        TestPerformance tp = new TestPerformance();
        tp.ArrayDecrescente();
    }
}

