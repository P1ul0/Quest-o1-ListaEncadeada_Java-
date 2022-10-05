import Entidade.Lista;
import Entidade.Site;

public class Main {
    public static void main(String[] args) {
        Site s = new Site("Github","https://github.com/");
        Site s1 = new Site("Github2","https://github.com/");
        Site s2 = new Site("Github3","https://github.com/");
        Lista l = new Lista();
        l.inserir(s);
        l.inserir(s1);
        l.inserir(s2);
        l.procurar("Github3");
        l.procurar("Github2");
        l.print();
    }
}