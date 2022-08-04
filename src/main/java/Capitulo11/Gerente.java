package Capitulo11;

public class Gerente extends Funcionario implements Autenticavel{

    private int senha;
    public void setSenha(int senha){
        this.senha = senha;
    }
    @Override
    public boolean autentica(int senha) {
        if(this.senha!=senha){
            return false;
        }
        return true;
    }
    @Override
    public double getBonificacao() {
        return this.salario*1.15;
    }
}
