package Capitulo5;

public class Conta {

    protected static int totalDeContas;
    protected static int idConta;
    protected String nomeDoTitular;
    protected int numero;
    protected String agencia;
    protected double saldo;
    protected Data dataDeAbertura;

    Conta() {
        totalDeContas++;
        this.numero = ++idConta;
    }

    //Construtor
    Conta(String titular) {
        this.nomeDoTitular = titular;
        totalDeContas++;
        this.numero = ++idConta;
    }

    public int getNumeroDeContas() {
        return totalDeContas;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNome(String nome) {
        this.nomeDoTitular = nome;
    }

    public void sacar(int valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void depositar(int valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public double calculaRendimento() {
        return this.saldo *= 0.1;
    }

    String recuperaDadosParaImpressao() {
        String dados = "\nTitular: " + this.nomeDoTitular;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
        return dados;
    }
}

class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.preencheData(dia, mes, ano);
    }

    protected boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }
        int ultimoDiaDoMes = 31;    //	por	padrao	são	31	dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }
        return true;
    }

    void preencheData(int dia, int mes, int ano) {
        if (!isDataViavel(dia, mes, ano)) {
            System.out.println("A	data	" + dia + "/" + mes + "/" + ano + "	não	existe!");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}





