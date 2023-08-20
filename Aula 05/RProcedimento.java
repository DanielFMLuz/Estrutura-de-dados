import javax.swing.JOptionPane;

public class RProcedimento {
    static void fatP(int n, int x, int f) {

        if (x == 0 || x == 1) {
            String mensagem = "O fatorial de " + n + " é " + f;
            JOptionPane.showMessageDialog(null, mensagem); // Mostra o resultado em uma caixa de / Regra 1 
        } else {
            fatP(n, x - 1, f * x); // Regra 2 e 3
        }
    }

    public static void main(String arg[]) {

        int nro;

        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja saber o fatorial"));
        if (nro < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        } else {
            fatP(nro, nro, 1); // Chamada da função recursiva
        }
    }
}
