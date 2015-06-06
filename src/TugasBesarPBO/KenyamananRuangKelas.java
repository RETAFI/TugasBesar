/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TugasBesarPBO;

import java.util.Scanner;

/**
 *
 * @author Fikri
 */
public class KenyamananRuangKelas extends KenyamananRuangKelasSG{
    Scanner fikri = new Scanner(System.in);
    public KenyamananRuangKelas(String Kebisingan, String Bau, String Kebocoran, String Kerusakan, String Keausan) {
        super(Kebisingan, Bau, Kebocoran, Kerusakan, Keausan);
    }

    @Override
    public void Input() {
        System.out.print("Apakah Ruang Kelas Bising : ");
        setKebisingan(fikri.nextLine());
        System.out.print("Apakah Ruang Kelas Bau : ");
        setBau(fikri.nextLine());
        System.out.print("Apakah Ruang Kelas Bocor : ");
        setKebocoran(fikri.nextLine());
        System.out.print("Apakah Ruang Kelas Rusak : ");
        setKerusakan(fikri.nextLine());
        System.out.print("Apakah Ruang Kelas Aus : ");
        setKeausan(fikri.nextLine());  
        System.out.print("\n");
    }

    @Override
    public String AnalisisKebisingan() {
        //super.getKebisingan();
        //System.out.println("Ruang Kelas "+getKebisingan());
        if ("Tidak Bising".equals(getKebisingan()) || "tidak bising".equals(getKebisingan())) {
            System.out.println("Ruang Kelas Tidak Bising (sesuai)");           
        }
        else if ("Bising".equals(getKebisingan()) ||"bising".equals(getKebisingan())){
            System.out.println("Ruang Kelas Bising (Tidak Sesuai)");    
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return getKebisingan();
    }

    @Override
    public String AnalisisBau() {
        //super.getBau();
        //System.out.println("Ruang Kelas "+getBau());
        if ("Tidak Bau".equals(getBau()) || "tidak bau".equals(getBau())) {
            System.out.println("Ruang Kelas Tidak Bau (Sesuai)");
        }
        else if ("Bau".equals(getBau()) || "bau".equals(getBau())){
            System.out.println("Ruang Kelas Bau (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return getBau();
    }

    @Override
    public String AnalisisBocor() {
        //super.getKebocoran();
        //System.out.println("Ruang Kelas "+getKebocoran());
        if ("Tidak Bocor".equals(getKebocoran()) || "tidak bocor".equals(getKebocoran())) {
            System.out.println("Ruang Kelas Tidak bocor (Sesuai)");
        }
        else if ("bocor".equals(getKebocoran()) || "Bocor".equals(getKebocoran())){
            System.out.println("Ruang Kelas Bocor (Tidak Sesuai");
        }
        else{
            System.out.println("(Inputan salah)");
        }
        return getKebocoran();
    }
    
    @Override
    public String AnalisisRusak() {
        //super.getKerusakan();
        //System.out.println("Ruang Kelas "+getKerusakan);
        if ("Tidak Rusakk".equals(getKerusakan()) || "tidak rusak".equals(getKerusakan())) {
            System.out.println("Ruang Kelas tidak rusak (Sesuai)");
        }
        else if ("Rusak".equals(getKerusakan()) || "rusak".equals(getKerusakan())){
            System.out.println("Ruang Kelas rusak (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return getKerusakan();
    }

    @Override
    public String AnalisisAus() {
        //.getKeausan();
        //System.out.println("Ruang Kelas "+getKeausan());
        if ("tidak aus".equals(getKeausan()) || "Tidak Aus".equals(getKeausan())) {
            System.out.println("Ruang Kelas Tidak Aus (Sesuai)");
        }
        else if ("aus".equals(getKeausan()) || "Aus".equals(getKeausan())){
            System.out.println("Ruang Kelas Aus (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return getKeausan();
    }

    @Override
    public void Output() {
        super.getKebisingan();
        super.getBau();
        super.getKebocoran();
        super.getKerusakan();
        super.getKeausan();
    }
    
}
