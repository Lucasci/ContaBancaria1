package ContaBancaria;

class TestaGerente {
    public static void main(String[] args){
        Gerente gerente = new Gerente();
        
        gerente.setNome("João");
        
        gerente.setSenha(4231);
        
        gerente.setSalario(5000.0);
        System.out.println("Salário do gerente: "+gerente.getSalario());
        System.out.println("Bonificação do gerente: "+gerente.getBonificacao());
    }
    
}
