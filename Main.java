package wandeson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        // controle do menu
        Boolean fim = false;

        // inicando o Scanner para entradas
        Scanner scan = new Scanner(System.in);

        // instanciando as listas ptincipais 
        ArrayList<Socio> socios = new ArrayList<Socio>();
        ArrayList<Copia> copias = new ArrayList<Copia>();
        ArrayList<Locacao> locacoes = new ArrayList<Locacao>();
        ArrayList<Filme> filmes = new ArrayList<Filme>();
        
        // instanciando os objetos iniciais , filme copia, socio
        Filme f1 = new Filme("kong fu panda",120,2010,"digital","jack black, angelina jolie, jackie chan");
        Filme f2 = new Filme("toy story",90,1998,"digital","Tim Allem, Tom Hanks, Annie Potts");
        
        Copia c1 = new Copia(1,f1);
        Copia c2 = new Copia(2,f1);
        Copia c3 = new Copia(1,f2);
        
        Socio s1 = new Socio();  
        Socio s2 = new Socio();     
        s1.setNome("felipe");
        s2.setNome("ismael");
        
        Locacao l1 = new Locacao(c1,s1);

        
        socios.add(s1);
        socios.add(s2);
        
        copias.add(c1);
        copias.add(c2);
        copias.add(c3);
        
        filmes.add(f1);
        filmes.add(f2);

        locacoes.add(l1);
        
        // menu principal
        while(!fim){
            System.out.println("menu principal");
            System.out.println("1 - Copias\n2 - Locação feitas\n3 - Socios\n4 - Sair");
            int op = scan.nextInt();
          
            switch (op){
                case 1 :       
                            
                    while(op == 1){
                        System.out.println("o que fazer em copias?\n1 - listar\n2 - adicionar\n3 - deletar\n4 - voltar");
                        int op2 = scan.nextInt();
                                              
                        if(op2 == 1){
                       
                            System.out.println("");
                            for(Copia copia : copias){
                                System.out.println(copia);
                            }
                            System.out.println("");
                           
                        }else if(op2 == 3){
                       
                            int i = 0;
                            System.out.println("");
                            for(Copia copia : copias){                               
                                System.out.println(i+" - "+copia);
                                i++;
                            }
                           
                            System.out.println("\nqual copia?");
                            int del = scan.nextInt();
                           
                            copias.remove(del);
                           
                            System.out.println("deletado com sucesso");
                           
                        }else if(op2 == 2){
                         
                            int i = 0;
                            System.out.println("de qual filme?");
                            for(Filme filme : filmes){                               
                                System.out.println(i+" - "+filme);
                                i++;
                            }
                            int adc = scan.nextInt();
                            System.out.println("qual o numero da copia?");
                            int num = scan.nextInt();
                                              
                          
                            copias.add(new Copia(num,filmes.get(adc)));
                
                            System.out.println("adicionado");           
                           
                        }else if(op2 == 4){
                            op = 0;
                        }                       
                    }
                          
               break;
               case 2:

                  while(op == 2){

                        System.out.println("");
                        for(Locacao locacao : locacoes){
                            System.out.println(locacao);
                        }
                        System.out.println("");

                        System.out.println("o que fazer em Locações?\n1 - adicionar\n2 - voltar");
                        int op2 = scan.nextInt();
                                              
                        if(op2 == 1){
                       
                            int i = 0;
                            System.out.println("Qual socio?");
                            for(Socio socio : socios){                               
                                System.out.println(i+" - "+socio);
                                i++;
                            }
                            int soc = scan.nextInt();
                            i = 0;
                            System.out.println("Qual Copia?");
                            for(Copia copia : copias){                               
                                System.out.println(i+" - "+copia);
                                i++;
                            }
                            int cop = scan.nextInt();
                                                            
                            locacoes.add(new Locacao(copias.get(cop),socios.get(soc)));
                            //copias.remove(cop);
                            System.out.println("operação feita com sucesso");
                           
                        }else if(op2 == 2){
                            op = 0;
                        }                       
                    }

               break;
               case 3:

                  while(op == 3){

                      System.out.println("Socios\n1 - listar\n2 - adicionar\n3 - deletar\n4 - voltar");
                      int op2 = scan.nextInt();

                      if(op2 == 1){
                         
                          System.out.println("");
                          for(Socio socio : socios){
                              System.out.println(socio);
                          }
                          System.out.println("");
                         
                      }else if(op2 == 2){

                          System.out.println("nome");
                          String nome = scan.nextLine();
                          System.out.println("endereço");
                          String end = scan.nextLine();
                          System.out.println("telefone");
                          String tel = scan.nextLine();
                          System.out.println("cpf");
                          String cpf = scan.nextLine();
                          System.out.println("rg");
                          String rg = scan.nextLine();
                          System.out.println("data de adesao");
                          String data = scan.nextLine();
                          
                          socios.add(new Socio(nome,end,tel,cpf,rg,data));

                      }else if(op2 == 3){

                          int i = 0;
                          System.out.println("");
                          for(Socio socio : socios){                               
                              System.out.println(i+" - "+socios);
                              i++;
                          }
                          
                          System.out.println("\nqual socio?");
                          int del = scan.nextInt();
                          
                          socios.remove(del);
                          
                          System.out.println("deletado com sucesso");
                      }else if(op2 == 4){
                          op = 0;
                      }
                  }

               break;
               case 4:
                   fim = true;
               break;
           }
          
           
           
        }
    }
}
