import javax.swing.JOptionPane;

public class PilhaBiblioteca {
    public static class Pilha {
        int tamanho;
        int topo;
        int vetor[];

        Pilha(int tam) {
            topo = -1;
            tamanho = tam;
            vetor = new int[tam];
        }

        public boolean PilhaVazia() {
            return topo == -1;
        }

        public boolean PilhaCheia() {
            return topo >= tamanho - 1;
        }

        public void Empilhar(int elemento) {
            if (!PilhaCheia()) {
                topo++;
                vetor[topo] = elemento;
            } else {
                JOptionPane.showMessageDialog(null, "A pilha está cheia. Não é possível empilhar mais elementos.");
            }
        }

        public int Desenpilhar() {
            int desempilhado = 0;

            if (PilhaVazia()) {
                JOptionPane.showMessageDialog(null, "A pilha está vazia. Não é possível desempilhar.");
            } else {
                desempilhado = vetor[topo];
                topo--;
            }

            return desempilhado;
        }

        public void ElementoTopo() {
            if (topo >= 0) {
                JOptionPane.showMessageDialog(null, "O elemento do topo é: " + vetor[topo]);
            } else {
                JOptionPane.showMessageDialog(null, "A pilha está vazia. Não há elemento no topo.");
            }
        }

        public void MostrarPilha() {
            String pilhaStr = "Conteúdo da pilha:\n";
            
            for (int i = topo; i >= 0; i--) {
                pilhaStr += "Posição " + (i+1) + ": " + vetor[i] + "\n";
            }
            
            JOptionPane.showMessageDialog(null, pilhaStr);
        }
    }
}
