package id.hanifu.pertemuan9;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        try {
            Scanner inputBilangan = new Scanner(System.in);
            
            System.out.println("Masukan 2 buah bilangan");
            System.out.println("=================");
            
            System.out.println("Bilangan ke-1: ");
            int bil1 = inputBilangan.nextInt();

            System.out.println("Bilangan ke-2: ");
            int bil2 = inputBilangan.nextInt();

            double hasilBagi = bil1 / bil2;
            System.out.println("\n Hasil Bagi Bilangan: " + hasilBagi);
        } catch (Exception exception) {
            System.out.println("Terjadi error: " + exception);
        }

        System.out.println("Program ditutup normal");
    }
}