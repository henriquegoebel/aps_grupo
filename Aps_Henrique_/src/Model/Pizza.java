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

    public Pizza(int i, String calabresa, int i0, int i1, int i2) {
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

//    @Override
//    public String toString() {
//        return "Pizza{" + "molho=" + molho + ", recheio=" + recheio + ", borda=" + borda + '}';
//    }

    @Override
      public void Dados(){
          
      String texto ="Id:"+this.id+"\nNome :\n"+this.nome+"\nQuantidade:\n"+this.quantidade+"\nPreco\n"+this.getPreco();
       JOptionPane.showMessageDialog(null,texto); 
    }
    
    
}
    

