package banco;

public class FabricaCorrentista {
    public static Correntista novo(String nome, int tipo, float saldo1, float saldo2){
        Correntista novoCorrentista = new Correntista();
        novoCorrentista.nome = nome;
        novoCorrentista.tipo = tipo;
        novoCorrentista.conta1 = new Conta();
        novoCorrentista.conta2 = new Conta();        
        
        novoCorrentista.conta1.saldo = saldo1;
        novoCorrentista.conta2.saldo = saldo2;
        
        novoCorrentista.conta1.donoDaConta = novoCorrentista;
        novoCorrentista.conta2.donoDaConta = novoCorrentista;
        
        return novoCorrentista;
    }

}
