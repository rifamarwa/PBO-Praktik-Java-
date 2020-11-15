package com.overloading;

public class Mahasiswa {
    private String nama;
    private static int jmlMahasiswa;

    Mahasiswa(String nama) {
        Mahasiswa.jmlMahasiswa++;
        this.nama = nama;
    }

    Mahasiswa() {
        Mahasiswa.jmlMahasiswa++;
        this.nama = "Mahasiswa " + Mahasiswa.jmlMahasiswa;
    }

    void show() {
        System.out.println("Nama : " + this.nama);
    }
}
