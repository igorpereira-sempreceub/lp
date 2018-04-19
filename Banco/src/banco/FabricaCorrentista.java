package banco;

public class FabricaCorrentista {
    public static Correntista novo(String nome, int tipo){
        Correntista novoCorrentista = new Correntista();
        novoCorrentista.nome = nome;
        novoCorrentista.tipo = tipo;
        return novoCorrentista;
    }
}
