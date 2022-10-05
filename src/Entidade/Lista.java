package Entidade;

public class Lista {
    private Node inicio;
    private Node fim;

    public Lista() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(Site novoSite){
        Node node = new Node(novoSite);
        if (this.inicio == null){
            this.inicio = node;
            this.fim = node;
        }else{
          node.setProx(this.fim);
          this.fim = node;
        }
    }

    public void  print(){
        Node p = this.inicio;
        while (p != null){
            System.out.println(p.getValor().getNomeSite());
            System.out.println(p.getValor().getLinkSite());
            p = p.getProx();
        }
    }

}
