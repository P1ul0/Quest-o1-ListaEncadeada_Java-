package Entidade;

public class Site {
    private String nomeSite;
    private String linkSite;

    public Site(String nomeSite, String linkSite) {
        this.nomeSite = nomeSite;
        this.linkSite = linkSite;
    }

    public String getNomeSite() {

        return nomeSite;
    }

    public void setNomeSite(String nomeSite) {

        this.nomeSite = nomeSite;
    }

    public String getLinkSite() {

        return linkSite;
    }

    public void setLinkSite(String linkSite) {

        this.linkSite = linkSite;
    }
}
