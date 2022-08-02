package Capitulo4;

public class Fibonacci {
    int ultimaChamada = 0;
    public int calcularFibonacci(int i) {
        if(i<=2){
            return 1;
        }else{
            return calcularFibonacci(i-1) + calcularFibonacci(i-2);
        }
    }
}
