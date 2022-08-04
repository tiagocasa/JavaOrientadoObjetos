package Capitulo11;

public class SistemaInterno {
    public boolean isLogged;
    public void login(Autenticavel a, int senha){
        isLogged = a.autentica(senha);
    }
}
