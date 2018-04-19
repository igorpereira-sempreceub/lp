package banco;

public class Banco {

    public static void main(String[] args) {
        
        Correntista corre1 = FabricaCorrentista.novo("Maria", 1, 1000, 2000);        
        Correntista corre2 = FabricaCorrentista.novo("Rosa", 1, 500, 1000);
        
        Transacao tx1 = new Transacao();
        
        tx1.tipo = 1; //debito
        tx1.valor = corre1.conta1.saldo;
        corre1.conta1.aplicarTransacao(tx1);
        
        tx1.tipo = 2;
        corre2.conta2.aplicarTransacao(tx1);
        
        
        Transacao tx2 = new Transacao();
        
        tx2.tipo = 1;
        tx2.valor = corre2.conta1.saldo;
        corre2.conta1.aplicarTransacao(tx2);
        
        tx2.tipo = 2;
        corre1.conta2.aplicarTransacao(tx2);

        System.out.println("Saldo da Conta 1 - Maria:" + corre1.conta1.saldo);
        System.out.println("Saldo da Conta 2 - Maria:" + corre1.conta2.saldo);
        System.out.println("Saldo total - Maria: " + corre1.saldoTotal());
        
        System.out.println("");
        
        System.out.println("Saldo da Conta 1 - ROSA:" + corre2.conta1.saldo);
        System.out.println("Saldo da Conta 2 - ROSA:" + corre2.conta2.saldo);
        System.out.println("Saldo total - Rosa: " + corre2.saldoTotal());
        
        
    }    
}
