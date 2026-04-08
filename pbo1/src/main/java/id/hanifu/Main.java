package id.hanifu;

public class Main {
    public static void main(String[] args) {
        byte thisByte = 100;
        short thisShort = 1000;
        int thisInteger = 10000;
        long thisLong = 100000000;
        long thisLong2 = 100000000L;

        Main.print("data byte", thisByte);
        Main.print("short", thisShort);
        Main.print("integer", thisInteger);
        Main.print("long", thisLong);
        Main.print("long2", thisLong2);
    }

    protected static void print(String id, long val) {
        System.out.printf("The value of %s is %d\n", id, val);
    }
}