package c.progmob.WorkoutPedia;

import android.os.Parcel;
import android.os.Parcelable;

public class WorkPediaMenu implements Parcelable {
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

    protected WorkPediaMenu(Parcel in) {
        nama = in.readString();
        deskripsi = in.readString();
        gambar = in.readInt();
    }

    public static final Creator<WorkPediaMenu> CREATOR = new Creator<WorkPediaMenu>() {
        @Override
        public WorkPediaMenu createFromParcel(Parcel in) {
            return new WorkPediaMenu(in);
        }

        @Override
        public WorkPediaMenu[] newArray(int size) {
            return new WorkPediaMenu[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(deskripsi);
        parcel.writeInt(gambar);
    }
}