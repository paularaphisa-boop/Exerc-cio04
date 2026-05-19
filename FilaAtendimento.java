import java.util.LinkedList;
import java.util.Queue;
    public class FilaAtendimento {
    public static void main(String[] args) {        
        Queue<String> fila = new LinkedList<>();        
        fila.add("Larissa");        
        fila.add("Carlos");        
        fila.add("Miguel"); 
        fila.add("Alberto");
        fila.add("Cassio");       
        System.out.println("Fila: " + fila);              
        System.out.println("Atendido: " + fila.poll());
        System.out.println("Atendido: " + fila.poll());        
        System.out.println("Fila atual: " + fila);    
    }
}

