public class PilhaDinamica {
    No inicio;

    public PilhaDinamica() {
        this.inicio = null;
        System.out.println("A pilha dinâmica foi criada!");
    }

    private boolean estaVazia(){
        if (this.inicio == null) {
            System.out.println("A pilha não possui nenhum elemento!");
            return true;
        } else {
            return false;
        }
    }

    public void empilhar(String elemento) {
        if (elemento == null){
            System.out.println("Elemento inválido!");
        } else {
            No novo = new No(elemento);
            novo.prox = this.inicio;
            this.inicio = novo;
            System.out.println("O elemento " + elemento + " foi adicionado na pilha!");
        }
    }

    public void desempilhar(){
        if (estaVazia()) {
            System.out.println("Não existem elementos para remover!");
        } else {
            inicio = inicio.getProx();
            System.out.println("O elemento foi retirado da pilha!");
        }
    }

    public void exibir() {
        if (!estaVazia()) {
            No aux = this.inicio;
            while (aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

}
