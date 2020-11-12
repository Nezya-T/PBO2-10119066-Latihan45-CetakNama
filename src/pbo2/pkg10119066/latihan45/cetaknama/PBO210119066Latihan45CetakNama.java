/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan45.cetaknama;
import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Nim      : 10119066
 * Kelas    : IF2
 */
public class PBO210119066Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukkan Nama Anda : ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
        
    }
    
}
