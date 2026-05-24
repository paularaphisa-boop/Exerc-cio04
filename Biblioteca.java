import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    private int codigo;
    private String nome;
    private String autor;
    private boolean disponivel;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.disponivel = true;
    }
    public String getNome() {
        return nome;
    }
    public String getAutor() {
        return autor;
    }
    public String getStatus () {
        if (disponivel) {
            return "Disponível";
        } else {
            return "Emprestado";
        }
    }
    public boolean estaDisponivel(){
        return disponivel;
    }
    public void emprestar() {
        disponivel = false;
    }
    public void devolver() {
        disponivel = true;
    }
}
public class Biblioteca {     

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar livros");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) { 
                 case 1:
                    System.out.print("Nome do livro: ");
                    String nome = scanner.nextLine();

                    System.out.print("Autor do livro: ");
                    String autor = scanner.nextLine();

                    livros.add(new Livro(nome, autor));

                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Livro livro : livros) {
                            System.out.println("Nome: " + livro.getNome());
                            System.out.println("Autor: " + livro.getAutor());
                            System.out.println("Situação: " + livro.getStatus());
                           System.out.println("-------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Informe o livro para empréstimo:");
                    String livroEmprestimo = scanner.nextLine();
                    boolean encontradoEmprestimo = false;

                    for (Livro livro : livros) {
                        if (livro.getNome().equalsIgnoreCase(livroEmprestimo)) {

                            encontradoEmprestimo = true;

                            if (livro.estaDisponivel()) {
                                livro.emprestar();
                                System.out.println("Livro emprestado com sucesso!");
                                System.out.println("Título: " + livro.getNome());
                                System.out.println("Situação: " + livro.getStatus()); 
                        } else {
                            System.out.println("Livro já está emprestado.");
                        }
                    }
                }
                if (!encontradoEmprestimo) {
                    System.out.println("Livro não encontrado.");
                }
                    break;
                
                case 4:
                    System.out.println("Informe o livro a ser devolvido:");
                    String livroDevolucao = scanner.nextLine();
                    boolean encontradoDevolucao = false;

                    for (Livro livro : livros) {
                        if (livro.getNome().equalsIgnoreCase(livroDevolucao)) {
                            encontradoDevolucao = true;

                            if (!livro.estaDisponivel()) {
                                livro.devolver();
                                System.out.println("Livro devolvido com sucesso!");
                                System.out.println("Título: " + livro.getNome());
                                System.out.println("Situação: " + livro.getStatus());                     
                        } else {
                            System.out.println("O livro já está disponível.");
                        }
                    }
                }
                if (!encontradoDevolucao) {
                    System.out.println("Livro não encontrado.");
                }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
 
