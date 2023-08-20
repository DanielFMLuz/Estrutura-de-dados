import javax.swing.JOptionPane;

public class Rfuncao {
    static int fatF(int n) {
        if (n == 0) {
            return 1; // Regra 1
        } else {
            // Chamada da função recursiva
            return n * fatF(n - 1); // Regra 2 e 3
        }
    }

    public static void main(String arg[]) {

        int nro;

        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja saber o fatorial"));
        if (nro < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        } else {
            //int f = fatF(nro); // Chamada da função recursiva
            String mensagem = "O fatorial de " + nro + " é " + fatF(nro);
            JOptionPane.showMessageDialog(null, mensagem); // Mostra o resultado em uma caixa de diálogo
        }
    }
}
