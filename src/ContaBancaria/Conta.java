package ContaBancaria;

public class Conta {
    private double saldoDaConta;
    private String nome;
    
    public double getSaldo(){
        return saldoDaConta;
    }
    
    public Conta(){
        
    }
    
    public Conta(String nome, double saldoDaConta){
        this.nome = nome;
        this.saldoDaConta = saldoDaConta;
    }
    public void imprimir(String nome){
        int idade = 22;
        imprimeIdade(idade);
    }

    private void imprimeIdade(int idade) {
        System.out.println("Idade: "+idade);
    }
    
    public void setSaldo(double saldo){
        this.saldoDaConta = saldo;
    }
}
