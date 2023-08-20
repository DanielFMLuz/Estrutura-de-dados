public class Pilha {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public Pilha(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("Pilha cheia, não é possível empilhar " + value);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Pilha vazia, não é possível desempilhar.");
            return -1; // Valor de retorno de erro
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Pilha vazia.");
            return -1; // Valor de retorno de erro
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);

        // Mostrar o topo da pilha
        System.out.println("Estado da pilha:");
        pilha.mostrarTopo();

        // Empilhar elementos
        pilha.push(5);
        pilha.push(8);
        pilha.push(4);
        pilha.push(7); // Não será possível empilhar este valor

        // Mostrar o estado da pilha
        System.out.println("Estado da pilha após empilhar:");
        pilha.mostrarPilha();

        // Desempilhar elementos
        pilha.pop();
        pilha.pop();

        // Mostrar o topo da pilha
        System.out.println("Estado da pilha após desempilhar:");
        pilha.mostrarTopo();

        // Desempilhar elementos
        pilha.pop();
        pilha.pop();
    }

    private void mostrarPilha() {
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("Pilha: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    private void mostrarTopo() {
        if (!isEmpty()) {
            System.out.println("Elemento no topo: " + stackArray[top]);
        } else {
            System.out.println("Pilha vazia.");
        }
    }
}
