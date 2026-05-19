import java.util.Stack;
public class Biblioteca {  
    private int codigo;
    private String titulo;
    private String autor;
    private boolean status;

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Mostrar aprovados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) { 
    }
} 

