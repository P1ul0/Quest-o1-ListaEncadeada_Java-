package Entidade;

public class Node  {
    private Site valor;
    private  Node prox;

    public Node(Site novo_Link) {

        this.valor = novo_Link;
    }

    public Site getValor() {

        return valor;
    }

    public void setValor(Site valor) {

        this.valor = valor;
    }

    public Node getProx() {

        return prox;
    }

    public void setProx(Node prox) {

        this.prox = prox;
    }
}
