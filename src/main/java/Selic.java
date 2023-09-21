public class Selic {

    private Selic() {}
    private static Selic instance = new Selic();
    public static Selic getInstance() {
        return instance;
    }

    private float taxaSelic;
    private String ultimaAtualizacao;

    public float getTaxaSelic() {
        return taxaSelic;
    }

    public void setTaxaSelic(float taxaSelic) {
        this.taxaSelic = taxaSelic;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
}
