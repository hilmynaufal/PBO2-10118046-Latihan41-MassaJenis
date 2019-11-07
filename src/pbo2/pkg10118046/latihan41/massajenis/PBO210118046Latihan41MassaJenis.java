/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung volume dan massa jenis kubus
 */
public class PBO210118046Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        System.out.println("======Massa Jenis Kubus======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisi: "); kubus.setSisi(scanner.nextInt());
        System.out.print("Massa: "); kubus.setMassa(scanner.nextInt());
        
        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("Volume: " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis: " + kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
        
    }

}
