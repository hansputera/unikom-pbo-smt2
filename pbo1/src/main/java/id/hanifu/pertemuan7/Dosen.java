package id.hanifu.pertemuan7;

public class Dosen {
    public String nama;
    public String prodi;
    public String type = "dosen";

    public Dosen(String nama, String prodi)
    {
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilkanData()
    {
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);
    }
}
