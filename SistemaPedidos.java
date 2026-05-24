import java.util.ArrayList;
import java.util.Scanner;

class Pedido {
    private int codigo;
    private String nomeCliente;
    private String item;
    private double valor;
    private String status;

    public Pedido(int codigo, String item, double valor, String status) {
        this.codigo = codigo;
        this.item = item;
        this.valor = valor;
        this.status = "PENDENTE";
    }
    public int getCodigo() {
        return codigo;
    }
    public String getItem() {
        return item;
    }
    public double getValor() {
        return valor;
    }
    public String getStatus () {
        return status;
    }
    public void setStatus (String status) {
        this.status = status;
    }
}
public class SistemaPedidos {     

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Listar pedido");
            System.out.println("3 - Atualizar status de um pedido");
            System.out.println("4 - Buscar pedido pelo número");
            System.out.println("5 - Mostrar valor total dos pedidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) { 
                 case 1:
                    System.out.print("Número do pedido: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Item pedido: ");
                    String item = scanner.nextLine();
                    
                    System.out.print("Valor do pedido: ");
                    double valor = scanner.nextDouble();
                    

                    System.out.print("Situação: ");
                    String status = scanner.nextLine();
                    

                    pedidos.add(new Pedido(codigo, item, valor, status));

                    System.out.println("Pedido cadastrado com sucesso!");
                    break;

                case 2:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido cadastrado.");
                    } else {
                        for (Pedido pedido : pedidos) {
                            System.out.println("Número do pedido: " + pedido.getCodigo());
                            System.out.println("Item pedido: " + pedido.getItem());
                            System.out.println("Valor: R$ " + pedido.getValor());
                            System.out.println("Situação: " + pedido.getStatus());
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Informe o número do pedido:");
                    int codigoPedido = scanner.nextInt();
                    scanner.nextLine();

                    boolean encontradoStatus = false;

                    for (Pedido pedido : pedidos) {
                        if (pedido.getCodigo() == codigoPedido) {

                            encontradoStatus = true;

                            System.out.println("Status atual: " + pedido.getStatus());

                            System.out.println("1 - PENDENTE");
                            System.out.println("2 - PREPARANDO");
                            System.out.println("3 - FINALIZADO");

                            System.out.print("Escolha o novo status: ");
                            int novoStatus = scanner.nextInt();
                            scanner.nextLine();

                            switch (novoStatus) {
                                case 1:
                                    pedido.setStatus("PENDENTE");
                                    break;

                                case 2:
                                    pedido.setStatus("PREPARANDO");
                                    break;

                                case 3:
                                    pedido.setStatus("FINALIZADO");
                                    break;

                                default:
                                    System.out.println("Opção inválida.");
                            }
                            System.out.println("Status atualizado com sucesso!");
                        }
                    }
                    if (!encontradoStatus) {
                        System.out.println("Pedido não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Informe o número do pedido: ");
                    int numeroBusca = scanner.nextInt();
                    scanner.nextLine();

                    boolean encontradoBusca = false;

                    for (Pedido pedido : pedidos) {
                        if (pedido.getCodigo() == numeroBusca) {
                            
                            encontradoBusca = true;

                                System.out.println("Número do pedido: " + pedido.getCodigo());
                                System.out.println("Item pedido: " + pedido.getItem());
                                System.out.println("Valor: R$ " + pedido.getValor());
                                System.out.println("Situação: " + pedido.getStatus());                     
                        }
                        }
                    if (!encontradoBusca) {
                        System.out.println("Pedido não encontrado.");
                    }
                    break;
               case 5:

                    double total = 0;

                    for (Pedido pedido : pedidos) {
                        total += pedido.getValor();
                    }

                    System.out.println("Valor total dos pedidos: R$ " + total);

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
 
