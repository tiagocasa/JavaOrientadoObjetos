package Capitulo4;

import org.junit.jupiter.api.Test;

public class TestCapitulo4 {


    @Test
    void exercicio4(){
        Conta c1 = new Conta();
        c1.nomeDoTitular = "Danilo";
        c1.saldo = 100;

        Conta c2 = new Conta();
        c2.nomeDoTitular = "Danilo";
        c2.saldo = 100;

        if(c1==c2){
            System.out.print("Iguais");
        }else{
            System.out.print("Diferentes");
        }
    }

    @Test
    void exercicio5(){
        Conta c1 = new Conta();
        c1.nomeDoTitular = "Hugo";
        c1.saldo = 100;
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
        Data data = new Data();
        c1.dataDeAbertura = data;
    }

    @Test
    void exercicio7(){
        Conta c1 = new Conta();
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
    }
}
