package com.Latihan;

class mahasiswa {
    String Nama;
    int NIS;
    String Jurusan;
    int umur;

    // Constructor

    /*
     * mahasiswa() { System.out.println("Ini adalah Constructor"); }
     * 
     * Constructor dengan parameter
     */

    mahasiswa(String inputnama, int inputNIS, String inputJurusan, int inputumur) {
        Nama = inputnama;
        NIS = inputNIS;
        Jurusan = inputJurusan;
        umur = inputumur;

        System.out.println("Nama : " + Nama);
        System.out.println("NIS : " + NIS);
        System.out.println("Jurusan : " + Jurusan);
        System.out.println("umur : " + umur);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        mahasiswa mahasiswa1 = new mahasiswa("Azriel", 11908078, "RPL", 16);
        System.out.println("\n");
        mahasiswa mahasiswa2 = new mahasiswa("Puja Maulida", 11908076, "RPL", 15);
        System.out.println("\n");
        mahasiswa mahasiswa3 = new mahasiswa("Ika Roro", 11907877, "RPL", 16);
        System.out.println("\n");
        mahasiswa mahasiswa4 = new mahasiswa("Alfi", 11907766, "RPL", 16);

        // new mahasiswa();
    }
}
