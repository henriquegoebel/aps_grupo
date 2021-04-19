
package Model;


public class Produto {
    public int id;
    public String nome;
    protected int quantidade;
    private double preco;
    
    
    public Produto(){
        
    }
    
    public Produto(int id, String nome, int quantidade, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    } 
}
