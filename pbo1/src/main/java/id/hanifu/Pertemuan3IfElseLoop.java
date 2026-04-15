package id.hanifu;

// Pertemuan 3 - If else statement

public class Pertemuan3IfElseLoop {
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

        // Switch case
        nilai = 3;
        switch (nilai) {
            case 1:
                System.out.println("Nilai = 1");
                break;
            case 2:
                System.out.println("Nilai = 2");
                break;
            case 3:
                System.out.println("Nilai = 3");
                break;
            default:
                System.out.println("Tidak tahu Nilai");
        }


        // Looping
        for (byte i = 1; i <= 10; i++)
        {
            System.out.println("Nilai i = " + i);
        }

        // Looping descending
        for (byte j = 10; j >= 1; j--) {
            System.out.println("Nilai j = " + j);
        }


        // While
        byte m = 1;
        while(m <= 10)
        {
            System.out.println("Nilai m = " + m);
            m++;
        }

        // Do while
        byte n = 1;
        do {
            System.out.println("Nilai n = " + n);
            n++;
        } while(n <= 10);
    }
}
