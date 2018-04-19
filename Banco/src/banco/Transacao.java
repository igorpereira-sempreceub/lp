package banco;

public class Transacao {
    public float valor;
    public int tipo;
    
    public boolean validar(Correntista c){
        if(c.tipo == 1 && valor > 10000){ // PF
           return false;
        }
        return true;        
    }
}
