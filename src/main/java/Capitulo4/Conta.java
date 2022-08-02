package Capitulo4;

public class Conta {

        String nomeDoTitular;
        int numero;
        String agencia;
        double saldo;
        Data dataDeAbertura = new Data();

        public void sacar(int valor){
            if(this.saldo>=valor){
                this.saldo-=valor;
            }
        }

        public void depositar(int valor){
            this.saldo += valor;
        }

        public double calculaRendimento(){
            return this.saldo *= 0.1;
        }

        String recuperaDadosParaImpressao(){
            String dados = "\nTitular: " + this.nomeDoTitular;
            dados += "\nSaldo: " + this.saldo;
            dados += "\nData de abertura: "+this.dataDeAbertura.formatada();
            return dados;
        }
    }

    class Data{
        int dia;
        int mes;
        int ano;

        String formatada(){
            return this.dia+"/"+this.mes+"/"+this.ano;
        }
    }





