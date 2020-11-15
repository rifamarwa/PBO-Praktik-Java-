package com.overloading;

public class Main{
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Annabeth");
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa("Badrun");
        Mahasiswa mhs4 = new Mahasiswa();

        mhs1.show();
        mhs2.show();
        mhs3.show();
        mhs4.show();
    }
}