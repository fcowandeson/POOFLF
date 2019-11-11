package wandeson;

public class Locacao {
   private Copia copia;
   private Socio socio;
   
   Locacao(Copia c,Socio s){
       this.copia = c;
       this.socio = s;
   }
   
   public String toString(){
       return this.copia+" foi alugada por "+this.socio;
   }
}
