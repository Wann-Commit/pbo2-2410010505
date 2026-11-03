/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08.uts;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * NAMA : Muhammad Raka Wisudawan Abhar
 * NPM  : 2410010505
 * 
 */
public class NilaiTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf" };
    private final List<Nilai> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Nilai n = daftar.get(baris);
        return switch (kolom) {
            case 0 ->
                n.npm();
            case 1 ->
                n.nama();
            case 2 ->
                n.tugas();
            case 3 ->
                n.uts();
            case 4 ->
                n.uas();
            case 5 ->
                n.akhir();
            default ->
                n.huruf();
        };
    }

    public Nilai get(int baris) {
        return daftar.get(baris);
    }

    public void simpan(Nilai nilai) {
        daftar.add(nilai);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris); // tampilkan baris baru 
    }

    public void bersihkan(int baris) {
        daftar.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }
}
