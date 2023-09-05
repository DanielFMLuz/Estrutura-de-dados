import javax.swing.JOptionPane;

public class AlgoritimoFilaPares {
    public static void main(String[] args) {
        FilaBiblioteca.Fila fila = new FilaBiblioteca.Fila(10);
        int i, entrada = 0;

        for (i = 1; i <= 10; i++) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(
                                "Digite um valor inteiro"));
            if (entrada % 2 == 0) {
                fila.Enfileirar(entrada);
            }  
        }
        fila.MostrarFila();
    }
}
