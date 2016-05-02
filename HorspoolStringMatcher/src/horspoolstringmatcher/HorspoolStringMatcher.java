/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horspoolstringmatcher;

/**
 *
 * @author rivendell
 */
public class HorspoolStringMatcher {

    private char[] p, t;       // pattern, text
    private int m, n;          // pattern length, text length
    private static int alphabetsize=256;
    private int[] occ;         // occurence function
    private String matches;    // string of match positions
    private char[] showmatches;// char array that shows matches
    private static String name="Horspool";
    int counter = 0;

    public HorspoolStringMatcher()
    {
        occ=new int[alphabetsize];
    }
       
    /** searches the text tt for the pattern pp
     */ 
    public void search(String tt, String pp)
    {
        setText(tt);
        setPattern(pp);
        horspoolSearch();
    }

    /** sets the text
     */ 
    private void setText(String tt)
    {
        n=tt.length();
        t=tt.toCharArray();
        initmatches();
    }
    
    /** sets the pattern
     */ 
    private void setPattern(String pp)
    {
        m=pp.length();
        p=pp.toCharArray();
        horspoolInitocc();
    }

    /** initializes match positions and the array showmatches
     */ 
    private void initmatches()
    {
        matches="";
        showmatches=new char[n];
        for (int i=0; i<n; i++)
            showmatches[i]=' ';
    }
    
    /** computation of the occurrence function
     */ 
    private void horspoolInitocc()
    {
        int a, j;

        for (a=0; a<alphabetsize; a++)
            occ[a]=-1;

        for (j=0; j<m-1; j++)
        {
            a=p[j];
            occ[a]=j;
        }
    }

    /** searches the text for all occurences of the pattern
     */ 
    private void horspoolSearch()
    {
        int i=0, j;
        while (i<=n-m)
        {
            j=m-1;
            while (j>=0 && p[j]==t[i+j]){
                j--;    
                        
            } 
                
            if (j<0) report(i);
            i+=m-1;
            i-=occ[t[i]];
        }
    }

    /** reports a match
     */
    private void report(int i)
    {
        matches+=i+" ";
        showmatches[i]='^';
    }

    /** returns the match positions after the search
     */ 
    public String getMatches()
    {
        return matches;
    }

    // only for test purposes
    public static void main(String[] args)
    {
        HorspoolStringMatcher stm=new HorspoolStringMatcher();
        System.out.println(name);
        String tt, pp;
          tt="abababaa";
        pp="aba";
        stm.search(tt, pp);
        System.out.println(pp);
        System.out.println(tt);
        System.out.println(stm.showmatches);
        System.out.println(stm.getMatches());
           System.out.println("karşılaştırma sayısı..:"+stm.counter);
        
        tt="123456789098765432111122233344455566677788899900056748392093493029384774589";
        pp="221001";
        stm.search(tt, pp);
        System.out.println(pp);
        System.out.println(tt);
        System.out.println(stm.showmatches);
        System.out.println(stm.getMatches());
        System.out.println("karşılaştırma sayısı..:"+stm.counter);
      
    }

  
    
}
