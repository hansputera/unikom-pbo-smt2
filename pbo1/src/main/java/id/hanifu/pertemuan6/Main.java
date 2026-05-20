package id.hanifu.pertemuan6;

import id.hanifu.pertemuan6.pustaka.Buku;
import id.hanifu.pertemuan6.pustaka.Majalah;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Buku buku = new Buku();

        buku.judul = "Web Development";
        buku.isbn = "1234-7890-90";
        buku.author = "Onno W. Purbo";
        buku.halaman = 459;

        System.out.println("Judul Buku: " + buku.judul);

        Majalah majalah = new Majalah();
//        majalah.setNama("Info Komputer");
//        majalah.setBulan("Mei");
//        majalah.setTahun(2026);

        majalah.setData("Info Komputer");
        majalah.setData("Info Komputer", "Mei");
        majalah.setData("Info Komputer", "Mei", 2001);

        System.out.println("Nama Majalah : " + majalah.getNamaProperties());
        System.out.println("Bulan Terbit : " + majalah.getBulanProperties());
        System.out.println("Tahun : " + majalah.getTahunProperties());

        buku = new Buku("A", "B", "C", 2001);
        System.out.println("Judul Buku: " + buku.judul);

        Majalah m3 = new Majalah();
        Scanner scandata = new Scanner(System.in);
        System.out.println("Isikan data majalah");
        System.out.println("Nama Majalah: ");
        m3.setNama(scandata.nextLine());
        System.out.println("Bulan: ");
        m3.setBulan(scandata.nextLine());
        System.out.println("Tahun: ");
        m3.setTahun(scandata.nextInt());

        System.out.println(m3);
    }
}
