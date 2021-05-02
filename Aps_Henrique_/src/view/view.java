
package view;

import javax.swing.JOptionPane;
import Model.BebidaGelada;
import Model.Cigarro;
import Model.Lanche;
import java.util.List;
import java.util.ArrayList;
import Model.Pizza;


public class view {

    
    public static void main(String[] args) {
        
        
        String opcao = "s";
        
        List<Lanche> listaLanche = new ArrayList<>();
        List<BebidaGelada> listaBebidaGelada = new ArrayList<>();
        List<Cigarro> listaCigarro = new ArrayList<>();
        List<Pizza> listaPizza = new ArrayList<>();
        
        
        while(!opcao.equalsIgnoreCase("n")){
            String texto = "Digite sue opção: \n" +
                    "1 - Adicionar Lanche \n" +
                    "2 - Adicionar Bebida Gelada \n" + 
                    "3 - Adicionar Cigarro \n" +
                    "4 - Adicionar Pizza \n" +
                    "5 - Remover Lanches \n" +
                    "6 - Remover Bebidas Geladas \n" +
                    "7 - Remover Cigarros \n" +
                    "8 - Remover Pizzas \n" +
                    "9 - Listar Lanches \n" +
                    "10 - Listar Bebidas Geladas \n" +
                    "11 - Listar Cigarros \n" +
                    "12 - Listar Pizzas \n" +
                    "n - Sair ";
            opcao = JOptionPane.showInputDialog(texto);
        
        
            switch (opcao){
                case "1": 
                    Lanche l = new Lanche();
                    String nome = JOptionPane.showInputDialog("Nome do Lanche:");
                    l.setNome(nome);
                    
                    String preco = JOptionPane.showInputDialog("Preço:");
                    preco = preco.replace(",",".");
                    l.setPreco(Double.valueOf(preco));
                    
                    String qtd = JOptionPane.showInputDialog("Quantidade do Lanche:");
                    qtd = qtd.replace(",",".");
                    l.setQuantidade(Integer.valueOf(qtd));

                    listaLanche.add(l);
                    
                    break;
                
                case "2": 
                    BebidaGelada bg = new BebidaGelada();
                    String nomebg = JOptionPane.showInputDialog("Nome da Bebida Gelada:");
                    bg.setNome(nomebg);
                    
                    String precobg = JOptionPane.showInputDialog("Preço:");
                    precobg = precobg.replace(",",".");
                    bg.setPreco(Double.valueOf(precobg));
                    
                    String qtdbg = JOptionPane.showInputDialog("Quantidade da Bebida Gelada:");
                    qtdbg = qtdbg.replace(",",".");
                    bg.setQuantidade(Integer.valueOf(qtdbg));

                    listaBebidaGelada.add(bg);
                    
                    break;
            
                    
                    
                case "3": 
                    Cigarro c = new Cigarro();
                    String nomeCig = JOptionPane.showInputDialog("Nome do Cigarro:");
                    c.setNome(nomeCig);
                    
                    String precoCig = JOptionPane.showInputDialog("Preço:");
                    precoCig = precoCig.replace(",",".");
                    c.setPreco(Double.valueOf(precoCig));
                    
                    String qtdCig = JOptionPane.showInputDialog("Quantidade do Cigarro:");
                    qtdCig = qtdCig.replace(",",".");
                    c.setQuantidade(Integer.valueOf(qtdCig));

                    listaCigarro.add(c);
                    
                    break;
                
                    
                case "4": 
                    Pizza p = new Pizza();
                    String nomePiz = JOptionPane.showInputDialog("Nome da Pizza:");
                    p.setNome(nomePiz);
                    
                    String precoPiz = JOptionPane.showInputDialog("Preço:");
                    precoCig = precoPiz.replace(",",".");
                    p.setPreco(Double.valueOf(precoPiz));
                    
                    String qtdPiz = JOptionPane.showInputDialog("Quantidade da Pizza:");
                    qtdPiz = qtdPiz.replace(",",".");
                    p.setQuantidade(Integer.valueOf(qtdPiz));

                    listaPizza.add(p);
                    
                    break;
               
                case "5": 
                    int posicao = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaLanche.remove(posicao);
                    break;
                    
                    
                case "6": 
                    int posicaoBg = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaBebidaGelada.remove(posicaoBg);
                    break;
                
                case "7": 
                    int posicaoCig = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaCigarro.remove(posicaoCig);
                    break;
            
                    
                case "8": 
                    int posicaoPiz = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaPizza.remove(posicaoPiz);
                    break;
                    
                    
                case "9":
                    String conteudo = "";
                    for (Lanche lanche : listaLanche) {
                        conteudo += lanche.getNome()+ "\n";
                       
                    }
                    JOptionPane.showConfirmDialog(null, conteudo);
                    break;
                    
                    
                case "10":
                    String conteudoBg = "";
                    for (BebidaGelada bebGel : listaBebidaGelada) {
                        
                        conteudoBg += bebGel.getNome()+ "\n";
                       
                    }
                    JOptionPane.showConfirmDialog(null, conteudoBg);
                    break;
                    
                case "11":
                    String conteudoCig = "";
                    for (Cigarro cigarro : listaCigarro) {
                        conteudoCig += cigarro.getNome()+ "\n";
                       
                    }
                    JOptionPane.showConfirmDialog(null, conteudoCig);
                    break;
                    
                case "12":
                    String conteudoPiz = "";
                    for (Pizza pizza : listaPizza) {
                        conteudoPiz += pizza.getNome()+ "\n";
                    }
                 
                    JOptionPane.showConfirmDialog(null, conteudoPiz);
                    break;
                
                    
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Incorreta");
            }
        } 
    }
    
}
