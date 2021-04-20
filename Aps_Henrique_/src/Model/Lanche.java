
package Model;

import javax.swing.JOptionPane;


public class Lanche extends Produto {
    
    public String salgado;
 
    
     public Lanche() {
        super();
    
    }
    
    public Lanche(int id, String nome, int quantidade, double preco,String salgado) {
        super(id, nome, quantidade, preco);
       
        this.salgado = salgado;
        
    }
    
    
    
    @Override
    
      public void Dados(){
          
       String texto ="\nId:"+this.id+"\nNome :\n"+this.nome+"\nQuantidade:\n"+this.quantidade+"\nPreco\n"+this.getPreco()+"\nLanche ==> qualidade:\n"+this.salgado;
        JOptionPane.showMessageDialog(null,texto);  
    }
   
    
}
    
 