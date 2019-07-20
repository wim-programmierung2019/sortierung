import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {
    
    /**
     * Sortierung
     */
    public static void main(String[] args){
        // Implementieren Sie einen Algorithmus für Bubblesort in Java
        /**Main bsort = new Main(); 
        int[] sortList = bsort.sort();*/
        int[] list={5,4,1,9,6,8};
        int[] sortList=sort(list);
        for(int i=0;i<list.length;i++){
        System.out.print(list[i]);
        } 
    }

    public static int[] sort(int [] zusortieren){
        int k; //hilfsvariable
        for(int i =1; i<zusortieren.length;i++){
            for(int j =0; j<zusortieren.length-1;j++){
            if(zusortieren[j]>zusortieren[j+1]){
                k=zusortieren[j];
                zusortieren[j]=zusortieren[j+1];
                zusortieren[j+1]=k;
            }else{
                continue;
                }
            }
        }
        return zusortieren;
           
        
        //JUnitCore junit = new JUnitCore();
        //junit.addListener(new TextListener(System.out));
        //junit.run(SortierungTest.class);
  }
 }
    

