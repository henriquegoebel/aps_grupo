
package Model;

import javax.swing.JOptionPane;


    public class Produto {
    public int id;
    public String nome;
    protected int quantidade;// ver sobre metodo protected//
    private double preco;
    
    
    public Produto(){
        
    }

    
    
    public Produto(int id, String nome, int quantidade, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    } 
    
    
    public void Dados(){
          
      String texto = "\n id:"+this.id+"\nNome :\n"+this.nome+"\nQuantidade:\n"+this.quantidade+"\nPreco"+this.preco;
       JOptionPane.showMessageDialog(null,texto);   
 
    }
   
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
