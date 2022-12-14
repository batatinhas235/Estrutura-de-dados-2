package grafosArestas;

import java.util.ArrayList;

public class MostrarGrafoListaPonderado {

    public static void main(String[] args) {
        Grafolistaponderada grafo = new Grafolistaponderada(true, false);

        Vertice a = new Vertice("A");
        Vertice b = new Vertice("B");
        Vertice c = new Vertice("C");
        Vertice d = new Vertice("D");
        Vertice e = new Vertice("E");

        grafo.adicionarVertice(b);
        grafo.adicionarVertice(c);
        grafo.adicionarVertice(d);
        grafo.adicionarVertice(e);

        grafo.adicionarAresta(a, b, 6);
        grafo.adicionarAresta(a, c, 10);
        grafo.adicionarAresta(b, c, 45);
        grafo.adicionarAresta(b, d, 30);
        grafo.adicionarAresta(c, e, 12);
        grafo.adicionarAresta(d, e, 9);

        grafo.imprimirArestas();

        System.out.println("Resultado da busca por profundidade:");
        grafo.buscaProfundidade(a, new ArrayList<>());

        System.out.print("\nResultado Busca por largura:");
        grafo.buscaLargura(a);
    }

}
