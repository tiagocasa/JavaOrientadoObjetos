package Capitulo11;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public abstract double getBonificacao();

    public void setSalario(double salario){
        this.salario = salario;
    }
}
