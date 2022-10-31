package grafosArestas;

import java.util.ArrayList;

public class Grafolistaponderada {
    private ArrayList<Vertice> vertices;
    private boolean ponderado;
    private boolean direcionado;

    public Grafolistaponderada(boolean ponderado, boolean direcionado) {
        this.ponderado = ponderado;
        this.direcionado = direcionado;
        this.vertices = new ArrayList<>();
    }

    public void adicionarVertice(String nome) {
        this.vertices.add(new Vertice(nome));
    }

    public void adicionarAresta(Vertice origem, Vertice destino) {
        Integer peso = null;
        origem.adicionarAresta(destino, peso);

        if (!this.direcionado) {
            destino.adicionarAresta(origem, peso);
        }

    }

    public void adicionarAresta(Vertice origem, Vertice destino, Integer peso) {
        origem.adicionarAresta(destino, peso);

        if (!this.direcionado) {
            destino.adicionarAresta(origem, peso);
        }
    }

    public void removerVertice(Vertice vertice) {
        this.vertices.remove(vertice);
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public Vertice getVeticePorNome(String nome) {
        for (Vertice v : this.vertices) {
            if (v.getNome() == nome) {
                return v;
            }
        }
        return null;
    }

    public  void imprimirGrafo() {
        for (Vertice vertice : vertices) {
            System.out.println(vertice.getNome());
        }
    }

}