package Capitulo4;

public class Porta {
    boolean isAberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;

    void abre(){
        this.isAberta = true;
    }

    void fecha(){
        this.isAberta = false;
    }

    void pinta(String s){
        this.cor = s;
    }

    boolean estaAberta(){
        return this.isAberta;
    }
}
