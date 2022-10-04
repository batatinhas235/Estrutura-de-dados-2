package grafos;

public class MetodoImpressaoGrafos {

    public void grafoAtv1(){
        GrafoMatriz grafo = new GrafoMatriz(10, false, false);
        grafo.adicionarAresta(0, 5);
        grafo.adicionarAresta(0, 6);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 5);
        grafo.adicionarAresta(2, 6);
        grafo.adicionarAresta(2, 9);
        grafo.adicionarAresta(3, 8);
        grafo.adicionarAresta(3, 7);
        grafo.adicionarAresta(4, 1);
        grafo.adicionarAresta(4, 9);
        grafo.adicionarAresta(4, 6);
        grafo.adicionarAresta(5, 2);
        grafo.adicionarAresta(5, 0);
        grafo.adicionarAresta(6, 4);
        grafo.adicionarAresta(6, 2);
        grafo.adicionarAresta(6, 0);
        grafo.adicionarAresta(7, 8);
        grafo.adicionarAresta(7, 3);
        grafo.adicionarAresta(8, 3);
        grafo.adicionarAresta(8, 7);
        grafo.adicionarAresta(9, 2);
        grafo.adicionarAresta(9, 4);

        grafo.imprimirMatriz();

        System.out.println("\n");

        grafo.imprimirArestas();
        System.out.println("\n");
        // System.out.println("Existe conexão ente o vértice 2 e 3?");

        // if (grafo.temAresta(2, 3)) {
        //     System.out.println("Sim");
        //     System.out.println("Valor: " + grafo.getValorAresta(2, 3));
        // } else {
        //     System.out.println("Não");
        // }

    }
    


    
}
