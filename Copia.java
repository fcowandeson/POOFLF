package wandeson;

public class Copia {
    private int numero;
    private Filme filme;
    
    Copia(int num,Filme filme){
        this.filme = filme;
        this.numero = num;
    }
    
    public void informacoes(){
        System.out.println("copia numero "+this.numero);
        filme.informacoes();
    }
    
    public String toString(){
        return "copia "+this.numero+" do filme "+this.filme;
    }
}
