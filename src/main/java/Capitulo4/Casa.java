package Capitulo4;

public class Casa {
    String cor = "azul";
    Porta porta1;
    Porta porta2;
    Porta porta3;

    void pinta(String s){
        this.cor = s;
    }

    int quantasPortasEstaoAbertas(){
        int portasAbertas=0;
        if(this.porta1.isAberta){
            portasAbertas++;
        }
        if(this.porta2.isAberta){
            portasAbertas++;
        }
        if(this.porta3.isAberta){
            portasAbertas++;
        }
        return portasAbertas;
    }
}
