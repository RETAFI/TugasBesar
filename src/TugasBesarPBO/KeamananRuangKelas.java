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
public class KeamananRuangKelas extends KeamananRuangKelasSG{
    Scanner fikri = new Scanner(System.in);
    public KeamananRuangKelas(String Kekokohan, String KunciPintu, String Jendela, String Bahaya) {
        super(Kekokohan, KunciPintu, Jendela, Bahaya);
    }

    @Override
    public void Input() {
        System.out.print("apakah ruang kelas Kokoh/tidak : ");
        setKekokohan(fikri.nextLine());
        System.out.print("apakah kunci ada/tidak : ");
        setKunciPintu(fikri.nextLine());
        System.out.print("apakah jendela ada/tidak : ");
        setJendela(fikri.nextLine());
        System.out.print("apakah ruang kelas aman/tidak : ");
        setBahaya(fikri.nextLine());
        System.out.print("\n");
    }

    @Override
    public String AnalisisKekokohan() {
        //super.getKekokohan();
        //System.out.print("ruang kelas "+getKekokohan());
        if ("kokoh".equals(getKekokohan()) || "Kokoh".equals(getKekokohan())){
            System.out.println("Ruang Kelas Kokoh (Sesuai)");
        }
        else if ("tidak kokoh".equals(getKekokohan()) || "Tidak Kokoh".equals(getKekokohan())){
            System.out.println("Ruang Kelas Tidak Kokoh (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return super.getKekokohan();
    }

    @Override
    public String AnalisisKunciPintu() {
        //super.getKunciPintu();
        //System.out.print("kunci ruang kelas "+getKunciPintu());
        if ("ada".equals(getKunciPintu()) || "Ada".equals(getKunciPintu())){
            System.out.println("Kunci Pintu Ada (Sesuai)");
        }
        else if ("tidak ada".equals(getKunciPintu()) || "Tidak Ada".equals(getKunciPintu())){
            System.out.println("Kunci Pintu Tidak Ada(Tidak Sesuai)");
        }
        
        else{
            System.out.println("(Inputan Salah)");
        }
        return super.getKunciPintu();
    }

    @Override
    public String AnalisisJendela() {
        //super.getJendela();
        //System.out.print("jendela ruang kelas "+getJendela());
        if ("ada".equals(getJendela()) || "Ada".equals(getJendela())){
            System.out.println("Jendela Ruang Kelas Ada (Sesuai)");
        }
        else if ("tidak ada".equals(getJendela()) || "Tidak Ada".equals(getJendela())){
            System.out.println("Jendela Ruang Kelas Tidak Ada (Tidak Sesuai)");
        }    
        else {
            System.out.println("(Inputan Salah)");
        }
        return super.getJendela();
    }
    
    @Override
    public String AnalisisBahaya() {
        //super.getBahaya();
        //System.out.print("ruang kelas "+getBahaya());
        if ("aman".equals(getBahaya()) ||"Aman".equals(getBahaya())) {
            System.out.println("Ruang Kelas Aman (Sesuai)");
        }
        else if ("tidak aman".equals(getBahaya()) ||"Tidak Aman".equals(getBahaya())) {
            System.out.println("Ruang Kelas Tidak Aman (Tidak Sesuai)");
        }
        else {
            System.out.println("(Inputan Salah)");
        }
        return super.getBahaya();
        
    }
    
    @Override
    public void Output() {
        super.getKekokohan();
        super.getKunciPintu();
        super.getJendela();
        super.getBahaya();
    }

    
    
}
