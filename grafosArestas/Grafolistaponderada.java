// package grafosArestas;

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;

// public class Grafolistaponderada {
//     private ArrayList<Vertice> vertices;
//     private boolean ponderado;
//     private boolean direcionado;

//     public Grafolistaponderada(boolean ponderado, boolean direcionado) {
//         this.ponderado = ponderado;
//         this.direcionado = direcionado;
//         this.vertices = new ArrayList<>();
//     }

//     public void adicionarVertice(Vertice vertice) {
//         this.vertices.add(vertice);
//     }

//     public void adicionarAresta(Vertice origem, Vertice destino) {
//         Integer peso = null;
//         origem.adicionarAresta(destino, peso);

//         if (!this.direcionado) {
//             destino.adicionarAresta(origem, peso);
//         }

//     }

//     public void adicionarAresta(Vertice origem, Vertice destino, Integer peso) {
//         origem.adicionarAresta(destino, peso);

//         if (!this.direcionado) {
//             destino.adicionarAresta(origem, peso);
//         }
//     }

//     public void removerVertice(Vertice vertice) {
//         this.vertices.remove(vertice);
//     }

//     public ArrayList<Vertice> getVertices() {
//         return vertices;
//     }

//     public Vertice getVeticePorNome(String nome) {
//         for (Vertice v : this.vertices) {
//             if (v.getNome() == nome) {
//                 return v;
//             }
//         }
//         return null;
//     }

//     public void buscaProfundidade(Vertice inicio, ArrayList<Vertice> verticesVisitados) {
//         System.out.print("\t" + inicio.getNome());
//         for (Aresta a : inicio.getArestas()) {
//             Vertice vizinho = a.getDestino();
//             if (!verticesVisitados.contains(vizinho)) {

//                 verticesVisitados.add(vizinho);
//                 this.buscaProfundidade(inicio, verticesVisitados);

//             }

//         }

//         // imprimirLista(verticesVisitados);
//     }

//     public void buscaLargura(Vertice inicio) {
//         ArrayList<Vertice> verticesVisitados = new ArrayList<>();
//         verticesVisitados.add(inicio);

//         Queue<Vertice> visitadosFila = new LinkedList<>();
//         visitadosFila.add(inicio);

//         while (!visitadosFila.isEmpty()) {
//             Object atual = visitadosFila.remove();
//             System.out.println("\t" + ((Vertice) atual).getNome());

//             for (Aresta a : ((Vertice) atual).getArestas()) {
//                 Vertice vizinho = a.getDestino();

//                 if (!verticesVisitados.contains(vizinho)) {
//                     verticesVisitados.add(vizinho);
//                     visitadosFila.add(vizinho);
//                 }
//             }
//         }
//     }

//     // public void imprimirGrafo() {
//     // for (Vertice vertice : this.vertices) {
//     // System.out.println(vertice.getNome());
//     // }
//     // }

//     public void imprimirArestas() {
//         for (Vertice v : this.vertices) {
//             System.out.print("O vertice " + v.getNome() + " tem as conexoes: " + v.getArestas());
//             if (v.getArestas().size() > 0) {
//                 for (Aresta a : v.getArestas()) {
//                     System.out.print("\t" + a.getDestino().getNome());
//                     if (this.ponderado) {
//                         System.out.print("(" + a.getPeso() + ")");
//                     }
//                 }
//             } else {
//                 System.out.print("nenhuma conexão");
//             }
//             System.out.println();
//         }

//     }

// }

package grafosArestas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class Grafolistaponderada {
    private ArrayList<Vertice> vertices;
    private boolean ponderado;
    private boolean direcionado;

    public Grafolistaponderada(boolean ponderado, boolean direcionado) {
        this.ponderado = ponderado;
        this.direcionado = direcionado;
        this.vertices = new ArrayList<>();
    }

    public void adicionarVertice(Vertice vertice) {
        this.vertices.add(vertice);
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

    public void buscaProfundidade(Vertice inicio, ArrayList<Vertice> verticesVisitados) {
        System.out.print("\t" + inicio.getNome());
        for (Aresta a : inicio.getArestas()) {
            Vertice vizinho = a.getDestino();
            if (!verticesVisitados.contains(vizinho)){
                
            verticesVisitados.add(vizinho);
            this.buscaProfundidade(vizinho, verticesVisitados);
        }
        }
        // imprimirLista(verticesVisitados);
    }

    public void buscaLargura(Vertice inicio) {
        ArrayList<Vertice> verticesVisitados = new ArrayList<>();
        verticesVisitados.add(inicio);

        Queue<Vertice> visitadosFila = new LinkedList<>();
        visitadosFila.add(inicio);

        while (!visitadosFila.isEmpty()) {
            Object atual = visitadosFila.remove();
            System.out.println("\t"+((Vertice) atual).getNome());

            for (Aresta a : ((Vertice) atual).getArestas()) {
                Vertice vizinho = a.getDestino();

                if (!verticesVisitados.contains(vizinho)) {
                    verticesVisitados.add(vizinho);
                    visitadosFila.add(vizinho);
                }
            }
        }
    }

    // public void imprimirGrafo() {
    // for (Vertice vertice : this.vertices) {
    // System.out.println(vertice.getNome());
    // }
    // }

    public void imprimirArestas() {
        for (Vertice v : this.vertices) {
            System.out.print("O vertice" + v.getNome() + "tem as conexoes:" + v.getArestas());
            if (v.getArestas().size() > 0) {
                for (Aresta a : v.getArestas()) {
                    System.out.print("\t" + a.getDestino().getNome());
                    if (this.ponderado) {
                        System.out.print("(" + a.getPeso() + ")");
                    }
                }
            } else {
                System.out.print("nenhuma conexão");
            }
            System.out.println();
        }

    }

}
