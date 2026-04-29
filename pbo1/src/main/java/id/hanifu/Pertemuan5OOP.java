package id.hanifu;

import id.hanifu.pertemuan5oop.Mahasiswa;

public class Pertemuan5OOP {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "HANIF DWY PUTRA S.";
        mahasiswa1.nim = "10125905";
        mahasiswa1.kelas = "IF10K";
        mahasiswa1.golonganDarah = 'O';
        mahasiswa1.jenisKelamin = 'L';
        mahasiswa1.ipk = 4;
        mahasiswa1.prodi = "Teknik Informatika";

        Mahasiswa mahasiswa2;
        mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Sindy Putri Amalia";
        mahasiswa2.kelas = "IF10K";
        mahasiswa2.nim = "10125905";
        mahasiswa2.prodi = "Hukum";
        mahasiswa2.ipk = 3.7f;
        mahasiswa2.golonganDarah = 'O';
        mahasiswa2.jenisKelamin = 'P';


        // Using .isiDataProfil method
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.isiDataProfil(
                "Muhammad Hazmi Alfarizqi",
                "10125906",
                "IF10K",
                "Teknik Informatika",
                'L',
                'B',
                4
        );

        printMahasiswaDetail(mahasiswa1);
        printMahasiswaDetail(mahasiswa2);
        printMahasiswaDetail(mahasiswa3);

        // Using returned value from function
        float ipkMhs3 = mahasiswa3.getIpk();
        System.out.println("IPK Mahasiswa 3: " + ipkMhs3);
    }

    public static void printMahasiswaDetail(Mahasiswa mahasiswa) {
        System.out.println("Profil Mahasiswa");
        System.out.println("Nama Mahasiswa: " + mahasiswa.nama);
        System.out.println("NIM: " + mahasiswa.nim);
        System.out.println("Kelas: " + mahasiswa.kelas);
        System.out.println("Prodi: " + mahasiswa.prodi);
        System.out.println("Jenis Kelamin: " + mahasiswa.jenisKelamin);
        System.out.println("IPK: " + mahasiswa.ipk);
        System.out.println("\n"); // add whitespace to the console
    }
}
