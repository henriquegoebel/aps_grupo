
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

    public Lanche(int id, String nome) {
        this.id =id;
        this.nome=nome;
       
    }

    @Override
    public String toString() {
        return nome;
    }
    
   


    
    @Override
      public void Dados(){
          
       String texto ="\nPreco\n"+this.getPreco()+"\nLanche+ ==> qualidade:\n"+"\nId:"+this.id+"\nNome :\n"+this.nome+"\nQuantidade:\n"+this.quantidade+this.salgado;
        JOptionPane.showMessageDialog(null,texto);  
    }
   
    
}
    
 