/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat;

import java.util.Scanner;

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
        int n = 0;
        
        Scanner beker = new Scanner(System.in);
        
        System.out.print("Kérem adja meg 'n' értékét:  ");
        n = beker.nextInt();
         
        
        System.out.println("A páros számok: ");
        for ( i = 0; i <= n; i++  ){
            
            if ( i % 2 == 0 ){
                
                System.out.print( i + ", ");
                
            }
            
        }
        
        System.out.println("\n");
        
        System.out.println("A páratlan számok: ");
        for ( i = 0; i <= n; i++  ){
            
            if ( i % 2 >= 1 ){
                
                System.out.print( i + ", ");
                
            }
            
        }
        
        System.out.println("\n");
        
        //Krappai Sándor
        
        int osszeg = 0;
        System.out.println("A számok összege "+n+"-ig");
        for ( i = 0; i <= n; i++  ){
            osszeg = osszeg + i; 
        }
        System.out.println("A számok összege: "+osszeg);
        
        int sz=1;
        System.out.println("A számok szorzata "+n+"-ig");
        for(i = 1; i < n; i++){
            sz = sz*i;
        }
        System.out.println("A számok szorzata: "+sz);
    
        System.out.println("\n");
        
        System.out.println("A szám pozitív vagy negatív?");
        if (n >= -2){ //Itt a hiba, -2 helyett 0 kell.
            System.out.println("A szám pozitív");
        }else System.out.println("A szám páratlan");
    
    
    }
   
}
