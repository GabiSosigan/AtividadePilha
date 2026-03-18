public class PilhaSimples {
    Integer [] pilha;
    int tamanho;
    int topo = -1;

    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new Integer[tamanho];
        System.out.println("A pilha foi criada! Ela possui tamanho: " + tamanho + "!" );
    }

    private boolean estaCheia() {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.pilha[i] == null) {
                return false;
            }
        }
        System.out.println("A Pilha está cheia!");
        return true;
    }

    private boolean estaVazio() {
        if(this.pilha[0] == null) {
            System.out.println("A Pilha está vazia.");
            return true;
        } else {
            return false;
        }
    }

    public void empilhar(int valor) {
        if(!estaCheia()) {
            for (int i = 0; i < this.tamanho; i++) {
                if(this.pilha[i] == null) {
                    this.pilha[i] = valor;
                    System.out.println("O valor " + valor + " foi inserido na Pilha!");
                    topo++;
                    return;
                }
            }
        }
        System.out.println("Não é possível adicionar mais elementos!");
    }

    public void desempilhar(){
        if(!estaVazio()) {
            this.pilha[topo] = null;
            topo--;
        } else {
            System.out.println("A pilha está vazia! Não existem elementos para desempilhar!");
        }
    }

    public void exibir() {
        if(!estaVazio()) {
            for (int i = 0; i < this.tamanho; i++) {
                System.out.print(this.pilha[i] + " ");
            }
        }
    }

}
