package id.hanifu;

// Pertemuan 3 - If else statement

public class IfElseStatement {
    public static void main(String[] args) {
        byte nilai = 65;

        System.out.println("Nilai = " + nilai);
        // statement > 30
        if (nilai > 30) {
            System.out.println("Nilai lebih dari 30");
        }

        // Reassign nilai variable to define new scope proceed
        nilai = 40;
        // statement > 30
        if (nilai > 30) {
            System.out.println("Dapat bonus");
        } else {
            System.out.println("Tidak dapat bonus");
        }

        // statement >2 conditions
        if (nilai > 80) {
            System.out.println("Index = A");
        } else if (nilai > 70) {
            System.out.print("Index = B");
        } else if (nilai > 60) {
            System.out.println("Index = C");
        } else if (nilai > 50) {
            System.out.println("Index = D");
        } else {
            System.out.println("Index = E");
        }
    }
}
