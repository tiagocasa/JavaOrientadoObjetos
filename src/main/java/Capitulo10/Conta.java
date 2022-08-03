package Capitulo10;

public abstract class Conta {

    protected static int totalDeContas;
    protected static int idConta;
    protected String nomeDoTitular;
    protected int numero;
    protected String agencia;
    protected double saldo;

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

    public abstract String getTipo();

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

    public String recuperaDadosParaImpressao() {
        String dados = "Titular:	" + this.nomeDoTitular;
        dados += "\nNúmero:	" + this.numero;
        dados += "\nAgência:	" + this.agencia;
        dados += "\nSaldo:	R$" + this.saldo;
        dados += "\nTipo:	" + this.getTipo();
        return dados;
    }
}
