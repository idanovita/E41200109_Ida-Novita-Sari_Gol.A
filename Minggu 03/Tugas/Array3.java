/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Array;

/**
 *
 * @author user
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] angka = {{2,6,1,5,9},{12,13,7,4,8},{11,3,14,18,10}};
        for (int baris = 0; baris < 3; baris++){
            for(int kolom= 0; kolom <5; kolom++) {
                System.out.print(angka[baris][kolom]+"  ");
            }
            System.out.println("");
        }
    }
    
}
