package Capitulo15;

import java.util.*;

public class TestPerformance {
    public void ListPerformance() {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo	gasto:	" + tempo);
    }

    public void HashSetPerformance() {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo	gasto:	" + tempo);
    }

    public void LinkedList() {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();
        List<Integer> teste = new LinkedList<>();
        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto:	" + tempo);
    }

    public void ArrayList() {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();
        List<Integer> teste = new ArrayList<>();
        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto:	" + tempo);
    }

    public void TreeSetDecrescente() {
        TreeSet<Integer> conjunto = new TreeSet<>();
        for (int i = 1; i <= 1000; i++) {
            conjunto.add(i);
        }
        for (Integer i : conjunto.descendingSet()) {
            System.out.print(i + "	");
        }
    }

    public void ArrayDecrescente() {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            lista.add(i);
        }
        Collections.sort(lista);
        Collections.reverse(lista);
        for(Integer i : lista){
            System.out.print(i+" ");
        }
    }
}