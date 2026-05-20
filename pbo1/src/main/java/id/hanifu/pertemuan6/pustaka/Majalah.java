package id.hanifu.pertemuan6.pustaka;

public class Majalah {
    private String nama;
    private String bulan;
    private int tahun;


    public String getNamaProperties()
    {
        return this.nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getBulanProperties()
    {
        return this.bulan;
    }

    public void setBulan(String bulan)
    {
        this.bulan = bulan;
    }

    public int getTahunProperties()
    {
        return this.tahun;
    }

    public void setTahun(int tahun)
    {
        this.tahun = tahun;
    }

    public void setData(String nama)
    {
        this.nama = nama;
    }

    public void setData(String nama, String bulan)
    {
        this.nama = nama;
        this.bulan = bulan;
    }

    public void setData(String nama, String bulan, int tahun)
    {
        this.nama = nama;
        this.bulan = bulan;
        this.tahun = tahun;
    }
}
