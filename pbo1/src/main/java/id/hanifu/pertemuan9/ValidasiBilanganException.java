package id.hanifu.pertemuan9;

public class ValidasiBilanganException extends Exception {
    public ValidasiBilanganException() {
        super("Nilai tidak valid (diluar 1 s/d 100)");
    }

    public ValidasiBilanganException(String message) {
        super(message);
    }

    public String infoNilaiDitolak() {
        return "Nilai yang anda masukan harus di antara 1-100";
    }
}
