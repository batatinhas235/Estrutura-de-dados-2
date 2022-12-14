// package grafosArestas;

// public class teste {
 
// public class GrafoListaPonderado{
//     private ArrayList<Vertice> vertices;
//     private boolean ponderado;
//     private boolean direcionado;

//     public GrafoListaPonderado(boolean ponderado, boolean direcionado){
//         this.ponderado = ponderado;
//         this.direcionado = direcionado;

//         this.vertices = new ArrayList<>();
//     }

//     public void adicionarVertice(Vertice vertice) {

//         this.vertices.add(vertice);
//     }

//     //public void adicionarVertice(Vertice vertice) {
//         //this.vertices.add(
//             //new Vertice(nome) 
//             //);
//     //}

//     public void adicionarAresta(Vertice origem, Vertice destino){
//         Integer peso = null;

//         origem.adicionarAresta(destino, peso);

//         if(!this.direcionado){
//             destino.adicionarAresta(origem, peso);
//         }
//     }

//     public void adicionarAresta(Vertice origem, Vertice destino, Integer peso){
//         origem.adicionarAresta(destino, peso);

//         if(!this.direcionado){
//             destino.adicionarAresta(origem, peso);
//         }
//     }

//     public void RemoverVertice(Vertice vertice){
//         this.vertices.remove(vertice);
//     }

//     public ArrayList<Vertice> getVertives(){
//         return vertices;
//     }

//     public Vertice getVerticePorNome (String nome){
//         for(Vertice v: this.vertices){
//             if(v.getNome()== nome){
//                 return v;
//             }
//         }
//         return null;
//     }

//     public void buscaProfundidade(Vertice inicio, ArrayList<Vertice> verticesVisitados){
//         System.out.print("\t"+inicio.getNome());
//         for(Aresta a : inicio.getAresta()){
//             Vertice vizinho = a.getDestino();
//             if(! verticesVisitados.contains(vizinho));
//             verticesVisitados.add(vizinho);
//             this.buscaProfundidade(vizinho, verticesVisitados);
//         }

//         //imprimirLista(verticesVisitados);
//     }


    
//     public void imprimirArestas(){
//         for(Vertice v : this.vertices ){
//             System.out.print("O vertice"+ v.getNome()+ "tem as conexoes:"+v.getDestino());
//             if(v.getAresta().size() > 0 ){
//                 for(Aresta a : v.aresta()){
//                     System.out.print("\t"+a.getDestino().getNome());
//                     if(this.ponderado){
//                         System.out.print("("+a.getPeso() +")");
//                     }
//                 }
//             }else{
//                 System.out.print("nenhuma conexão");
//         }    
//             System.out.println();
//         }

//     }

//    // public void imprimirLista(ArrayList<Vertice>lista){
//         //for(Vertice v : lista){
//          //   System.out.print("\t" + v.getNome());
//         //}
//        // System.out.println();
//     //}
// }   
// }
