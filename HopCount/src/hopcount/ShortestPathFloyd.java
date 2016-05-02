package hopcount;

public class ShortestPathFloyd {

    int dist[][], V;
    public ShortestPathFloyd(int vertex) {
        dist = new int[vertex][vertex];
        this.V = vertex;
    }
    int [][] floydWarshall(int graph[][]){
        int i, j, k;
       // input matrisinin boyutlarında üzerinde işlem yapılacak 
       // matris oluşturuluyor.
        for (i = 0; i < V; i++)
           for (j = 0; j < V; j++)
               dist[i][j] = graph[i][j];    
        for (k = 0; k < V; k++){
                //  bütün node lar kaynak olarak tek tek almak işlemi yapılıyor.
                for (i = 0; i < V; i++){
                // tüm node ları hedef node olarak tek tek almak için 
                //2. döngü oluşturuluyor 
                        for (j = 0; j < V; j++){                               
                        // aşağıdaki if yapısında eğer herhangi bir k node u
                        // i ile j arasında en kısa yol ise dist matrisinin i ve j 
                        // noktasındaki değeri güncelleme işlemi yapılıyor.
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
        // bu metod komşuluk matrisinin oluşturulması işlemini 
        // yerine getirmektedir. node sayısı kadar square bir matris 
        //oluşturulmaktadır.
        int [][] adj = new int[mt.length][mt.length];
        
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
               // double tipindeki uzaklık değeri herbir node un diğer node lara olan 
               // uzaklık bilgisinin tutulduğu değişkendir.
               // sqrt((x2-x1)^2+(y2-y1)^2) hesabından uzaklık bulunmakta
               double uzaklik = Math.sqrt(Math.pow(mt[j][0] - mt[i][0], 2)+Math.pow(mt[j][1] - mt[i][1], 2));
                if (i == j){
                    adj[i][i] = 0;
                    continue;
                }
                // hesaplanan uzaklık değeri eğer o andaki node un yarıçapı ile
                // kesişiyor ise o alan 1 olarak yani erişim var olarak işaretleniyor
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
