
package Model;


import javax.swing.JOptionPane;


public class BebidaGelada extends Produto {
    
    public double mls;
    
   
    public BebidaGelada() {
        super();
    
    }
    
    public BebidaGelada(int id, String nome, int quantidade, double preco, double mls) {
        super(id, nome, quantidade, preco);
       
        this.mls = mls;
        
    }


    @Override
    public void cadastrar() {
        
    }

    @Override
    public void imprimir() {
        System.out.println("\nNome: " + this.nome + 
                "\nPreço: " + this.preco +
                "\nQuantidade: " + this.getQuantidade() +
                "\nMililitros: " + this.mls);
        
    }

    @Override
    public void excluir() {
           this.zerarEstoque();
           System.out.println("Bebida Gelada excluída:" + nome);
    }

    @Override
    protected void zerarEstoque() {
        this.setQuantidade(0);

    }
    
    @Override
    public String toString() {
        return nome;
    }
  

    @Override
    public String Dados(){ 
        System.out.println("\nNome: " + this.nome + 
                "\nPreço: " + this.preco +
                "\nQuantidade: " + this.getQuantidade() +
                "\nMililitros: " + this.mls);
            return "";
     
    }

    public double getMls() {
        return mls;
    }

    public void setMls(double mls) {
        this.mls = mls;
    }
       
        
              
        
}