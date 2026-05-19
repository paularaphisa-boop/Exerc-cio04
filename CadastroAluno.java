import java.util.HashMap;
public class CadastroAluno {
       public static void main(String[] args) {        
        HashMap<Integer, String> alunos = new HashMap<>();        
        alunos.put(1035, "Carlos Eduardo");        
        alunos.put(1068, "Bruno Miguel");        
        alunos.put(1089, "Kelly Cristiane");        
        System.out.println(alunos);  
        System.out.println(alunos.get(1089)); 
        System.out.println(alunos.remove(1068));
    }
}

