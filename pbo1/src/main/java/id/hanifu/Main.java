package id.hanifu;

public class Main {
    public static void main(String[] args) {
        // Numbers
        byte thisByte = 100;
        short thisShort = 1000;
        int thisInteger = 10000;
        long thisLong = 100000000;
        long thisLong2 = 100000000L;
        float thisFloat = 10.10f;
        double thisDouble = 20.20;

        Main.print("data byte", thisByte);
        Main.print("short", thisShort);
        Main.print("integer", thisInteger);
        Main.print("long", thisLong);
        Main.print("long2", thisLong2);
        Main.print("float", (long) thisFloat);
        Main.print("double", (long) thisDouble);

        // Booleans
        boolean thisBool = true;
        boolean thisBool2 = false;

        System.out.println("Bool " + thisBool);
        System.out.println("Bool 2 " + thisBool2);

        // Chars
        char abjad = 'P';
        System.out.println("Char " + abjad);

        abjad = 'E';
        System.out.println("Char (changed) " + abjad);

        // Numbers (reassign)
        thisByte = 50;
        Main.print("data byte", thisByte);

        // Strings
        String firstName = "Hanif Dwy";
        String lastName = "Putra S";

        System.out.printf("Nama depan: %s\nNama Belakang: %s\n", firstName, lastName);

        // usecase
        Main.salariesUsecase();

        // Logics
        boolean t = true;
        boolean f = false;

        boolean logic;

        logic = t && f;
        System.out.println("Logic result: " + logic);

        logic = t || f;
        System.out.println("Logic result: " + logic);
    }

    private static void salariesUsecase() {
        long salary = 3000000;
        long tunjangan = 2500;
        long total;

        total = salary + tunjangan;
        System.out.println("Total: " + total);

        total = salary - tunjangan;
        System.out.println("Total: " + total);

        total = salary * tunjangan;
        System.out.println("Total: " + total);

        total = salary / tunjangan;
        System.out.println("Total: " + total);

        total = salary % tunjangan;
        System.out.println("Total: " + total);

        System.out.println("Total: " + total);

        salary++;
        System.out.println("Salary: " + salary);

        boolean relation_result;
        relation_result = salary == tunjangan;
        System.out.println("Hasil relasi: " + relation_result);

        relation_result = salary != tunjangan;
        System.out.println("Hasil relasi: " + relation_result);
    }

    protected static void print(String id, long val) {
        System.out.printf("The value of %s is %d\n", id, val);
    }
}