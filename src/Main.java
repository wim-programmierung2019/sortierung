import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {
    
    
    /**
     * Sortierung
     */
    public static void main(String[] args){
        // Implementieren Sie einen Algorithmus für Bubblesort in Java
        int[] zahlen= new int[4];
        zahlen[0] = 10;
        zahlen[1] = 5;
        zahlen [2] = 17;
        zahlen [3] = 13;
        bubbleSort(zahlen);
        
        
        
        
        
        //JUnitCore junit = new JUnitCore();
        //junit.addListener(new TextListener(System.out));
        //junit.run(SortierungTest.class);
    }
    
    public static void bubbleSort(int m[]){
        boolean sortiert = false;
        int count = 0;
        while(sortiert = false){
            count = 0;
            for(int i =0;i<m.length;i++){
                if(m[i]>m[i+1]){
                int x = m[i];
                int y = m[i+1];
                m[i] = y;
                m[i+1] =x;
                count++;
                }

            }
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m[2]);
        System.out.println(m[3]);
            if(count==0){
                sortiert = true;
            }
            
        }
    }
    
}
