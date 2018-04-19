package banco;

public class Banco {

    public static void main(String[] args) {
        
        Correntista corre1 = FabricaCorrentista.novo("Maria", 1);        
        Correntista corre2 = FabricaCorrentista.novo("Rosa", 1);
        
        Conta ct1; 
        ct1 = new Conta();
        ct1.saldo = 1000;
        
        corre1.conta1 = ct1;
        corre1.conta1.saldo = 2000;
        
        
        
        Conta ct2;
        ct2 = new Conta();
        ct2.saldo = 500;
        corre1.conta2 = ct2;
        
        
        
        System.out.println("Saldo da maria:" + corre1.saldoTotal());
        
        Conta ct3;
        ct3 = new Conta();
        ct3.saldo = 100;
        corre2.conta1 = ct3;
        
        
        Conta ct4;
        ct4 = new Conta();
        ct4.saldo = 3100;
        corre2.conta2 = ct4;
        ct4.donoDaConta = corre2;
        
        
        System.out.println("Saldo da ROSA:" + corre2.saldoTotal());
        
        
        Transacao trans = new Transacao();
        trans.tipo = 0;
        trans.valor = 400;
        
        corre2.conta1.aplicarTransacao(trans);
            
        
        
    }
    
}
