/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajioop;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GajiOOP {
    String nama;
    String alamat;
    int departemen;
    int pengalaman;
    int skill;
    int gaji;
    
    public GajiOOP(String nama, String alamat, int departemen, int pengalaman, int skill) {
        this.nama = nama;
        this.alamat = alamat;
        this.departemen = departemen;
        this.pengalaman = pengalaman;
        this.skill = skill;
    }
    
    public int pendapatan() {
        int gajiDasar = 0;
        switch (departemen) {
            case 1:
                gajiDasar = 8000000;
                break;
            case 2:
                gajiDasar = 5000000;
                break;
            case 3:
                gajiDasar = 4000000;
                break;
            default:
                System.out.println("NOT FOUND");
                break;
        }
        
        int bonus1 = 0;
        switch (pengalaman) {
            case 1:
                bonus1 = 500000;
                break;
            case 2:
                bonus1 = 1000000;
                break;
            case 3:
                bonus1 = 2000000;
                break;
            default:
                System.out.println("NOT FOUND");
                break;
        }
        
        int bonus2 = 0;
        switch (skill) {
            case 1:
                bonus2 = 1000000;
                break;
            case 2:
                bonus2 = 2000000;
                break;
            case 3:
                bonus2 = 2500000;
                break;
            default:
                System.out.println("NOT FOUND");
                break;
        }
        gaji = gajiDasar + bonus1 + bonus2;
        return gaji;
    }
    
    public void tampilgaji() {
        System.out.println("Gaji "+ nama +" adalah "+ gaji);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Departemen (1.IT 2.HRD 3.FINANCE): ");
        int departemen = scanner.nextInt();
        
        System.out.print("Pengalaman (1.pemula 2.menengah 3.expert): ");
        int pengalaman = scanner.nextInt();

        System.out.print("Skill (1.web 2.mobile 3.desktop): ");
        int skill = scanner.nextInt();
        
        GajiOOP karyawan = new GajiOOP(nama, alamat, departemen, pengalaman, skill);
        karyawan.pendapatan();
        
        karyawan.tampilgaji();
    }
    
} 
