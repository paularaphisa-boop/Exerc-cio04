import java.util.ArrayList;
public class ListaCompras {    
    public static void main(String[] args) {        
        ArrayList<String> produtos = new ArrayList<>();        
        produtos.add("Detergente");        
        produtos.add("Sabão em pó");        
        produtos.add("Sal");
        produtos.add("Arroz"); 
        produtos.add("Ovos");         
        System.out.println(produtos);  
        System.out.println("Quantidade de produtos: " + produtos.size());  
    }
    
}