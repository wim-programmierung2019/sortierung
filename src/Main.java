import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {
    
    /**
     * Sortierung
     */
    public static void main(String[] args){
        // Implementieren Sie einen Algorithmus für Bubblesort in Java
        int[] unsortiert = new int[10];
        int[] sortiert = new int[10];   
        unsortiert[0] = 48;   
        unsortiert[1] = 9;
        unsortiert[2] = 37;
        unsortiert[3] = 12;
        unsortiert[4] = 24;
        unsortiert[5] = 16;
        unsortiert[6] = 95;
        unsortiert[7] = 455;
        unsortiert[8] = 162;
        unsortiert[9] = 244;
        
        
        //Ausgabe unsortiert
        System.out.println("Unsortiert ");
        for(int  i = 0; i< unsortiert.length; i++)
            {
                System.out.println("Zahl an der Stelle " + i + " " + unsortiert[i]);   
            }        
		
		//Aufruf der Methode
		sortiert=bubblesort(unsortiert);
		
		//Ausgabe sortiert
		System.out.println("Sortiert: ");
        for (int  i = 0; i< sortiert.length; i++)
            {
                System.out.println("Zahl an der Stelle " + i + " " + sortiert[i]);   
            }
	}
        
        
        public static int[] bubblesort (int[] zusortieren) {
            int zwischenwert;
            for(int i=1; i<zusortieren.length; i++) {
			     for(int j=0; j<zusortieren.length-i; j++) {
        				if(zusortieren[j]>zusortieren[j+1]) {
					      zwischenwert=zusortieren[j];
    					zusortieren[j]=zusortieren[j+1];
					   zusortieren[j+1]=zwischenwert;
        				}
			         }

			         }
			return zusortieren;
		      }
        
        
        
        
        //JUnitCore junit = new JUnitCore();
        //junit.addListener(new TextListener(System.out));
        //junit.run(SortierungTest.class);
    
    
}
