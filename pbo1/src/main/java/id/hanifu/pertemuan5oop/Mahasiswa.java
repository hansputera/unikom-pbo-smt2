package id.hanifu.pertemuan5oop;

public class Mahasiswa {
    public String nama;
    public String nim;
    public String kelas;
    public String prodi;

    public char jenisKelamin;
    public char golonganDarah;
    public float ipk;

    public void isiDataProfil(String pNama, String pNim, String pKelas, String pProdi, char cJenisKelamin, char cGolonganDarah, float fIpk)
    {
        this.nama = pNama;
        this.nim = pNim;
        this.kelas = pKelas;
        this.prodi = pProdi;
        this.jenisKelamin = cJenisKelamin;
        this.golonganDarah = cGolonganDarah;
        this.ipk = fIpk;
    }

    public float getIpk()
    {
        return this.ipk;
    }
}
