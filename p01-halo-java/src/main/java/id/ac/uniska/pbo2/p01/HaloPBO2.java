/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p01;

/**
 *
 * @author USER
 */
public class HaloPBO2 {
    
    public static void main(String[] args) {
        String nama = "Mahasiswa Teknik Informatika";
        
        System.out.println("Halo, " + nama + "!");
        System.out.println("Selamat datag di Pemrograman Berbasis Object 2.");
        System.out.println();
        
        //INFORMASI JAVA YANG SEDANG DIGUNAKAN
        System.out.println("Versi Java      : " + System.getProperty("java.version"));
        System.out.println("Vendor JDK      : " + System.getProperty("java.vendor"));
        System.out.println("Sistem Operasi  : " + System.getProperty("os.name"));
    }
    
}
