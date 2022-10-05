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
        }else{
          this.fim.setProx(node);
        }
        this.fim = node;
    }
    
    public void procurar(String nomeSite){
      Node p = this.inicio;
      Node ant = null;
      while(p != null){
          if(p.getValor().getNomeSite().equalsIgnoreCase(nomeSite)){
              System.out.println("o site é :" + p.getValor().getLinkSite());
              if(p.equals(this.fim)){
                  p.setProx(this.inicio);
                  this.inicio = p;
                  this.fim = ant;
                  ant.setProx(null);
              } else if (p.equals(this.inicio)){
                break;
              }else {
                  ant.setProx(p.getProx());
                  p.setProx(this.inicio);
                  this.inicio = p;
              }
              break;
          }
          ant = p;
          p = p.getProx();
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
