
package warshallalgorithm;

/**
 *
 * @author rivendell
 */
public class WarShallAlgorithm {
    private int V;    
    private boolean[][] tc;
 /** Function to make the transitive closure
     * @param graph **/
    public void getTC(int[][] graph)
    {
        this.V = graph.length;
        tc = new boolean[V][V];
        for (int i = 0; i < V; i++) 
        {    
            for (int j = 0; j < V; j++) 
                if (graph[i][j] != 0)
                    tc[i][j] = true;
            tc[i][i] = true;
        }
        for (int i = 0; i < V; i++) 
        {
            for (int j = 0; j < V; j++) 
            {
                if (tc[j][i]) 
                    for (int k = 0; k < V; k++) 
                        if (tc[j][i] && tc[i][k]) 
                            tc[j][k] = true;             
            }
        }
    }
    /** Funtion to display the trasitive closure **/
    public void displayTC()
    {
        System.out.println("\nTransitive closure :\n");
        System.out.print(" ");
        for (int v = 0; v < V; v++)
           System.out.print("   " + v );
        System.out.println();
        for (int v = 0; v < V; v++) 
        {
            System.out.print(v +" ");
            for (int w = 0; w < V; w++) 
            {
                if (tc[v][w]) 
                    System.out.print("  * ");
                else                  
                    System.out.print("    ");
            }
            System.out.println();
        }
    }    
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Warshall Algorithm Test\n");
        /** Make an object of Warshall class **/
        WarShallAlgorithm w = new WarShallAlgorithm();
         int graph[][] = {{0, 1, 0, 1, 1}, {1, 0, 0, 1, 0}, {0, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {1, 0, 1, 0, 0}};
         w.getTC(graph);
         w.displayTC();
    }
    
}
