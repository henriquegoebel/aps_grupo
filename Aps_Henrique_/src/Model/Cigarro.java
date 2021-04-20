
package Model;

import javax.swing.JOptionPane;


public class Cigarro extends Produto{
    
 public String marca;
    
    public Cigarro () {
        super();
    
    }
    
    public Cigarro(int id, String nome, int quantidade, double preco,String marca) {
        super(id, nome, quantidade, preco);
        this.marca = marca;
    }
    
   
     @Override
      public void Dados(){
          
      String texto ="Id:"+this.id+"\nNome :\n"+this.nome+"\nQuantidade:\n"+this.quantidade+"\nPreco\n"+this.getPreco()+"\nMarca\n"+this.marca;
       JOptionPane.showMessageDialog(null,texto); 
    }
   
    
}

