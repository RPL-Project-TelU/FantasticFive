/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_hotel;

import java.util.Date;

/**
 *
 * @author Rashaad
 */
public class Karyawan {
    String nama;
    String posisi;
    String gender;
    Date tglLahir;

    public Karyawan(String nama, String posisi, String gender, Date tglLahir) {
        this.nama = nama;
        this.posisi = posisi;
        this.gender = gender;
        this.tglLahir = tglLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
}
