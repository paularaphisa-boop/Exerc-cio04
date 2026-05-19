import java.util.ArrayList;  
public class MediaNotas { 
    public static void main(String[] args) {        
        ArrayList<Double> notas = new ArrayList<>();        
        notas.add(4.6);        
        notas.add(5.2);        
        notas.add(8.9);
        notas.add(9.2);
        double soma = 0;        
        for (Double nota : notas) {            
            soma += nota;        
        }
        double media = soma / notas.size();        
        System.out.println("Média: " + media);
        if (media >= 7) {
            System.out.print("Média da turma igual ou superior a 7.");
        } else {
            System.out.print("Média da turma inferior a 7.");
        }    
    }
    }
    
 
    

