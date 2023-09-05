import javax.swing.JOptionPane;

public class FilaBiblioteca {
    public static class Fila {
        int tamanho, inicio, fim, total;
        int vetor[];

        Fila(int tam) {
            inicio = 0;
            fim = 0;
            total = 0;
            tamanho = tam;
            vetor = new int[tam];
        }

        public boolean FilaVazia() {
            return total == 0;
        }

        public boolean FilaCheia() {
            return total >= tamanho;
        }

        public void Enfileirar(int elemento) {
            if (!FilaCheia()) {
                vetor[fim] = elemento;
                fim = (fim + 1) % tamanho;
                total = total + 1;
            } else {
                JOptionPane.showMessageDialog(null, "Fila Cheia");
            }
        }

        public int Desenfileirar() {
            int desenfileirado = 0;
            if (!FilaVazia()) {
                desenfileirado = vetor[inicio];
                inicio = (inicio + 1) % tamanho;
                total = total - 1;
            } else {
                JOptionPane.showMessageDialog(null, "Fila Vazia");
            }
            return desenfileirado;
        }

        public void ElementoInicio() {
            if (!FilaVazia()) {
                JOptionPane.showMessageDialog(null, "O primeiro elemento é " + vetor[inicio]);
            } else {
                JOptionPane.showMessageDialog(null, "Fila Vazia");
            }
        }

        public void MostrarFila() {
            if (!FilaVazia()) {
                int aux = inicio;
                for (int i = 1; i <= total; i++) {
                    JOptionPane.showMessageDialog(null, "Elemento " + vetor[aux] + " posição " + i);
                    aux = (aux + 1) % tamanho;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fila Vazia");
            }
        }
    }
}
