
package view;

import javax.swing.JOptionPane;
import Model.BebidaGelada;
import Model.Cigarro;
import Model.Lanche;
import java.util.List;
import java.util.ArrayList;
import Model.Pizza;


public class view_Teste {

    
    public static void main(String[] args) {
        
        
        Lanche p = new Lanche(1, "Hot dog", 9, 8.50,"salgado");
        p.Dados();
        
        
       
        Cigarro pp = new Cigarro (2, "Cigarro", 12, 10.50,"Free");
        pp.Dados();
        
        
        
   List<Lanche> lanches = new ArrayList<Lanche>();
        
        Lanche l1 = new Lanche(1, "Xis frango");
        Lanche l2 = new Lanche(2, "Xis carne");
        Lanche l3 = new Lanche(3, "Xis calabresa");
        Lanche l4 = new Lanche(4, "Xis bacon");
        Lanche l5= new Lanche(5, "Xis salada");
        
        lanches.add(l1);
        lanches.add(l2);
        lanches.add(l3);
        lanches.add(l4);
        lanches.add(l5);
        /*
        */
        List<BebidaGelada> bebidas = new ArrayList<BebidaGelada> ();
        
        BebidaGelada b1 = new BebidaGelada(1, "Coca-Cola");
        BebidaGelada b2 = new BebidaGelada(2, "Coca-Cola Zero");
        BebidaGelada b3 = new BebidaGelada(3, "Guaraná");
        BebidaGelada b4 = new BebidaGelada(4, "Fanta Lranja");
      
        bebidas.add(b1);
        bebidas.add(b2);
        bebidas.add(b3);
        bebidas.add(b4);
        
        System.out.println(bebidas);
        //
        //
        //
        bebidas.forEach(b -> {
            b.Dados ();
        });
       
        
        System.out.println(lanches);
        //
        //
        lanches.forEach(l -> {
            l.Dados();
//            System.out.println("Lanche [1]: " + l);
        });

        
       ArrayList<String> lista = new ArrayList<String>();
			
                lista.add("Escolha a opção");
		lista.add("Coca - Cola");
		lista.add("Fanta");
		lista.add("Pepsi");
		
		String nomes = "";
		for(String nome : lista){
			nomes += nome+"\n";
		}
		JOptionPane.showMessageDialog(null, nomes);
	
        

        
    }
}
    




    
    


 //inserir produtos
 //criar menu para mostrar/escolher produtos(utilizar método mostrar das classes e subclasses)
//criar coleção de combos (é possível linkar com objeto?)