public class Capitulo3 {

    public String despesas(){
        int janeiro = 15;
        int fevereiro = 23;
        int marco = 17;
        int despesatri= janeiro+fevereiro+marco;
        int media = despesatri/3;
        return "Despesa do Trimestre: "+ despesatri +"; Média mensal de gastos: "+media;
    }

    // Lista 3.13
    public void exe1(){
        for (int i = 150; i<=300;i++){
            System.out.println(i);
        }
    }

    public void exe2(){
        int soma=0;
        for (int i = 1; i<=1000;i++){
            soma+=i;
        }
        System.out.println(soma);
    }

    public void exe3(){
        int i = 0;
        while(i < 100){
            if(i%3==0){
                System.out.println(i);
            }
            i++;
        }
    }

    public void exe4(){
        int fatorial = 1;
        for(int n =1; n<=10; n++){
            fatorial *= n;
            System.out.println(fatorial);
        }
    }

    public void exe6(){
        int first = 0;
        int second = 1;
        while(first<100){
            System.out.println(first);
            System.out.println(second);
            first += second;
            second += first;
        }
        System.out.println(first);
        System.out.println(second);
    }

    public void exe7(){
        int var = 50;
        while(var>1){
            if(var%2==0){
                var /= 2;
            }else{
                var = 3*var+1;
            }
            System.out.println(var);
        }

    }

    public void exe8(){
        int s = 4;
        for(int i = 1;i<=s;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }


}
