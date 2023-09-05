// Atividade Prática 1 -  Média Aritimética
// Aluno: Daniel Luz   Prof. Lucy Mari
// Data: 05-09-2023

import javax.swing.*;

class BIntNo {
    int valor;
    BIntNo esq, dir;

    BIntNo (int novoValor) {
        valor =  novoValor;
    }
}

class ArvoreBinaria {
    private BIntNo Raiz;

    private BIntNo inserir (BIntNo arvore, int novoNo){
        if (arvore == null) {
            return new BIntNo(novoNo);
        } else {
            if (novoNo < arvore.valor) {
                arvore.esq = inserir(arvore.esq, novoNo);
            } else {
                arvore.dir = inserir(arvore.dir, novoNo);
            }
            return arvore;
        } 
    }

    public void inserirNo (int novoValor){
        Raiz = inserir(Raiz, novoValor);
    }

    private void exibirEsquerdo(BIntNo arv) {
        if (arv != null) {
            exibirEsquerdo(arv.esq);
            JOptionPane.showMessageDialog(null, "Valor: " + arv.valor, "Nó à Esquerda", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void exibirNoEsq() {
        exibirEsquerdo(Raiz);
    }

    private void exibirDireito(BIntNo arv) {
        if (arv != null) {
            exibirDireito(arv.dir);
            JOptionPane.showMessageDialog(null, "Valor: " + arv.valor, "Nó à Direita", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void exibirNoDir () {
        exibirDireito(Raiz);
    }

    public void exibirRaiz() {
        JOptionPane.showMessageDialog(null, "Raiz: " + Raiz.valor, "Raiz", JOptionPane.PLAIN_MESSAGE);
    }

    public void exibirNo() {
        exibirNoEsq();
        exibirRaiz();
        exibirNoDir();
    }

    public void excluirNo(int item) {
        BIntNo tempNo, pai, filho, temp;
    
        tempNo = Raiz;
        pai = null;
        filho = Raiz;
    
        while (tempNo != null && tempNo.valor != item) {
            pai = tempNo;
            if (item < tempNo.valor) {
                tempNo = tempNo.esq;
            } else {
                tempNo = tempNo.dir;
            }
        }
    
        if (tempNo == null) {
            System.out.println("Item não localizado!");
            return;
        }
    
        if (pai == null) {
            if (tempNo.dir == null) {
                Raiz = tempNo.esq;
            } else if (tempNo.esq == null) {
                Raiz = tempNo.dir;
            } else {
                for (temp = tempNo, filho = tempNo.esq; filho.dir != null; temp = filho, filho = filho.dir) {
                }
                
                if (filho != tempNo.esq) {
                    temp.dir = filho.esq;
                    filho.esq = Raiz.esq;
                }
                
                filho.dir = Raiz.dir;
                Raiz = filho;
            }
        } else {
            if (tempNo.dir == null) {
                if (pai.esq == tempNo) {
                    pai.esq = tempNo.esq;
                } else {
                    pai.dir = tempNo.esq;
                }
            } else {
                if (tempNo.esq == null) {
                    if (pai.esq == tempNo) {
                        pai.esq = tempNo.dir;
                    } else {
                        pai.dir = tempNo.dir;
                    }
                } else {
                    for (temp = tempNo, filho = tempNo.esq; filho.dir != null; temp = filho, filho = filho.dir) {
                    }
                    
                    if (filho != tempNo.esq) {
                        temp.dir = filho.esq;
                        filho.esq = tempNo.esq;
                    }
                    
                    filho.dir = tempNo.dir;
                    
                    if (pai.esq == tempNo) {
                        pai.esq = filho;
                    } else {
                        pai.dir = filho;
                    }
                }
            }
        }
    }

}

public class Arvore {

    public static void main(String[] args) {
        ArvoreBinaria arv = new ArvoreBinaria(); // Supondo que a classe ArvoreBinaria já está definida.

        for (int i = 0; i < 5; i++) {
            String inputStr = JOptionPane.showInputDialog("Digite um número inteiro:");
            int num = Integer.parseInt(inputStr);
            arv.inserirNo(num);
        }

        arv.exibirNo();
    }
}