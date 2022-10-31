package grafosArestas;

public class Aresta {
    private Vertice origem;
    private Vertice destino;
    private Integer peso;

    public Aresta(Vertice origem, Vertice destino, Integer peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public Vertice getDestino() {
        return destino;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Integer getPeso() {
        return peso;
    }
}
