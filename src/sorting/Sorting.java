/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Eng-Eman S.Salem
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num []=new int[10];
        System.out.println("ENTER 10 NUMBERS");
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<10;i++){
            num[i]=input.nextInt();
             
        }
        for(int i=0 ; i<10;i++){
            System.out.println(num[i]);
            
            
        }
             InsertionSort(num);
  
    }
    public static void InsertionSort(int[]num){
         
        for(int j=1 ;j <10 ;j++){
            int key = num[j];
            int i= j-1 ;
        }
}
}