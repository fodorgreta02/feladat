/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat;

/**
 *
 * @author HP
 */
public class Feladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // A projekt létre lett hozva
        
        //Fodor Gréta Dominika
        
        int i;
        
        System.out.println("A páros számok: ");
        for ( i = 0; i <= 10; i++  ){
            
            if ( i % 2 == 0 ){
                
                System.out.print( i + ", ");
                
            }
            
        }
        
        System.out.println("\n");
        
        System.out.println("A páratlan számok: ");
        for ( i = 0; i <= 10; i++  ){
            
            if ( i % 2 >= 1 ){
                
                System.out.print( i + ", ");
                
            }
            
        }
        
        System.out.println("\n");
        
        
    }
    
}
