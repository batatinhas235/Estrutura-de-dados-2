package grafos;

public class GrafoMatriz {
    private int numeroVertices;
    private boolean direcionado;
    private boolean ponderado;
    private int[][] matriz;

    private boolean[][] isSetMatriz;

    public GrafoMatriz(int numeroVertices, boolean direcionado, boolean ponderado) {
        this.numeroVertices = numeroVertices;
        this.direcionado = direcionado;
        this.ponderado = ponderado;

        this.matriz = new int[numeroVertices][numeroVertices];
        this.isSetMatriz = new boolean[numeroVertices][numeroVertices];
    }

    public void adicionarAresta(int origem, int destino) {
        int aresta = 1;

        if (ponderado) {
            aresta = 0;
        }

        matriz[origem][destino] = aresta;
        isSetMatriz[origem][destino] = true;

        if (!direcionado) {
            matriz[destino][origem] = aresta;
            isSetMatriz[destino][origem] = true;
        }

    }

    public void adicionarAresta(int origem, int destino, int peso) {
        int aresta = peso;

        if (!ponderado) {
            aresta = 1;
        }

        matriz[origem][destino] = aresta;
        isSetMatriz[origem][destino] = true;

        if (!direcionado) {
            matriz[destino][origem] = aresta;
            isSetMatriz[destino][origem] = true;
        }

    }

    public void imprimirMatriz(){
        System.out.print("\t");
        for(int i = 0; i< numeroVertices; i++){
            System.out.print(i + "\t");
        }
        System.out.println("\n\t-------------------------------------");
        for (int i = 0; i < numeroVertices; i++) {
            System.out.print(i+"|\t");
            for (int j = 0; j < numeroVertices; j++) {
                if (isSetMatriz[i][j]) {
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }

    public boolean temAresta(int origem, int destino){
        return isSetMatriz[origem][destino];
    }

    public Integer getValorAresta(int origem, int destino){
        if (!ponderado || !isSetMatriz[origem][destino]) {
            return null;
        } 
        return matriz[origem][destino];
    }
}