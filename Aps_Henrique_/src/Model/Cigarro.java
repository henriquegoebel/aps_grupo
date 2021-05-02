
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
      public String Dados(){
          System.out.println("\nNome: " + this.nome + 
                  "\nPreço: " + this.preco +
                  "\nQuantidade: " + this.getQuantidade() +
                  "\nMarca: " + this.marca);
            return ""; 
    }

    @Override
    public void cadastrar() {
        
    }

    @Override
    public void imprimir() {
        System.out.println("\nNome: " + this.nome + 
                "\nPreço: " + this.preco +
                "\nQuantidade: " + this.getQuantidade() +
                "\nMarca: " + this.marca);
        
    }

    @Override
    public void excluir() {
        this.zerarEstoque();
           System.out.println("Cigarro excluído:" + nome);
        
    }

    @Override
    protected void zerarEstoque() {
        this.setQuantidade(0);    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    
}

