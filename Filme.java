package wandeson;

public class Filme {
    private String nome;
    private int duracao;
    private int ano;
    private String formato;
    private String atores;
      
    Filme(String nome,int duracao,int ano,String formato,String atores){
        this.nome = nome;
        this.duracao = duracao;
        this.ano = ano;
        this.formato = formato;
        this.atores = atores;
    }
    
    public void informacoes(){
        System.out.println("titulo  - "+this.nome);
        System.out.println("duração - "+this.duracao);
        System.out.println("ano     - "+this.ano);
        System.out.println("formato - "+this.formato);
        System.out.println("atores  - "+this.atores);
    }
    
    public String toString(){
        return this.nome;
    }
}
