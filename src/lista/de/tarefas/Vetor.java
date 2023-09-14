package lista.de.tarefas;

import java.util.Arrays;

/**
 *
 * @author ryann
 */

public class Vetor {
    
    //Metodos private
    private String[] dados;
    private int tamanho;

    public Vetor(int capacidade) {
        dados = new String[capacidade];
        tamanho = 0;
    }

    //Adiciona os itens a lista caso tente colocar mais itens que o escolhido no inicio irá para o ELSE
    public void adicionar(String valor) {
        if (tamanho < dados.length) {
            dados[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Capacidade máxima atingida.");
        }
    }

    //Recebe o indice que vai ser removido caso o indice for maior irá cair no ELSE
    public void remover(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                dados[i] = dados[i + 1];
            }
            tamanho--;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    //Mostra a lista
    public String[] listar() {
        return Arrays.copyOf(dados, tamanho);
    }

    public int tamanho() {
        return tamanho;
    }
}