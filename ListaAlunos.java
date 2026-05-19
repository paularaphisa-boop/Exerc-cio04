import java.util.HashSet;
public class ListaAlunos {
    public static void main(String[] args) {        
        HashSet<String> nomes = new HashSet<>();        
        nomes.add("Larissa");        
        nomes.add("Eduardo");        
        nomes.add("Larissa");  
        nomes.add("Carlos");      
        System.out.println(nomes); 
        System.out.println("Quantidade de alunos: " + nomes.size());   
    }
}

