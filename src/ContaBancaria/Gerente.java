package ContaBancaria;

public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    public boolean autentica(int senha){
        if (this.getSenha() == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    @Override
    public double getBonificacao(){
        //return this.salario * 0.15;
        return super.getBonificacao() + 1000;
    }
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
