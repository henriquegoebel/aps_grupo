
package Model;

import javax.swing.JOptionPane;


    public abstract class Produto {
    public int id;
    public String nome;
    private int quantidade;
    protected double preco;
    public Categoria categoria;
    
    
    public abstract void cadastrar();
    public abstract void imprimir();
    public abstract void excluir();
    protected abstract void zerarEstoque();

    
    public Produto(){
        
    }

    public Produto(int id, String nome, int quantidade, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    } 

    public Produto(int id, String nome, int quantidade, double preco, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }
        
    
    public String Dados(){
          
        return "\n id:"+this.id+"\nNome :\n"+this.nome+"\nQuantidade:\n"+this.quantidade+"\nPreco"+this.preco;
 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0)
            this.quantidade = quantidade;
        else
            System.out.println("Quantidade não pode ser menor que Zero!");    
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
        else
            System.out.println("Preço não pode ser menor que Zero!");    
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
   
    
    
    
    
    
}
