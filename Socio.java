package wandeson;

public class Socio {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String rg;
    private String datadeadesao;
    
    Socio(){}
    
    Socio(String nome,String endereco,String telefone,String cpf,String rg,String datadeadesao){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.datadeadesao = datadeadesao;        
    }
    
    Socio(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String end){
        this.endereco = end;
    }
    
    public void setTelefone(String tel){
        this.telefone = tel;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setData(String data){
        this.datadeadesao = data;
    }
    
    public String toString(){
        return this.nome;
    }
}
