package id.hanifu.pertemuan7;

public class DosenLayanan extends Dosen {
    public int honorSks;
    public String homebase;
    public String type = "Dosen Layanan";

    public void tampilkanProfil()
    {
        this.tampilkanData();
        System.out.println("Honor SKS: " + this.honorSks);
        System.out.println("Type: " + super.type);
        System.out.println("Type Khusus: " + this.type);
        System.out.println("Homebase: " + this.homebase);
        System.out.println("--------------------------------");
    }
}
