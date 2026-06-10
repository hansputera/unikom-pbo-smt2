package id.hanifu.pertemuan9;

import java.util.InputMismatchException;

public class Main
{
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        try {
            // Scanner inputBilangan = new Scanner(System.in);
            
            // System.out.println("Masukan 2 buah bilangan");
            // System.out.println("=================");
            
            // System.out.println("Bilangan ke-1: ");
            // int bil1 = inputBilangan.nextInt();

            // System.out.println("Bilangan ke-2: ");
            // int bil2 = inputBilangan.nextInt();

            // double hasilBagi = bil1 / bil2;
            // System.out.println("\n Hasil Bagi Bilangan: " + hasilBagi);

            kalkulator.inputBilangan();
            kalkulator.tampilkanHasilBagi();
        } catch (InputMismatchException exception) {
            System.out.println("Type data yang diinput tidak sesuai: " + exception);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Programa aritmetika error: " + arithmeticException);
        }

        System.out.println("Program ditutup normal");
    }
}