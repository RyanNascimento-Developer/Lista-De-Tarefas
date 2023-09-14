package lista.de.tarefas;

 import java.util.Scanner;

/**
 *
 * @author ryann
 */

public class ListaDeTarefas {

    public static void main(String[] args) {
        
        //Scanner utilizado para receber informação do usuario 
        Scanner scanner = new Scanner(System.in);

        //Pega o tamanho que o usuario quer para seu vetor
        System.out.print("Informe a capacidade do vetor: ");
        
        // Consumir a quebra de linha e pega a capacidade do vetor
        int capacidade = scanner.nextInt();
        scanner.nextLine();  

        //pega a capacidade que o usuario digitou e criou um vetor
        Vetor vetor = new Vetor(capacidade);

        //Opões 
        while (true) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 -> Adicionar elemento");
            System.out.println("2 -> Remover elemento");
            System.out.println("3 -> Listar elementos");
            System.out.println("4 -> Sair");

            // Consumir a quebra de linha e pega a opcao escolhida
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                
                case 1:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    String elemento = scanner.nextLine();
                    vetor.adicionar(elemento);
                    System.out.println("Elemento adicionado com sucesso.");
                    break;
                
                case 2:
                    System.out.print("Digite o índice do elemento a ser removido: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); 
                    vetor.remover(indice);
                    System.out.println("Elemento removido com sucesso.");
                    break;
                
                case 3:
                    String[] elementos = vetor.listar();
                    System.out.println("Elementos no vetor:");
                    for (int i = 0; i < elementos.length; i++) {
                        System.out.println(i + ": " + elementos[i]);
                    }
                    break;
                
                case 4:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                
                //Caso digite uma opção diferente 
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}