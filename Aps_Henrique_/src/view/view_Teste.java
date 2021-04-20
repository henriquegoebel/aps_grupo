
package view;

import Model.BebidaGelada;
import Model.Cigarro;
import Model.Lanche;
import Model.Produto;

public class view_Teste {

    
    public static void main(String[] args) {
        
        Produto prod = new Produto(0, null, 0, 0);
        
        Lanche p = new Lanche(1, "Hot dog", 9, 8.50,"salgado");
        p.Dados();
        
        
       
        Cigarro pp = new Cigarro (2, "Cigarro", 12, 10.50,"Free");
        pp.Dados();
        
        BebidaGelada bg = new BebidaGelada (3, "Refrigerante", 5, 6.50,3);
        bg.Dados();
    
    }
}


 //inserir produtos
 //criar menu para mostrar/escolher produtos(utilizar método mostrar das classes e subclasses)
//criar coleção de combos (é possível linkar com objeto?)