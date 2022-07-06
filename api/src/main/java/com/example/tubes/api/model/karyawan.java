package com.example.tubes.api.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "karyawan")
public class karyawan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nama, posisi, gender;
    private Date tgl_lahir;

    public karyawan() {
    }

    public karyawan(String nama, String posisi, String gender, Date tgl_lahir) {
        this.nama = nama;
        this.posisi = posisi;
        this.gender = gender;
        this.tgl_lahir = tgl_lahir;
    }

    public int getId() {return id;}

    public String getNama() {return nama;}
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {return posisi;}
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getGender() {return gender;}
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getTgl_lahir() {return tgl_lahir;}
    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }
}
