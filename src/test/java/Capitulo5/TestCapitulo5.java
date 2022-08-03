package Capitulo5;

import Capitulo5.Conta;
import Capitulo5.*;
import org.junit.jupiter.api.Test;

public class TestCapitulo5 {


    @Test
    void exercicio4(){
        Conta c1 = new Conta();
        c1.setNome("Danilo");
        c1.depositar(100);

        Conta c2 = new Conta("Danilo");
        c2.depositar(100);

        if(c1==c2){
            System.out.print("Iguais");
        }else{
            System.out.print("Diferentes");
        }
    }

    @Test
    void exercicio5(){
        Conta c1 = new Conta();
        c1.setNome("Hugo");
        c1.depositar(100);
        Conta c2;
        c2 = c1;
        if(c1==c2){
            System.out.print("Iguais");
        }else{
            System.out.print("Diferentes");
        }
    }

    @Test
    void exercicio6(){
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();
        Conta c4 = new Conta();

        System.out.print(c1.getNumero());
        System.out.print(c1.getNumeroDeContas());

    }

/*
    @Test
    void exercicio7(){
        Capitulo4.Conta c1 = new Conta();
        System.out.print(c1.recuperaDadosParaImpressao());
    }

    @Test
    void desafio(){
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 6; i++){
            int resultado = fibonacci.calcularFibonacci(i);
            System.out.println(resultado);
        }
    }

    @Test
    void programa1(){
        Pessoa p1 = new Pessoa();
        p1.nome = "Mauricio";
        p1.idade = 54;

        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        System.out.print("Nome: "+ p1.nome+" Idade: " + p1.idade);
    }

    @Test
    void programa2(){
        Porta p1 = new Porta();
        p1.cor = "azul";
        p1.isAberta = false;
        p1.dimensaoX = 50;
        p1.dimensaoY = 210;
        p1.dimensaoZ = 10;

        p1.abre();
        p1.fecha();
        p1.abre();
        p1.pinta("preto");

    }

    @Test
    void programa3(){
        Casa c1 = new Casa();
        c1.porta1 = new Porta();
        c1.porta2 = new Porta();
        c1.porta3 = new Porta();

        c1.porta1.abre();
        c1.porta2.fecha();
        c1.porta3.abre();

        System.out.print(c1.quantasPortasEstaoAbertas());
    }*/
}
