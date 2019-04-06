/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

import java.util.Scanner;


/**
 *
 * @author Praktikan
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        for (int i=1;i<=angka;i++){
             for(int j=angka;j>=i;j--){
                 System.out.print(" ");
             }
             for(int k=1;k<=i;k++){
                 System.out.print("*");
             }
             for (int l=1;l<=i-1;l++){
                 System.out.print("*");
             }
             System.out.println();
         }
   for (int i=1;i<=angka+1;i++){
             for(int j=1;j<=i-1;j++){
                 System.out.print(" ");
             }
             for(int z=angka+1;z>=i;z--){
              System.out.print("*");
              }
             for(int k=angka;k>=i;k--){
               System.out.print("*");
               }
             System.out.println("");
         }
    }
    
}
