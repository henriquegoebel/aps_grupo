
package Model;


import javax.swing.JOptionPane;


public class BebidaGelada extends Produto {
    
     public double ml;
    private String BebidaGelada;
   
    public BebidaGelada() {
        super();
    
    }
    
    public BebidaGelada(int id, String nome, int quantidade, double preco, double ml) {
        super(id, nome, quantidade, preco);
       
        this.ml = ml;
        
    }

    public BebidaGelada(int id, String BebidaGelada) {
      
        this.BebidaGelada = BebidaGelada;
    }
    public class ListaBebida{

        private String ml;
        private String id;
        private String nome;
        private String quantidade;

        /**
         *
         * @param args
         */
  
  }
    
  
    
    
    
    
   
    
    @Override
    public String toString() {
        return nome;
    }
    

  


   public void Dados(){ 
        String texto ="\nId:"+this.id+"\nNome :\n"+this.nome+"\nQuantidade:\n:"+this.quantidade+"\nPreco:\n"+this.getPreco()+"\n"+this.ml+"\nLitros\n";
       JOptionPane.showMessageDialog(null,texto);     
     
    }
       
        
              
        
    }