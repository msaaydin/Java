package hopcount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivendell
 */
public class ShortestPathFloyd {

    int dist[][], V;
    public ShortestPathFloyd(int vertex) {
        dist = new int[vertex][vertex];
        this.V = vertex;
    }
    int [][] floydWarshall(int graph[][]){
        int i, j, k;
        /* Initialize the solution matrix same as input graph matrix.
        Or we can say the initial values of shortest distances
        are based on shortest paths considering no intermediate
        vertex. */
        for (i = 0; i < V; i++)
           for (j = 0; j < V; j++)
               dist[i][j] = graph[i][j];
    /* Add all vertices one by one to the set of intermediate vertices.
        ---> Before start of a iteration, we have shortest
                distances between all pairs of vertices such that
                the shortest distances consider only the vertices in
                set {0, 1, 2, .. k-1} as intermediate vertices.
        ----> After the end of a iteration, vertex no. k is added
                        to the set of intermediate vertices and the set
                        becomes {0, 1, 2, .. k} */
        for (k = 0; k < V; k++){
                // Pick all vertices as source one by one
                for (i = 0; i < V; i++){
                        // Pick all vertices as destination for the
                        // above picked source
                        for (j = 0; j < V; j++){
                                // If vertex k is on the shortest path from
                                // i to j, then update the value of dist[i][j]
                                if (dist[i][k] + dist[k][j] < dist[i][j])
                                        dist[i][j] = dist[i][k] + dist[k][j];
                        }
                }
        }    
        
        //printSolution(dist);
        return dist;
    }
    void print(int dist[][])
    {
            System.out.println("Following matrix shows the shortest "+
                                            "distances between every pair of vertices");
            for (int i=0; i<V; ++i)
            {
                    for (int j=0; j<V; ++j)
                    {
                            if (dist[i][j]==999)
                                    System.out.print("INF \t");
                            else
                                    System.out.print(dist[i][j]+" \t");
                    }
                    System.out.println();
            }
    }
    static int [][] AdjencyMatrix(int [][] mt){
        int [][] adj = new int[mt.length][mt.length];
        
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
               double uzaklik = Math.sqrt(Math.pow(mt[j][0] - mt[i][0], 2)+Math.pow(mt[j][1] - mt[i][1], 2));
                if (i == j){
                    adj[i][i] = 0;
                    continue;
                }
                if (mt[i][2] >= uzaklik){
                    adj[i][j] = 1;
                 }                
            }
            
        }
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj.length; j++) {
                if ((i !=j) && (adj[i][j])== 0)
                    adj[i][j] = 999;             
                
            }
            
        }
        return adj;
    }
    
    
}
