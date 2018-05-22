package c.progmob.WorkoutPedia;

import android.os.Parcel;
import android.os.Parcelable;

public class WorkPediaMenu implements Parcelable {
    private String nama;
    private String deskripsi;
    private int gambar;
    private String url;


    public WorkPediaMenu() {
    }

    public WorkPediaMenu(String nama, String deskripsi, int gambar, String url) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.url = url;
    }

    protected WorkPediaMenu(Parcel in) {
        nama = in.readString();
        deskripsi = in.readString();
        gambar = in.readInt();
        url = in.readString();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        parcel.writeString(url);
    }
}