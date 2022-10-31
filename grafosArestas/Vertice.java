package grafosArestas;

import java.util.LinkedList;

public class Vertice {
    private String nome;
    private LinkedList<Aresta> arestas;

    public Vertice(String nome) {
        this.nome = nome;
        this.arestas = new LinkedList<>();
    }

    public void adicionarAresta(Vertice destino, Integer peso) {
        // this instacia a propria classe
        this.arestas.add(new Aresta(this, destino, peso));
    }

    public void removerAresta(Vertice destino) {
        this.arestas.removeIf(aresta -> arestas.getLast().equals(destino));
    }

    public LinkedList<Aresta> getArestas() {
        return arestas;
    }

    public String getNome() {
        return nome;
    }
}
