package id.hanifu.pertemuan7;

public class Pewarisan {
    public static void main(String[] args)
    {
        Dosen dosen = new Dosen("Donny Reza", "Tenik Informatika");
        dosen.tampilkanData();

        DosenTetap dosenTetap = new DosenTetap("Dadi Rosadi", "Teknik Informatika");
        dosenTetap.nip = "111-222-333";
        dosenTetap.gaji = 7000000;

        dosenTetap.tampilkanProfil();

        DosenLayanan dosenLayanan = new DosenLayanan("Angga", "Ilmu Hukum");
        dosenLayanan.honorSks = 200000000;
        dosenLayanan.homebase = "Institut Teknologi Bandung";

        dosenLayanan.tampilkanProfil();
    }
}
