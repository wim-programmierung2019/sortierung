import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {
    
    /**
     * Sortierung
     */
    public static void main(String[] args){
        // Implementieren Sie einen Algorithmus für Bubblesort in Java
        
        int list[] = {5,4,1,9,6,8};
        
        // Variante mit 2 for-Schleifen
        for(int j=0; j<list.length;j++){
            for(int i=0; i<list.length-1;i++){
                // Tauschvorgang mit Zwischenspeicherung,
                // falls der naechste Wert groesser ist
                if(list[i]>list[i+1]){
                    int temp = list[i+1];
                    list[i+1]=list[i];
                    list[i]=temp;
                }
            
            }
        }
        
        // Variante mit do-while-Schleife
        boolean fertigSortiert;
        do{
            fertigSortiert = true;
            for(int i=0; i<list.length-1;i++){
                if(list[i]>list[i+1]){
                    fertigSortiert=false;
                    int temp = list[i+1];
                    list[i+1]=list[i];
                    list[i]=temp;
                }
            
            }
            
        } while(fertigSortiert == false);
        
        // Ausgabe
        for(int i=0; i<list.length;i++){
            System.out.print(list[i]);
        }
        
        
        //JUnitCore junit = new JUnitCore();
        //junit.addListener(new TextListener(System.out));
        //junit.run(SortierungTest.class);
    }
    
}
