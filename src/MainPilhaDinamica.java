public class MainPilhaDinamica {
    public static void main(String[] args) {

        PilhaDinamica pilha = new PilhaDinamica();

        pilha.empilhar("Sorvete");
        pilha.empilhar("Cereja");
        pilha.empilhar("Chantilly");
        pilha.exibir();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.exibir();
    }
}
