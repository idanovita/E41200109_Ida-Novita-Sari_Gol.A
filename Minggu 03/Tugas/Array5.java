/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Array;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Array5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        String nama;
        int angka;
        
        System.out.println("====================================================================");
        System.out.println("                             CAVE CERIA                             ");
        System.out.println("                            Aneka Minuman                           ");
        System.out.println("====================================================================");
        System.out.println("         SPECIAL MENU                                               ");
        System.out.println("                       1. Soft Drink                                ");
        System.out.println("                       2. Mix Juice                                 ");
        System.out.println("                       3. Nescafe                                   ");
        System.out.println("                       4. Soda Milk                                 ");
        System.out.println("                       5. Tea                                       ");
        System.out.println("====================================================================");
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        System.out.println("");
        System.out.print("Masukkan pilihan anda : ");
        angka = scan.nextInt();
        
        switch (angka) {
        case 1:
            System.out.println("Minuman yang anda pesan adalah Soft Drink");
            System.out.println("Pesanan anda akan segera kami antar");
            break;
        case 2:
            System.out.println("Minuman yang anda pesan adalah Mix Juice");
            System.out.println("Pesanan anda akan segera kami antar");
            break;
        case 3:
            System.out.println("Minuman yang anda pesan adalah Nescafe");
            System.out.println("Pesanan anda akan segera kami antar");
            break;
        case 4:
            System.out.println("Minuman yang anda pesan adalah Soda Milk");
            System.out.println("Pesanan anda akan segera kami antar");
            break;
        case 5:
            System.out.println("Minuman yang anda pesan adalah Tea");
            System.out.println("Pesanan anda akan segera kami antar");
            break;
        default:
            System.out.println("Menu tidak tersedia");
            
    }
        
        System.out.println("Terima Kasih "+nama+" telah berkunjung di Cave Ceria");

    }
    
}
