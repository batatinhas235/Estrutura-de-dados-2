package grafos;

public class MostrarGrafoLista {
    public static void main(String[] args) {
        grafoLista grafo = new grafoLista(false);

        No a = new No(0, "A");
        No b = new No(1, "B");
        No c = new No(2, "C");
        No d = new No(3, "D");
        No e = new No(4, "E");

        grafo.adicionarAresta(a, b);
        grafo.adicionarAresta(a, c);
        grafo.adicionarAresta(b, c);
        grafo.adicionarAresta(c, e);

        grafo.imprimirArestas();

        System.out.println();
        System.out.println("=========================================");
        System.out.println();

        grafoLista grLista = new grafoLista(false);

        No noLista1 = new No(0, "5");
        No noLista2 = new No(0, "6");

        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(1, "4");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista2 = new No(2, "5");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista2 = new No(2, "6");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(2, "9");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista2 = new No(3, "8");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista2 = new No(3, "7");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(4, "1");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(4, "9");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(4, "6");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(5, "2");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(5, "0");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista2 = new No(6, "4");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista2 = new No(6, "2");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(6, "0");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(7, "8");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(7, "3");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(8, "3");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(8, "7");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(9, "2");
        grLista.adicionarAresta(noLista1, noLista2);
        noLista1 = new No(9, "4");
        grLista.adicionarAresta(noLista1, noLista2);

        grLista.imprimirArestas();
    }
}
