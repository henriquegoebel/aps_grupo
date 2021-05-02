package Model;

import javax.swing.JOptionPane;

public class Pizza extends Produto {
 
    private String molho;
    private String recheio;
    private String borda;
    

    public Pizza() {
    }

    public Pizza(String molho, String recheio, String borda) {
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
    }

    public Pizza(String molho, String recheio, String borda, int id, String nome, int quantidade, double preco) {
        super(id, nome, quantidade, preco);
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
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
                "\nMolho: " + this.molho +
                "\nRecheio: " + this.recheio +
                "\nBorda: " + this.borda);
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
                "\nMolho: " + this.molho +
                "\nRecheio: " + this.recheio +
                "\nBorda: " + this.borda);
        
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
    
    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }
    
}
    

