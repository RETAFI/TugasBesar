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
public class IdentitasRuangKelas extends IdentitasRuangKelasSG{
    Scanner fik = new Scanner (System.in);
    public IdentitasRuangKelas(String NamaRuang, String LokasiRuang, String Fakultas) {
        super(NamaRuang, LokasiRuang, Fakultas);
    }

    @Override
    public void Input() {
        System.out.print("Masukkan Nama Ruang Kelas : ");
        super.setNamaRuang(fik.nextLine());
        System.out.print("Masukkan Lokasi Ruang Kelas : ");
        super.setLokasiRuang(fik.nextLine());
        System.out.print("Masukkan Fakultas : ");
        super.setFakultas(fik.nextLine());
        System.out.print("\n");
    }

    @Override
    public void Output() {
        System.out.println("Nama Ruang Kelas "+getNamaRuang());
        System.out.println("Lokasi Ruang Berada di "+getLokasiRuang());
        System.out.println("Fakultas "+getFakultas());
    }
    
}
