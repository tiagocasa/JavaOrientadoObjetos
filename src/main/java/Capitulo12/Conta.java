package Capitulo12;

public class Conta {

        String nomeDoTitular;
        int numero;
        String agencia;
        double saldo;

        public void sacar(int valor) {
            if(this.saldo<valor){
                throw new SaldoInsuficienteException(valor);
            }
            this.saldo-=valor;
        }

        public String getTipo(){
            return "Conta";
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
            return dados;
        }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj){
            if (obj == null) return false;
            Conta outraConta = (Conta) obj;
            return this.numero == outraConta.numero &&
                    this.agencia.equals(outraConta.agencia);
    }
}



