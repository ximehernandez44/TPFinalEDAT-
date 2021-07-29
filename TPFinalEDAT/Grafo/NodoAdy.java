package grafo;

public class NodoAdy {
    private NodoVert vertice;
    private NodoAdy sigAdyacente;
    private int etiqueta;

    public NodoAdy() {
        //
    }

    public NodoVert getVertice() {
        return vertice;
    }

    public NodoAdy getSigAdyacente() {
        return sigAdyacente;
    }

    public int getEtiqueta() {
        return etiqueta;
    }

    public void setVertice(NodoVert vertice) {
        this.vertice = vertice;
    }

    public void setSigAdyacente(NodoAdy sigAdyacente) {
        this.sigAdyacente = sigAdyacente;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }
}