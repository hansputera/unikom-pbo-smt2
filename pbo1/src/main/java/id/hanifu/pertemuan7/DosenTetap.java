package id.hanifu.pertemuan7;

public class DosenTetap extends Dosen
{
    public String nip;
    public long gaji;

    public void tampilkanProfil()
    {
        this.tampilkanData(); // just shortcut/reuse print nama, and prodi
        System.out.println("NIP: " + this.nip);
        System.out.println("Gaji: " + this.gaji);
        System.out.println("---------------------------");
    }
}
