/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Puzzle {
    public static void main(String [] args) {
        int x = 0;
        
        while ( x < 4){
           if (x < 1){
               System.out.print("a ");
               System.out.print("noise");
           }
           if (x > 3){
               System.out.print("n");
               System.out.print("oise");
           }
           if (x == 1){
               System.out.print("annoys");
           }
           if (x > 2){
               System.out.print("an");
               System.out.print(" oyster");
           }           
           System.out.println("");
           x = x + 1;
        }
    }
}
