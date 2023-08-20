import javax.swing.JOptionPane;

public class Algoritimo {
    public static void main(String arg []) {
        PilhaBiblioteca.Pilha intPilha = new PilhaBiblioteca.Pilha(5);
        int i;
        int entrada;

        for(i=1; i<=5; i++){
            entrada = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Digite um valor inteiro"));
            intPilha.Empilhar(entrada);
        }
        intPilha.MostrarPilha();
        System.exit(0);
    }
}
