package banco;

public class Conta {
    public float saldo;
    public Correntista donoDaConta;
    
    public boolean aplicarTransacao(Transacao tr){
        
//        System.out.println(tr.valor);
        
        if(tr.validar(donoDaConta)){
            if(tr.tipo == 1){//Debito 
                if(saldo >= tr.valor) {
                    saldo = saldo - tr.valor;
                    return true;
                }
            }  else {
                saldo = saldo + tr.valor;
                return true;
            }
        }
        return false;
    }
}
