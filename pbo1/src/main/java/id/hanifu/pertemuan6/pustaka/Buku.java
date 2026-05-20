package id.hanifu.pertemuan6.pustaka;

public class Buku {
    public String judul;
    public String isbn;
    public String author;
    public int halaman;

    public Buku() {}
    public Buku(String judul, String isbn, String author, int halaman)
    {
        this.judul = judul;
        this.isbn = isbn;
        this.author = author;
        this.halaman = halaman;
    }
}
