import Entidade.Lista;
import Entidade.Site;

public class Main {
    public static void main(String[] args) {
        Site s = new Site("Github","https://github.com/");
        Lista l = new Lista();
        l.inserir(s);
        l.print();
    }
}