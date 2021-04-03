/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Statement;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Batas Nilai Awal = ");
        int awal = in.nextInt();
        System.out.print("Masukkan Batas Nilai Akhir = ");
        int akhir = in.nextInt();
        
        for (int i = awal; i <= akhir; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
    }
    
}
