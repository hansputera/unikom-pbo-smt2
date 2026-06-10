package id.hanifu.pertemuan9;

import java.util.Scanner;

public class Kalkulator {
    public int bilangan1;
    public int bilangan2;

    public void inputBilangan()
    {
        Scanner inBilangan = new Scanner(System.in);
        System.out.print("Bilangan ke-1: ");
        this.bilangan1 = inBilangan.nextInt();

        System.out.print("Bilangan ke-2: ");
        this.bilangan2 = inBilangan.nextInt();
    }

    public double operasiPembagian()
    {
        return this.bilangan1 / this.bilangan2;
    }

    public void tampilkanHasilBagi()
    {
        System.out.println("Hasil bagi: " + this.operasiPembagian());
    }
}
