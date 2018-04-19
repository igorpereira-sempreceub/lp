package banco;

public class Correntista {
    public String nome;
    public int tipo;
    public Conta conta1;
    public Conta conta2;
    
    
    public float saldoTotal(){
        return conta1.saldo + conta2.saldo;
    }
}
