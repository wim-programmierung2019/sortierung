import java.awt.peer.SystemTrayPeer;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {
    
    /**
     * Sortierung
     */
   public static void main(String[] args){
	        // Implementieren Sie einen Algorithmus für Bubblesort in Java
	        
	        
	        int list[] = {5,4,1,9,6,8};
	        for(;;){
	            boolean b = true;
	            for(int i=0; i<list.length-1;i++){
	                if(list[i]>list[i+1]){
	                    b=false;
	                    int temp = list[i+1];
	                    list[i+1]=list[i];
	                    list[i]=temp;
	                }
	            
	            }
	            if(b==true){
	                for(int i=0; i<list.length;i++){
	                    System.out.print(list[i]);
	                }  
	                break;
	            }
	        }
	    }
}




 
        
        
        
        //JUnitCore junit = new JUnitCore();
        //junit.addListener(new TextListener(System.out));
        //junit.run(SortierungTest.class);

