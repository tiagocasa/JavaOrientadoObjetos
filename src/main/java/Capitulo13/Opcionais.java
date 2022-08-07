package Capitulo13;

public class Opcionais {

    public void exe5(String palavra){
        for (char ch: palavra.toCharArray()
             ) {
            System.out.println(ch);
        }

        for(int i = 0; i<palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
    }

    public	void inverteComStringBuilder(String	texto) {
        System.out.print("\t");
        StringBuilder invertido = new StringBuilder(texto).reverse();
        System.out.println(invertido);
    }
    public void desafio13(String numberAsText){
        int numero=0;
        for (char ch: numberAsText.toCharArray()
             ) {
            numero = numero*10+( ch-'0');
        }
        System.out.println(numero);
    }
}

