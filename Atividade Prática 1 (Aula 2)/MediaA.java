// Atividade Prática 1 -  Média Aritimética
// Aluno: Daniel Luz   Prof. Lucy Mari
// Data: 19-07-2023

import javax.swing.*;

class MediaA {
    public static void main(String[] args) {
        int VetMedia [], i , soma = 0, num = 0, media = 0;
        VetMedia = new int [50];

        for (i = 0; i<=49; i++) {
            VetMedia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            num++; //acrescentei esta variável ao projeto para que não ficasse fixo em 50
            soma = soma + VetMedia[i];
        }

        media = soma/num;

        System.out.println("A media das notas digitadas é: " + media);
        
        System.exit(0);
    }
}