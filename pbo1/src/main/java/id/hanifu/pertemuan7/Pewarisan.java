package id.hanifu.pertemuan7;

public class Pewarisan {
    public static void main(String[] args)
    {
        Dosen dosen = new Dosen("Donny Reza");
        dosen.prodi = "Teknik Informatika";

        dosen.tampilkanData();

        DosenTetap dosenTetap = new DosenTetap("Dadi Rosadi");
        dosenTetap.prodi = "Teknik Informatika";

        dosenTetap.nip = "111-222-333";
        dosenTetap.gaji = 7000000;

        dosenTetap.tampilkanProfil();

        DosenLayanan dosenLayanan = new DosenLayanan("Angga");
        dosenLayanan.prodi = "Ilmu Hukum";
        dosenLayanan.honorSks = 200000000;
        dosenLayanan.homebase = "Institut Teknologi Bandung";

        dosenLayanan.tampilkanProfil();
    }
}
