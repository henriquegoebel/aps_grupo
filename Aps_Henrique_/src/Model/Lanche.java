
package Model;

import javax.swing.JOptionPane;


public class Lanche extends Produto {
    
    public boolean salgado;
 
    
    public Lanche() {
        super();
    
    }
    
    public Lanche(int id, String nome, int quantidade, double preco,boolean salgado) {
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
    public String Dados(){
            System.out.println("\nNome: " + this.nome + 
                "\nPreço: " + this.preco +
                "\nQuantidade: " + this.getQuantidade() +
                "\nSalgado? " + this.salgado);
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
                "\nSalgado? " + this.salgado);        

    }

    @Override
    public void excluir() {
        this.zerarEstoque();
        System.out.println("Lanche excluído:" + nome);

    }

    @Override
    protected void zerarEstoque() {
        this.setQuantidade(0);
        
    }

    public boolean isSalgado() {
        return salgado;
    }

    public void setSalgado(boolean salgado) {
        this.salgado = salgado;
    }
   
    
}
    
 