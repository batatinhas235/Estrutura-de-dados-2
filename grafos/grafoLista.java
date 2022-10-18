package grafos;

import java.util.HashMap;
import java.util.LinkedList;

public class grafoLista {
    private boolean direcionado;
    private HashMap<No, LinkedList<No>> mapaAdjacencia;

    public grafoLista(boolean direcionado) {
        this.direcionado = direcionado;
        mapaAdjacencia = new HashMap<>();
    }

    public void adicionarAresta(No origem, No destino) {
        if (!mapaAdjacencia.keySet().contains(origem)) {
            mapaAdjacencia.put(origem, null);
        }
        if (!mapaAdjacencia.keySet().contains(destino)) {
            mapaAdjacencia.put(destino, null);
        }

        adicionarArestaHelper(origem, destino);

        if (!direcionado) {
            adicionarArestaHelper(destino, origem);
        }
    }

    public void adicionarArestaHelper(No origem, No destino) {
        LinkedList<No> temp = mapaAdjacencia.get(origem);

        if (temp != null) {
            temp.remove(destino);
        } else {
            temp = new LinkedList<>();
        }

        temp.add(destino);

        mapaAdjacencia.put(origem, temp);
    }

    public void imprimirArestas() {
        for (No no : mapaAdjacencia.keySet()) {
            System.out.print("o " + no.getNome() + " tem as ligações: ");
            if (mapaAdjacencia.get(no)!= null) {
                for (No destino : mapaAdjacencia.get(no)) {
                    System.out.print("\t"+destino.getNome());
                }
                System.out.println();
                
            }else{
                System.out.println("nenhuma");
            }
        }
    }
}
