public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(3);

        pilhaSimples.empilhar(6);
        pilhaSimples.empilhar(7);
        pilhaSimples.empilhar(8);
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.exibir();

    }
}
