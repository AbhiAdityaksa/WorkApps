package c.progmob.WorkoutPedia;

public class WorkPediaMenu {
    private String nama;
    private String deskripsi;
    private int gambar;


    public WorkPediaMenu() {
    }

    public WorkPediaMenu(String Nama, String Deskripsi, int Gambar) {
        nama = Nama;
        deskripsi = Deskripsi;
        gambar = Gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}